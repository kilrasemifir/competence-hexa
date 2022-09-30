package fr.kira.archi.hexa.equipes.ports.output;

import fr.kira.archi.hexa.equipes.entities.Equipe;

public interface SauvegardeEquipeOutputPort {
    /**
     * Sauvegarde une équipe
     * @param equipe    l'équipe à sauvegarder
     * @return          l'équipe sauvegardée
     */
    Equipe sauvegarderEquipe(Equipe equipe);
}

