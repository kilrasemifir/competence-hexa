package fr.kira.archi.hexa.equipes.ports.output;

import fr.kira.archi.hexa.equipes.entities.Equipe;

import java.util.List;

public interface EquipeOutputPort {

    List<Equipe> recupererEquipes();

    Equipe recupererEquipe(String id);
    /**
     * Sauvegarde une équipe
     * @param equipe    l'équipe à sauvegarder
     * @return          l'équipe sauvegardée
     */
    Equipe sauvegarderEquipe(Equipe equipe);
}
