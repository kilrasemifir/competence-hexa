package fr.kira.archi.hexa.equipes.logics;

import fr.kira.archi.hexa.equipes.entities.Equipe;
import fr.kira.archi.hexa.equipes.ports.input.EquipeInputPort;
import fr.kira.archi.hexa.equipes.ports.input.RecuperationEquipesInputPort;
import fr.kira.archi.hexa.equipes.ports.input.SauvegardeEquipeInputPort;
import fr.kira.archi.hexa.equipes.ports.output.EquipeDatasourceOutputPort;
import fr.kira.archi.hexa.equipes.ports.output.RecuperatuinEquipeOutputPort;
import fr.kira.archi.hexa.equipes.ports.output.SauvegardeEquipeOutputPort;

import java.util.List;

public class EquipeLogique implements EquipeInputPort {

    private EquipeDatasourceOutputPort datasource;

    public EquipeLogique(EquipeDatasourceOutputPort datasource) {
        this.datasource = datasource;
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
}
