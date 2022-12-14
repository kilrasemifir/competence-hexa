package fr.kira.archi.hexa.equipes.ports.input;

import fr.kira.archi.hexa.equipes.entities.Equipe;
import fr.kira.archi.hexa.equipes.entities.Personne;
import fr.kira.archi.hexa.equipes.logics.EquipeLogique;
import fr.kira.archi.hexa.equipes.ports.output.EquipeOutputPort;
import fr.kira.archi.hexa.equipes.ports.output.PersonneOutputPort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class SauvegardeEquipeInputPortTest {
    private static EquipeInputPort logique;
    private static EquipeOutputPort datasourceOutputPort;
    private static PersonneOutputPort personneOutputPort;
    @BeforeEach
    void setUp() {
        datasourceOutputPort = Mockito.mock(EquipeOutputPort.class);
        personneOutputPort = Mockito.mock(PersonneOutputPort.class);
        logique = new EquipeLogique(datasourceOutputPort, personneOutputPort);
    }
    @Test
    @DisplayName("Lors de la sauvegarde d'une équipe, il fait l'appel a la datasource pour sauvegarder l'équipe")
    void sauvegarderEquipe() {
        //Given
        Equipe equipe = new Equipe("1","Equipe 1");
        //When
        logique.sauvegarderEquipe(equipe);
        //Then
        Mockito.verify(datasourceOutputPort).sauvegarderEquipe(equipe);
    }

    @Test
    @DisplayName("Lors de la sauvegarde d'une équipe, quand le nom n'est pas fournit, retourne une exception")
    void sauvegarderEquipeNomNonFournit() {
        //Given
        Equipe equipe = new Equipe("1","");
        //When
        //Then
        assertThrows(IllegalArgumentException.class, () -> logique.sauvegarderEquipe(equipe));
    }

    @Test
    @DisplayName("Lors de l'ajout dune nouvelle personne a l'équipe, il fait l'appel a la datasource pour sauvegarder l'équipe")
    void ajouterPersonneAEquipe() {
        //Given
        Equipe equipe = new Equipe("1","Equipe 1");
        Personne personne = new Personne();
        //When
//        logique.ajouterPersonneAEquipe(equipe.getId(),personne);
        //Then
        // Mockito.verify(datasourceOutputPort).sauvegarderEquipe(equipe);
    }
}