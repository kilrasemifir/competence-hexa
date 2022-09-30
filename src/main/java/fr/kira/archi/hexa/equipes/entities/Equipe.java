package fr.kira.archi.hexa.equipes.entities;


import java.util.List;

public class Equipe {
    private String id;
    private String nom;

    private List<Personne> personnes;

    public Equipe(String id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
}
