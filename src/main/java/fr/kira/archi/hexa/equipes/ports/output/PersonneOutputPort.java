package fr.kira.archi.hexa.equipes.ports.output;

import fr.kira.archi.hexa.equipes.entities.Personne;

public interface PersonneOutputPort {

    Personne sauvegarderPersonne(Personne personne);
}
