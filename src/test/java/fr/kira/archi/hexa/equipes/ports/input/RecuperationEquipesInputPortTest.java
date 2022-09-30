package fr.kira.archi.hexa.equipes.ports.input;

import fr.kira.archi.hexa.equipes.logics.RecuperationEquipeLogique;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecuperationEquipesInputPortTest {

    @Test()
    @DisplayName("Lors de la récupération des équipes, la liste des équipes est retournée")
    void recuperationEquipesListeEquipes() {
        RecuperationEquipesInputPort logique = new RecuperationEquipeLogique();
        assertNotNull(logique.recupererEquipes());
    }

}