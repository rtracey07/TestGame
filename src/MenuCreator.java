/** MenuCreator Class groups static methods that comprise
 *  the components for making the different menu boxes seen in the game.
 *  NOTE: Originally, multi-lined dialog box methods existed but were never used in-game. */
public class MenuCreator {

    /** Prints a generic dialog box that contains one line of dialog.
     *  @param content Content to be printed inside the box. */
    public static void dialogGeneric(String content) {

        //Print box top.
        System.out.println("\n");
        System.out.println("                         ┌────────────────────────────────┐");
        System.out.println("                         │                                │");

        //Print content of box.
        contentLine(content);

        //Close box.
        boxBottom();
    }

    /** Prints a generic input selection box that contains one line of dialog.
     *  @param content Content to be printed inside the box. */
    public static void inputGeneric(String content){

        //Print generic dialog box.
        dialogGeneric(content);

        //Add 'Selection:' prompt to base of box.
        System.out.print  ("                                            Selection: ");
    }

    /** Prints input selection box with a list as content.
     *  @param title Title of the box that appears at the top.
     *  @param content List to be printed inside the box. */
    public static void inputList(String title, String[] content){

        //Print box top with title.
        headerBox(title);

        //Add array in list format.
        listLine(content);

        //Print bottom of box with 'Selection:' prompt.
        boxBottom();
        System.out.print  ("                                            Selection: ");
    }

    /** Prints input selection box with a split between lists.
     *  @param title Title of the box that appears at the top.
     *  @param listA : List before split.
     *  @param listB : List after split. */
    public static void splitList(String title, String[] listA, String[] listB){

        //Print box top with title.
        headerBox(title);

        //Add first array in list format.
        listLine(listA);

        //Add split line in box.
        boxSplit();

        //Print second list.
        for(int i=0; i<listB.length; i++){

            //Print each item of list with correct numbering.
            System.out.printf("                         │ %2d. %s"
                    , ((i+1) + listA.length), listB[i] );

            //Print correct number of following spaces.
            for (int k=listB[i].length(); k<27; k++)
                System.out.print(" ");

            //Close box and start new line.
            System.out.println("│");
        }

        //Print bottom of box with 'Selection:' prompt.
        boxBottom();
        System.out.print  ("                                            Selection: ");
    }

    /** Prints High Score display box and a list of selections.
     *  @param content List to appear after scores. */
    public static void scoreList(String[] content){

        //Create a new instance of Score class.
        Score score = new Score();

        //Print top of box with 'High Scores' header.
        headerBox("High Scores");

        //Print out high scores.
        System.out.println("                         │  Pop Quiz                      │");
        System.out.println("                         │                                │");
        System.out.printf ("                         │      Addition         %3d %c    │\n"
                , score.getQuiz(0), '%' );
        System.out.printf ("                         │      Subtraction      %3d %c    │\n"
                , score.getQuiz(1), '%' );
        System.out.printf ("                         │      Multiplication   %3d %c    │\n"
                , score.getQuiz(2), '%' );
        System.out.printf ("                         │      Division         %3d %c    │\n"
                , score.getQuiz(3), '%' );
        System.out.printf ("                         │      Algebra          %3d %c    │\n"
                , score.getQuiz(4), '%' );
        System.out.println("                         │                                │");
        System.out.printf ("                         │  Marathon               %3d    │\n"
                , score.getMarathon() );

        //Print split line in box.
        boxSplit();

        //Print list.
        for(int i=0; i<content.length; i++){

            //Print each item of list with correct numbering.
            System.out.printf("                         │ %2d. %s"
                    , (i+1), content[i] );

            //Print correct number of trailing spaces.
            for (int k=content[i].length(); k<27; k++)
                System.out.print(" ");

            //Close box and start new line.
            System.out.println("│");
        }

        //Print bottom of box with 'Selection:' prompt.
        boxBottom();
        System.out.print  ("                                            Selection: ");
    }

    /** Prints 36 char-wide line containing content for a box.
     *  @param content Content printed to line. */
    private static void contentLine(String content){

        System.out.print  ("                         │");

        //If content is of even length.
        if (content.length() % 2 == 0) {

            //Spaces before content.
            for (int i = 0; i < (16 - (content.length() / 2)); i++)
                System.out.print(" ");

            //Content.
            System.out.print(content);

            //Spaces after content.
            for (int i = 0; i < (15 - (content.length() / 2)); i++)
                System.out.print(" ");
        }

        //If content is odd length.
        else {

            //Spaces before content.
            for (int i = 0; i < (15 - (content.length() / 2)); i++)
                System.out.print(" ");

            //Content.
            System.out.print(content);

            //Spaces after content.
            for (int i = 0; i < (15 - (content.length() / 2)); i++)
                System.out.print(" ");
        }

        //Close box and start new line.
        System.out.println(" │");
    }

    /** Prints series of lines in a listed format.
     *  @param content Numbered list printed inside box. */
    private static void listLine(String[] content){

        //Print list.
        for(int i=0; i<content.length; i++){

            //Print ordered content with correct number.
            System.out.printf("                         │ %2d. %s"
                    , (i+1), content[i] );

            //Print correct number of trailing spaces.
            for (int k=content[i].length(); k<27; k++)
                System.out.print(" ");

            //Close box and start new line.
            System.out.println("│");
        }
    }

    /** Prints shape of header-style box.
     *  @param title Title inside header. */
    private static void headerBox(String title){

        System.out.println("\n");
        System.out.println("                         ┌────────────────────────────────┐");

        //Print title into header.
        contentLine(title);

        System.out.println("                         ├────────────────────────────────┤");
        System.out.println("                         │                                │");
    }

    /** Prints shape of divider line in the box. */
    private static void boxSplit(){

        System.out.println("                         │                                │");
        System.out.println("                         ├────────────────────────────────┤");
        System.out.println("                         │                                │");
    }

    /** Prints closed box bottom. */
    private static void boxBottom(){

        System.out.println("                         │                                │");
        System.out.println("                         └────────────────────────────────┘");
    }

}
