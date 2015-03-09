/** 'Test Games'
 *  Created By: Eric Desjardins & Rob Tracey
 *  CSCI 1100 Final Project, Dec. 2nd 2014  */

public class TestGame {

    /** Main Method. */
    public static void main(String[] args){

        //Instantiate score object.
        Score score = new Score();

        int gameSelect;

        //Calls Opening Title Sequence
        Animations.openTitle();

        do {
            //Calls Main Menu. Gets selected game or menu from user.
            gameSelect = Menu.mainMenu();

            //Calls correct game or menu based on user's selection.
            switch(gameSelect) {

                //Quiz Mode.
                case 1:
                    Mode.quiz(score);
                    break;

                //Marathon Mode.
                case 2:
                    Mode.marathon(score);
                    break;

                //Instructions Menu.
                case 3:
                    Animations.instructionPane();
                    break;
                //High Scores Menu.
                case 4:
                    Menu.highScores(score);
                    break;
            }

        //Loop Terminates and game ends if user selects 5.
        }while(gameSelect !=5);

        //EndGame with creator signature.
        Animations.logoEnd();
        MenuCreator.dialogGeneric("Eric D & Rob T. 1988");
        Animations.pauseLine(2000);

    }
}
