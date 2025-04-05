package tests;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import app.Coin;
import app.CoinTossGame;
import app.Player;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Tests_Class")
public class Tests {
    @Test
    @Order(1)
    @DisplayName("Check whether player 2 Guess is selected automatically as 'T', When Player 1 selects 'H'")
    void testAdd() {

        String input = "H";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        CoinTossGame.main(new String[]{});

        boolean expectedOutput = true;
        assertEquals(expectedOutput, outContent.toString().contains("Player 2 - Guess is : T"));

    }

    @Test
    @Order(2)
    @DisplayName("Check whether player 2 Guess is selected automatically as 'H', When Player 1 selects 'T'")
    void testGetInput() {

        String input = "T";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        CoinTossGame.main(new String[]{});

        boolean expectedOutput = true;
        assertEquals(expectedOutput, outContent.toString().contains("Player 2 - Guess is : H"));

    }
}
