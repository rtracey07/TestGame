/** Question Creator create new questions for both 'Marathon' & 'Pop-Quiz'. */

import java.util.*;

public class QuestionCreator {

    private int[] x = new int[3]; //Int values in questions.
    private int type;             //Question type.
    private int answer;           //Correct answer to question.

    /** Constructor Question Creator initializes question and creates random values.
     *  @param diff Difficulty of the question. Determines random range of integers.
     *  @param type Question type from +, -, *, /, or algebra. */
    public QuestionCreator (int diff, int type){

        Random rand = new Random();

        //Pass type to container.
        this.type = type;

        //If division; confirm 0 remainder.
        if(type == 4) {
            do {
                x[0] = rand.nextInt(diff) + 1;
                x[1] = rand.nextInt(diff) + 1;
            } while (x[0] % x[1] != 0);
        }

        //If not division; just randomize.
        else{
            x[0] = rand.nextInt(diff);
            x[1] = rand.nextInt(diff);
        }

        //Randomize 3rd int for algebra.
        x[2] = rand.nextInt(diff);

        //Pass answer to container from setAnswer method.
        answer = setAnswer();
    }

    /** setAnswer calculates solution to question.
     *  @return answer */
    private int setAnswer(){

        //Initialize variable.
        int answer = 0;

        //Based on operator type.
        switch(type){

            //Addition.
            case 1:
                answer = x[0] + x[1];
                break;

            //Subtraction.
            case 2:
                answer = x[0] - x[1];
                break;

            //Multiplication.
            case 3:
                answer = x[0] * x[1];
                break;

            //Division.
            case 4:
                answer = (x[0] / x[1]);
                break;

            //Algebra.
            case 5:
                answer = x[0] + x[1] - x[2];
                break;
        }

        return answer;
    }

    /** getAnswer passes Answer value from class.
     *  @return answer */
    public int getAnswer(){

        return answer;
    }

    /** checkAnswer confirms User input was correct answer.
     *  @ return boolean true if answer equals input. */
    public boolean checkAnswer(int answer){

        return (this.answer == answer);
    }

    /** getType passes type value from class.
     *  @return type */
    public int getType(){

        return type;
    }

    /** toString formats question into desired String format.
     *  @return question */
    public String toString(){

        //Set question variable.
        String question = "";

        //Based on operator type.
        switch(type){

            //Addition.
            case 1:
                question = (x[0] + " + " + x[1] + " = ___");
                break;

            //Subtraction.
            case 2:
                question = (x[0] + " - " + x[1] + " = ___");
                break;

            //Multiplication.
            case 3:
                question = (x[0] + " * " + x[1] + " = ___");
                break;

            //Division.
            case 4:
                question = ( x[0] + " / " + x[1] + " = ___");
                break;

            //Algebra.
            case 5:
                question = (x[0] + " + " + x[1] + " = "+ x[2] + " + __");
        }

        return question;

    }

}
