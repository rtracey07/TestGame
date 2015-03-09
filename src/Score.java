/** Score class reads and writes scores stored in score.txt.  */

import java.io.*;
import java.util.*;

public class Score {

    //Container for scores.
    private int[] scores = new int[6];

    /** Constructor reads initial values stored in score.txt */
    public Score(){

        File score = new File("score.txt");

        //Read values from score.txt and store them into scores Array.
        try {
            Scanner sc = new Scanner(score);

            for (int i = 0; i < scores.length; i++)
                scores[i] = sc.nextInt();
            sc.close();
        }
        catch (IOException error){
            clearScore();
        }
    }

    /** checkQuiz checks Pop Quiz high score.
     * If user's score is higher than high score it writes to file.
     * @param quiz User's Pop Quiz score.
     * @return boolean Based on comparison to current high score. */
    public boolean checkQuiz(int quiz, int operator){

        //Catch out of bounds exceptions.
        if (operator > 6 || operator < 0)
            return false;

        //Returns false if user's Pop Quiz score is <= high score.
        if(quiz <= scores[operator])
            return false;

        scores[operator] = quiz;
        saveScore();

        return true;
    }

    /** getQuiz returns Pop Quiz high score
     * @return scores[0] Container for Pop Quiz score. */
    public int getQuiz(int operator){

        try {
            return scores[operator];
        }
        catch(ArrayIndexOutOfBoundsException error){
            error.printStackTrace();
            return -1;
        }
    }

    /** checkMarathon checks Marathon high score.
     * If user's score is higher than high score it writes to file.
     * @param marathon User's Marathon score.
     * @return boolean Based on comparison to current high score.  */
    public boolean checkMarathon(int marathon){

        //Returns false if user's Marathon score is <= high score.
        if(marathon <= scores[5])
            return false;

        scores[5] = marathon;
        saveScore();

        return true;
    }

    /** getMarathon returns Marathon high score.
     *  @return scores[1] Score container for Marathon */
    public int getMarathon(){

        return scores[5];
    }

    /** clearScore overwrites all scores with 0 values */
    public void clearScore(){

        for (int i=0; i<scores.length; i++ )
            scores[i] = 0;

        //Overwrites all scores in document with 0.
        try {
            PrintWriter score = new PrintWriter("score.txt");
            for (int i=0; i<scores.length; i++ )
                score.println(scores[i]);

            score.close();
        }
        catch (IOException error){
            error.printStackTrace();
        }
    }

    /** saveScore writes all scores to score.txt */
    private void saveScore(){

        try {
            PrintWriter score = new PrintWriter("score.txt");
            for (int i=0; i<scores.length; i++)
                score.println(scores[i]);
            score.close();
        }
        catch (IOException error){
            error.printStackTrace();
        }
    }
    /** secretScore used to confirm conditions for 'Top Secret Banana' Easter Egg.
     *  @return boolean Based on if conditions for Easter Egg are met. */
    public boolean secretScore(){

        //Sum of all 5 'Pop-Quiz' scores.
        int quizValue = scores[0]+scores[1]+scores[2]+scores[3]+scores[4];

        //True if all scores = 100%.
        return (quizValue == 500);
    }
}
