/** Mode class contains static methods of the 'Test Games' game modes.
 *  Modes include 'Pop-Quiz' & 'Marathon'. */

import java.util.*;

public class Mode {

    private static Scanner sc = new Scanner(System.in);
    private static Random rand = new Random();

    /** 'Pop-Quiz' Mode.
     *  A game where the question type, difficulty, and # are set by the user.
     *  @param score Score object. */
    public static void quiz(Score score){

        Animations.logoEnd();

        //Triggers Game Mode Selection Menu.
        int modeSelect = Menu.gameType();

        //Triggers the Difficulty Menu
        int diff = Menu.difficultyMenu();

        //Triggers the Question Count Menu
        int questCount = Menu.questionCount();

        //Show Pop Quiz Logo.txt Animation
        Animations.quizLogo();

        //Score variable for Pop Quiz
        int scr = 0;

        //Loop for selected # of questions.
        for (int i=0; i<questCount; i++){

            //Create a new instance of QuestionCreator.
            QuestionCreator question = new QuestionCreator(diff, modeSelect);

            //Print question.
            MenuCreator.inputGeneric(question.toString() );

            //Confirm int input.
            while(!sc.hasNextInt()){
                sc.next();
                MenuCreator.inputGeneric(question.toString() );
            }

            //Display if correct.
            if ( question.checkAnswer(sc.nextInt() ) ){
                MenuCreator.dialogGeneric("!!! CORRECT !!!");
                scr++;
            }

            //Display if false.
            else {
                MenuCreator.dialogGeneric("... WRONG ...");
                MenuCreator.dialogGeneric("The Correct Answer Was " + question.getAnswer());
            }
        }

        //Calculates the percentage score
        double scoreRatio = ((double) scr / (double) questCount) * 100;

        //Display the final score (fraction & percentage).
        MenuCreator.dialogGeneric("You got "+ scr + " / " + questCount);
        Animations.pauseLine(1500);
        MenuCreator.dialogGeneric("That's " + (int)scoreRatio + "%");
        Animations.pauseLine(1500);

        //If you achieve a high score.
        if(score.checkQuiz((int) scoreRatio, (modeSelect-1) ) )
            MenuCreator.dialogGeneric("!!! NEW HIGH SCORE !!!");

        else
            MenuCreator.dialogGeneric("No High Score. Keep Trying!");

        //Pause for 2 seconds and print final lines.
        Animations.pauseLine(2000);
        Animations.logoEnd();

    }

    /** 'Marathon' Mode.
     *  A game where users are challenged to answer 42 randomized questions.
     *  Questions get progressively harder.
     *  @param score Score object. */
    public static void marathon(Score score){

        //Show Marathon Logo Animations.
        Animations.marathonLogo();
        Animations.marathonCountdown();

        //Difficulty modifiers determine rand range.
        int diff = 10;

        //Score container and modifiers.
        int scr = 0;
        int asScore = 0;
        int mdaScore = 0;

        //Counters for Question # and difficulty increase.
        int questNum = 1;
        int levelUp = 1;

        //True while answers are correct.
        boolean marathonLoop = true;

        //Loops until incorrect answer or game completion.
        while (marathonLoop && questNum <= 42) {

            //Difficulty Scale.
            if (levelUp % 5 == 0){
                diff += 5;

                //'Level Up' Display.
                Animations.marathonLevelUp(levelUp);
            }

            //Score point value in relation to level.
            if (levelUp <= 5){
                asScore = 2;
                mdaScore = 4;
            }else if (levelUp <=25){
                asScore = 4;
                mdaScore = 8;
            }else if (levelUp >25){
                asScore = 15;
                mdaScore = 30;
            }

            //Displays Marathon Map Animation.
            Animations.marathonMap(questNum);

            //Create new instance of Question Creator with random question type.
            QuestionCreator question = new QuestionCreator(diff, (rand.nextInt(5)+1) );

            //Print question to screen.
            MenuCreator.inputGeneric(question.toString() );

            //Confirm int input.
            while(!sc.hasNextInt()){
                sc.next();
                MenuCreator.inputGeneric(question.toString() );
            }

            //Display if correct.
            if ( question.checkAnswer(sc.nextInt() ) ){
                MenuCreator.dialogGeneric("!!! CORRECT !!!");

                //Modify score according to question type.
                if(question.getType() == 1 || question.getType() == 2)
                    scr +=asScore;
                else
                    scr +=mdaScore;
            }

            //Display if incorrect.
            else{
                MenuCreator.dialogGeneric("... WRONG ...");
                MenuCreator.dialogGeneric("The Correct Answer Was " + question.getAnswer());
                marathonLoop = false;
            }

            //Increment Level & Question #.
            levelUp++;
            questNum++;
        }

        //If user reached endgame:
        if (questNum == 43){

            //Endgame Animation.
            Animations.marathonEnd();

            //Display final score.
            MenuCreator.dialogGeneric("Your score was: " + scr);
        }

        //If user got Game Over:
        else {

            //Game Over Animation.
            Animations.marathonGameOver();

            //Display final score.
            MenuCreator.dialogGeneric("Your score was: " + scr);
        }

        //Check if user score is greater than current high score.
        if(score.checkMarathon(scr) )
            MenuCreator.dialogGeneric("!!! NEW HIGH SCORE !!!");

        else
            MenuCreator.dialogGeneric("No High Score. Keep Trying!");

        //Pause for 2 seconds and print final lines.
        Animations.pauseLine(1500);
        Animations.logoEnd();
    }
}
