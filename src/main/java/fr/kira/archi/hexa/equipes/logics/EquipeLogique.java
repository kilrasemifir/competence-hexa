package fr.kira.archi.hexa.equipes.logics;

import fr.kira.archi.hexa.equipes.entities.Equipe;
import fr.kira.archi.hexa.equipes.entities.Personne;
import fr.kira.archi.hexa.equipes.ports.input.EquipeInputPort;
import fr.kira.archi.hexa.equipes.ports.output.EquipeOutputPort;
import fr.kira.archi.hexa.equipes.ports.output.PersonneOutputPort;

import java.util.List;

public class EquipeLogique implements EquipeInputPort {

    private EquipeOutputPort datasource;
    private PersonneOutputPort personneOutputPort;

    public EquipeLogique(
            EquipeOutputPort datasource,
            PersonneOutputPort personneOutputPort) {
        this.datasource = datasource;
        this.personneOutputPort = personneOutputPort;
    }
    @Override
    public List<Equipe> recupererEquipes() {
        return this.datasource.recupererEquipes();
    }

    @Override
    public Equipe recupererEquipe(String id) {
        return this.datasource.recupererEquipe(id);
    }

    @Override
    public Equipe sauvegarderEquipe(Equipe equipe) {
        if (equipe.getNom() == null || equipe.getNom().isEmpty()) {
            throw new IllegalArgumentException("Le nom de l'équipe ne peut pas être vide");
        }
        return this.datasource.sauvegarderEquipe(equipe);
    }

    @Override
    public Equipe ajouterPersonneAEquipe(String idEquipe, Personne personne) {
        Equipe equipe = this.datasource.recupererEquipe(idEquipe);
        Personne nouvellePersonne = this.personneOutputPort.sauvegarderPersonne(personne);
        equipe.getPersonnes().add(nouvellePersonne);
        return this.datasource.sauvegarderEquipe(equipe);
    }
}
