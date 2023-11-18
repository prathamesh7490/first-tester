package org.example;

public class MainNewChallenge {
    public static void main(String[] args) {



        int highscore = calculateScore(true ,800, 5 ,100);
        System.out.println("the high score is " + highscore);

        System.out.println("the next high score is "
                + calculateScore(true ,10000, 8 ,200));

    }
    public static int calculateScore(boolean gameover,int score,int levelcompleted,int bonus)
    {

        int finalscore = score;

        if (gameover) {
            finalscore += (levelcompleted * bonus);
            finalscore += 1000;
        }
    return finalscore;
    }

}
