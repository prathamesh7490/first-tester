package org.example;

public class MethodChallenge {
    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition(" Tim " ,highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition(" bob " ,highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition(" mark " ,highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition(" Joie " ,highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition(" Judie " ,highScorePosition);

    }


    public static void displayHighScorePosition(String PlayerName, int highScorePosition) {
        System.out.println(PlayerName + " Managed to get Position " + highScorePosition + " on the highScoreList ");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if ((playerScore >= 500) && (playerScore <= 1000)) {
            return 2;

        } else if ((playerScore >= 100) && (playerScore <= 500)) {
            return 3;

        } else {
            return 4;
        }


    }
}
