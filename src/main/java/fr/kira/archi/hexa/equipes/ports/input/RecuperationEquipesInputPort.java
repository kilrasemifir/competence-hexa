package fr.kira.archi.hexa.equipes.ports.input;

import fr.kira.archi.hexa.equipes.entities.Equipe;

import java.util.List;

/**
 * InputPort pour la récupération des équipes
 */
public interface RecuperationEquipesInputPort {

    /**
     * Récupère la liste des équipes
     * @return  la liste des équipes
     */
    public List<Equipe> recupererEquipes();

    /**
     * Récupère une équipe par son identifiant
     * @param id    l'identifiant de l'équipe
     * @return      l'équipe
     */
    public Equipe recupererEquipe(String id);
}
