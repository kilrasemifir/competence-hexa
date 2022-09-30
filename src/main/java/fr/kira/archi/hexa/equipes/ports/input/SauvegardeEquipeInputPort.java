package fr.kira.archi.hexa.equipes.ports.input;

import fr.kira.archi.hexa.equipes.entities.Equipe;
import fr.kira.archi.hexa.equipes.entities.Personne;

public interface SauvegardeEquipeInputPort {
    /**
     * Sauvegarde une équipe
     * @param equipe    l'équipe à sauvegarder
     * @return          l'équipe sauvegardée
     */
    Equipe sauvegarderEquipe(Equipe equipe);

    Equipe ajoutPersonne(Personne personne);
}
