package fr.kira.archi.hexa.equipes.logics;

import fr.kira.archi.hexa.equipes.entities.Equipe;
import fr.kira.archi.hexa.equipes.ports.input.RecuperationEquipesInputPort;

import java.util.ArrayList;
import java.util.List;

public class RecuperationEquipeLogique implements RecuperationEquipesInputPort {

    @Override
    public List<Equipe> recupererEquipes() {
        return new ArrayList<>();
    }

    @Override
    public Equipe recupererEquipe(String id) {
        return null;
    }
}
