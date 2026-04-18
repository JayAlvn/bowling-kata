package edu.se.bowling;


public class Game {

    private int[] rolls = new int[21];
    private int currentRoll = 0;


    public void roll(int pins) {
        if (pins < 0) {
            throw new IllegalArgumentException("Pins cannot be negative");
        }
        if (pins > 10) {
            throw new IllegalArgumentException("Pins cannot exceed 10");
        }
        if (currentRoll >= 20) {
            throw new IllegalArgumentException("Too many rolls");
        }
        rolls[currentRoll++] = pins;
    }

    public int score() {
        int score = 0;
        int rollIndex = 0;

        for (int frame = 0; frame < 10; frame++) {
            if (rolls[rollIndex] == 10) {

                score += 10 + rolls[rollIndex + 1] + rolls[rollIndex + 2];
                rollIndex += 1;
            } else if (rolls[rollIndex] + rolls[rollIndex + 1] == 10) {

                score += 10 + rolls[rollIndex + 2];
                rollIndex += 2;
            } else {
                score += rolls[rollIndex] + rolls[rollIndex + 1];
                rollIndex += 2;
            }
        }
        return score;
    }

}
