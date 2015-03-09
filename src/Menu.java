/** Menu Class groups static methods that comprise
 *  the content and selections from menus and sub-menus. */
import java.util.Scanner;

public class Menu {

    private static Scanner input = new Scanner(System.in);

    /** Main Menu. Game Select Screen.
     *  @return selection User's choice of game or sub-menu. */
    public static int mainMenu(){

        int selection; //Container for User's selection.

        do{
            //Items for top half of menu box.
            String choicesA[] = {"Pop-Quiz", "Marathon"};

            //Items for bottom half of menu box.
            String choicesB[] = {"Instructions", "High Scores", "Quit Game"};

            //Print the menu.
            MenuCreator.splitList("Select Your Game", choicesA, choicesB);

            //Confirms int input.
            while( !input.hasNextInt() ){
                input.next();
                MenuCreator.splitList("Select Your Game", choicesA, choicesB);
            }

            selection = input.nextInt();

        //Repeats until selection is 1,2,3,4, or 5.
        }while(selection >5 || selection <1);

        return selection;
    }

    /** Game Type selection screen for 'Pop-Quiz'.
     *  @return selection User's choice of game type. */
    public static int gameType(){

        int selection; //Container for User's selection.

        do{
            //Items for menu box.
            String[] choices = {"Addition", "Subtraction",
                                "Multiplication", "Division", "Algebra"};

            //Print the menu.
            MenuCreator.inputList("Select Your Mode", choices);

            //Checks to see if input contains integer.
            while( !input.hasNextInt() ){
                input.next();
                MenuCreator.inputList("Select Your Mode", choices);
            }

            selection = input.nextInt();

        //Repeats until selection is 1,2,3,4, or 5.
        }while(selection >5 || selection <1);

        return selection;
    }

    /** High Score screen. Displays scores as well as gives the option to reset.
     *  NOTE: Screen contains 'Top Secret Banana' Easter Egg.
     *  @param score Score object. */
    public static void highScores(Score score){

        int selection; //Container for User's selection.

        //Pause before menu propagates.
        Animations.pauseLine(600);

        do {
            String choices[] = new String[2];
            choices[0] = "Reset Scores";

            //String conditional is for Easter Egg implementation.
            choices[1] = score.secretScore() ? "Top Secret Banana"
                                             : "Return to Main Menu";
            //Print Menu.
            MenuCreator.scoreList(choices);

            //Confirms int input.
            while(!input.hasNextInt() ){
                input.next();
                MenuCreator.scoreList(choices);
            }

            selection = input.nextInt();

            //Pause before menu propagates.
            Animations.pauseLine(600);

        //Repeats until selection is in range.
        }while (selection >2 || selection <1);

        //If 'Reset Scores' is selected.
        if(selection == 1){

            do{
                //Items for menu box.
                String choices[] = {"Yes", "No"};

                //Print menu.
                MenuCreator.inputList("Are You Sure?", choices);

                //Confirms int input.
                while( !input.hasNextInt() ){
                    input.next();
                    MenuCreator.inputList("Are You Sure?", choices);
                }

                selection = input.nextInt();

            //Repeats until selection is in range.
            }while(selection >2 || selection <1);

            //If 'Yes' is selected.
            if(selection ==1){

                //Resets all scores to 0.
                score.clearScore();

                MenuCreator.dialogGeneric("Scores Reset!");

                Animations.pauseLine(1500);
            }
        }

        //If 'Top Secret Banana' is selected (Easter Egg Only).
        else if (selection ==2 && score.secretScore())
            Animations.topSecretBanana();
    }

    /** 'Pop-Quiz' difficulty selection.  */
    public static int difficultyMenu(){

        int selection; //Container for User's selection.

        do{
            MenuCreator.inputGeneric("Select Your Difficulty");

            //Confirms int input.
            while( !input.hasNextInt() ){
                input.next();
                MenuCreator.inputGeneric("Select Your Difficulty");
            }

            selection = input.nextInt();

        //Value must be positive.
        }while(selection < 1);

        return selection;
    }

    /** 'Pop-Quiz' selection box for # of questions. */
    public static int questionCount(){

        int selection; //Container for User's selection.

        do{
            MenuCreator.inputGeneric("Enter the Number of Questions");

            //Confirms int input.
            while( !input.hasNextInt() ){
                input.next();
                MenuCreator.inputGeneric("Enter the Number of Questions");
            }

            selection = input.nextInt();

        //Value must be positive.
        }while(selection < 1);

        return selection;
    }
}