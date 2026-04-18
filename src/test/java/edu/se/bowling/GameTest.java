package edu.se.bowling;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

    @Test
    void gutterGameScoresZero(){
        Game game = new Game();

        for (int i = 0; i < 20; i++){
            game.roll(0);
        }

        assertEquals(0, game.score());
    }

    @Test
    void allOnesScoresTwenty(){

        Game game = new Game();

        for (int i = 0; i < 20; i++){
            game.roll(1);
        }

        assertEquals(20, game.score());
    }

    @Test
    void oneSpareScoresSixteen(){
        Game game = new Game();
        game.roll(5);
        game.roll(5);
        game.roll(3);

        for (int i = 0; i < 17; i++){
            game.roll(0);
        }

        assertEquals(16, game.score());
    }

    @Test
    void oneStrikeScoresThirty() {
        Game game = new Game();
        game.roll(10);
        game.roll(3);
        game.roll(4);
        for (int i = 0; i < 16; i++) {
            game.roll(0);
        }
        assertEquals(24, game.score());
    }
}
