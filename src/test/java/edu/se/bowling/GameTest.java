package edu.se.bowling;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

    @Test

    void gutterGameScoresZero(){
        Game game = new Game();

        for (int i = 0; i < 20; i++){
            game.roll();
        }

        assertEquals(0, game.score());
    }
}
