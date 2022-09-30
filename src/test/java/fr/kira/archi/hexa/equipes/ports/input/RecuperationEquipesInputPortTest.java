package fr.kira.archi.hexa.equipes.ports.input;

import fr.kira.archi.hexa.equipes.logics.EquipeLogique;
import fr.kira.archi.hexa.equipes.ports.output.EquipeDatasourceOutputPort;
import fr.kira.archi.hexa.equipes.ports.output.PersonneOutputPort;
import fr.kira.archi.hexa.equipes.ports.output.RecuperatuinEquipeOutputPort;
import fr.kira.archi.hexa.equipes.ports.output.SauvegardeEquipeOutputPort;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class RecuperationEquipesInputPortTest {

    private static EquipeInputPort logique;
    private static EquipeDatasourceOutputPort datasourceOutputPort;
    private static PersonneOutputPort personneOutputPort;
    @BeforeEach
    void setUp() {
        datasourceOutputPort = Mockito.mock(EquipeDatasourceOutputPort.class);
        personneOutputPort = Mockito.mock(PersonneOutputPort.class);
        logique = new EquipeLogique(datasourceOutputPort, personneOutputPort);
    }
    @Test()
    @DisplayName("Lors de la récupération des équipes, la liste des équipes est retournée")
    void recuperationEquipesListeEquipes() {

        assertNotNull(logique.recupererEquipes());
    }

    @Test
    @DisplayName("Lors de la récupération des équipe, il fait l'appel a la datasource pour récupérer les équipes")
    void recuperationEquipe() {
        //Given

        //When
        logique.recupererEquipes();
        //Then
        Mockito.verify(datasourceOutputPort).recupererEquipes();
    }

    @Test
    @DisplayName("Lors de la récupération d'une équipe, il fait l'appel a la datasource pour récupérer l'équipe")
    void recuperationEquipeParId() {
        //Given

        //When
        logique.recupererEquipe("1");
        //Then
        Mockito.verify(datasourceOutputPort).recupererEquipe("1");
    }

}