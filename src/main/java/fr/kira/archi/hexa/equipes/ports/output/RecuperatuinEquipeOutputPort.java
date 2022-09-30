package fr.kira.archi.hexa.equipes.ports.output;

import fr.kira.archi.hexa.equipes.entities.Equipe;

import java.util.List;

public interface RecuperatuinEquipeOutputPort {

    List<Equipe> recupererEquipes();

    Equipe recupererEquipe(String id);
}
