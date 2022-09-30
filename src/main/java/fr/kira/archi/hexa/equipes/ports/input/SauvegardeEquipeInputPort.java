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

    /**
     * Ajoute une personne à une équipe
     * @param idEquipe    l'équipe à laquelle ajouter la personne
     * @param personne  la personne à ajouter
     * @return          l'équipe avec la personne ajoutée
     */
    Equipe ajouterPersonneAEquipe(String idEquipe, Personne personne);
}
