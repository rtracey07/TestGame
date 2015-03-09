/** Animations Class groups static methods that comprise
 *  the ASCII Arts in-game logos and pseudo-animations. */
public class Animations {

    /** Title Sequence for TestGames. */
    public static void openTitle() {

        //Pause length sent to printMachine.
        int length = 80;

        String logoTop[] = {
                 "*"
                ,"   *"
                ,"      *"
                ,"         *"
                ,"*           *"
                ,"   *           *"
                ,"      *           *"
                ,"         *           *                                                                  *"
                ,"            *           *                                                           *    "
                ,"               *           *                                                    *        "
                ,"                  *           *                                             *            "
                ,"                     *           *                                      *               *"
                ,"                        *           *                               *               *    "
                ,"                           *           *                        *               *        "
                ,"                              *           *                *                *            "
                ,"                                 *           *         *                *                "
                ,"                                    *           *  *                *                    "
                ,"                                       *      ┌─────────┐       *                        "
                ,"                                          *  ┌┘         └┐  *                            "
                ,"      ┌───────────┐      ┌───────────┐   *  ┌┘   ┌───┐   └┐      ┌───────────┐           "
                ,"      │           │      │           │      │    │   │    │ *    │           │          *"
                ,"      └───┐   ┌───┘      │   ┌───────┘      │    │** └────┘    * └───┐   ┌───┘      *    "
                ,"*         │   │          │   │ *            └┐   └┐   *           *  │   │      *        "
                ,"   *      │   │          │   │             * └┐   └┐     *           │   │  *            "
                ,"      *   │   │         *│   │         *      └┐   └┐       *        │   │              *"
                ,"         *│   │     *    │   └─────┐           └┐   └┐         *     │   │ *        *    "
                ,"*         │   │ *        │         │            └┐   └┐           *  │   │    * *        "
                ,"   *      │   │*         │   ┌─────┘             └┐   └┐      *      │   │  *    *       "
                ,"      *  *│   │   *      │   │                    └┐   └┐ *          │   │          *    "
                ,"     *   *│   │      * * │   │                     └┐   └┐           │   │ *           * "
                ," *        │   │    *    *│   │              ┌────┐ *└┐   └┐       *  │   │    *          "
                ,"          │   │*         │   └───────┐      │    │   │    │   *      │   │       *       "
                ,"          │   │   *      │           │      └┐   └───┘   ┌┘          │   │          *    "
                ,"        * └───┘      *   └───────────┘   *   └┐         ┌┘           └───┘             * "
                ,"    *                   *           **        └─────────┘                                "
        };

        String logoBottom[] = {
                 "  ┌─────────┐                                                               ┌─────────┐  "
                ," ┌┘         └┐                                                             ┌┘         └┐ "
                ,"┌┘   ┌───┐   └┐     ┌───────┐     ┌─────┐       ┌─────┐   ┌───────────┐   ┌┘   ┌───┐   └┐"
                ,"│    │   │    │    ┌┘       └┐    │     └┐     ┌┘     │   │           │   │    │   │    │"
                ,"│    │   └────┘   ┌┘   ┌─┐   └┐   │      └┐   ┌┘      │   │   ┌───────┘   │    │   └────┘"
                ,"│    │            │   ┌┘ └┐   │   │   ┌┐  └┐ ┌┘  ┌┐   │   │   │           └┐   └┐        "
                ,"│    │            │   │   │   │   │   │└┐  └─┘  ┌┘│   │   │   │            └┐   └┐       "
                ,"│    │            │   │   │   │   │   │ └┐     ┌┘ │   │   │   │             └┐   └┐      "
                ,"│    │  ┌─────┐   │   └───┘   │   │   │  └┐   ┌┘  │   │   │   └─────┐        └┐   └┐     "
                ,"│    │  │     │   │           │   │   │   └┐ ┌┘   │   │   │         │         └┐   └┐    "
                ,"│    │  └┐    │   │   ┌───┐   │   │   │    └─┘    │   │   │   ┌─────┘          └┐   └┐   "
                ,"│    │   │    │   │   │   │   │   │   │           │   │   │   │                 └┐   └┐  "
                ,"│    │   │    │   │   │   │   │   │   │           │   │   │   │                  └┐   └┐ "
                ,"│    │   │    │   │   │   │   │   │   │           │   │   │   │           ┌────┐  └┐   └┐"
                ,"│    │   │    │   │   │   │   │   │   │           │   │   │   └───────┐   │    │   │    │"
                ,"└┐   └───┘   ┌┘   │   │   │   │   │   │           │   │   │           │   └┐   └───┘   ┌┘"
                ," └┐         ┌┘    └───┘   └───┘   └───┘           └───┘   └───────────┘    └┐         ┌┘ "
                ,"  └─────────┘                                                               └─────────┘  "
        };

        //Prints first array.
        printMachine(logoTop,length);

        //Prints three lines.
        logoEnd();

        //Prints second array.
        printMachine(logoBottom, length);

        //Prints three lines.
        logoEnd();

        //Two second pause after logo loads.
        pauseLine(2000);

        //Spacing to create distance of next output from logo.
        System.out.println("\n\n\n");

    }

    /** Image of the game instructions. Prints when selected from the Main Menu. */
    public static void instructionPane(){

        //NOTE: Image broken into multiple arrays to better control print speed.
        String instruction[][] = {
                {

                     "┌───────────────────────────────────────────────────────────────────────────────────────┐"
                    ,"│ ┌───────────────────────────────────────────────────────────────────────────────────┐ │"
                    ,"│┌┘   ┌─┐  ┌─┐┌──────┐┌─┐     ┌──────┐┌──────┐┌──┐┌──┐┌──────┐   ┌──────┐ ┌──────┐    └┐│"
                    ,"││    │ │┌┐│ ││ ┌────┘│ │     │ ┌────┘│ ┌──┐ ││  └┘  ││ ┌────┘   └─┐  ┌─┘ │ ┌──┐ │     ││"
                    ,"││    │ └┘└┘ ││ └──┐  │ │     │ │     │ │  │ ││      ││ └──┐       │  │   │ │  │ │     ││"
                    ,"││    │      ││ ┌──┘  │ │     │ │     │ │  │ ││ ┌┐┌┐ ││ ┌──┘       │  │   │ │  │ │     ││"
                    ,"││    │  ┌┐  ││ └────┐│ └────┐│ └────┐│ └──┘ ││ │└┘│ ││ └────┐     │  │   │ └──┘ │     ││"
                    ,"││    └──┘└──┘└──────┘└──────┘└──────┘└──────┘└─┘  └─┘└──────┘     └──┘   └──────┘     ││"
                    ,"││    ┌──────┐┌──────┐┌──────┐┌──────┐    ┌──────┐┌──────┐┌──┐┌──┐┌──────┐┌──────┐     ││"
                    ,"││    └─┐  ┌─┘│ ┌────┘│ ┌────┘└─┐  ┌─┘    │ ┌────┘│ ┌──┐ ││  └┘  ││ ┌────┘│ ┌────┘     ││"
                    ,"││      │  │  │ └──┐  │ └────┐  │  │      │ │ ┌──┐│ └──┘ ││      ││ └──┐  │ └────┐     ││"
                    ,"││      │  │  │ ┌──┘  └────┐ │  │  │      │ │ └┐ ││ ┌──┐ ││ ┌┐┌┐ ││ ┌──┘  └────┐ │     ││"
                    ,"││      │  │  │ └────┐┌────┘ │  │  │      │ └──┘ ││ │  │ ││ │└┘│ ││ └────┐┌────┘ │     ││"
                    ,"│└┐     └──┘  └──────┘└──────┘  └──┘      └──────┘└─┘  └─┘└─┘  └─┘└──────┘└──────┘    ┌┘│"
                    ,"│ └───────────────────────────────────────────────────────────────────────────────────┘ │"
                    ,"│ ┌───────────────────────────────────────────────────────────────────────────────────┐ │"
                    ,"│┌┘                     The Game That Makes Practicing Math Fun!                      └┐│"
                    ,"│└─────────────────────────────────────────────────────────────────────────────────────┘│"
                },
                {    "│┌─────────────────────────────────────────────────────────────────────────────────────┐│"
                    ,"││┌───────┐ ┌───────┐ ┌───────┐ * * * * * * * * * * ┌───────┐ ┌───┐ ┌─┐ ┌───┐ ┌───────┐││"
                    ,"│││ ┌──┐  │ │  ┌──┐ │ │ ┌───┐ │  * * * * * * * * *  │┌────┐ │ │   │ │ │ │   │ └────┐  │││"
                    ,"│││ │  │  │ │  │  │ │ │ │   │ │ * * * * * * * * * * ││    │ │ │   │ │ │ │   │ ┌────┘  │││"
                    ,"│││ └──┘  │ │  │  │ │ │ └───┘ │  * *  ┌─────┐  * *  ││  ┌─┘ │ │   │ │ │ │   │ │       │││"
                    ,"│││   ┌───┘ │  │  │ │ │   ┌───┘ * * * └─────┘ * * * ││  │┌──┘ │   │ │ │ │   │ │  ┌────┘││"
                    ,"│││   │  *  │  └──┘ │ │   │  * * * * * * * * * * *  │└──┘│┌─┐ │   └─┘ │ │   │ │  └────┐││"
                    ,"││└───┘ * * └───────┘ └───┘ * * * * * * * * * * * * └────┘└─┘ └───────┘ └───┘ └───────┘││"
                    ,"││ * * * * * * * * * * * * * * * * *             * * * * * * * * * * * * * * * * * * * ││"
                    ,"││  * * * * * * * * * * * * * * * *  (PRACTICE)   * * * * * * * * * * * * * * * * * *  ││"
                },
                {    "││ * * *                                                                         * * * ││"
                    ,"││  * * *  Are you great at addition but need to work on division more?         * * *  ││"
                    ,"││ * * *                                                                         * * * ││"
                    ,"││  * * *  Pop - Quiz is a great way to practice different math operations.     * * *  ││"
                    ,"││ * * *   Simply select 'Pop - Quiz' in the Main Menu and follow these steps:   * * * ││"
                    ,"││  * * *                                                                       * * *  ││"
                    ,"││ * * *   1. Select the operation you wish to practice.                         * * * ││"
                    ,"││  * * *                                                                       * * *  ││"
                    ,"││ * * *   2. Select your difficulty.                                            * * * ││"
                    ,"││  * * *     (The difficulty will be the highest number in your problems)      * * *  ││"
                    ,"││ * * *                                                                         * * * ││"
                    ,"││  * * *  3. Select the number of questions.                                   * * *  ││"
                    ,"││ * * *                                                                         * * * ││"
                    ,"││  * * *  4. Have Fun Learning!                                                * * *  ││"
                    ,"││ * * *                                                                         * * * ││"
                    ,"││  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *  ││"
                    ,"│└─────────────────────────────────────────────────────────────────────────────────────┘│"
                },
                {
                     "│┌─────────────────────────────────────────────────────────────────────────────────────┐│"
                    ,"││┌──┐┌──┐   ┌──────┐   ┌──────┐   ┌──────┐   ┌──────┐   ┌──┐┌──┐   ┌──────┐   ┌──┐ ┌─┐││"
                    ,"│││  └┘  │   │ ┌──┐ │   │ ┌──┐ │   │ ┌──┐ │   └─┐  ┌─┘   │  ││  │   │ ┌──┐ │   │  └┐│ │││"
                    ,"│││      │   │ └──┘ │   │ └──┘ │   │ └──┘ │     │  │     │  └┘  │   │ │  │ │   │   └┘ │││"
                    ,"│││ ┌┐┌┐ │   │ ┌──┐ │   │ ┌┐  ┌┘   │ ┌──┐ │     │  │     │  ┌┐  │   │ │  │ │   │ ┌┐   │││"
                    ,"│││ │└┘│ │   │ │  │ │   │ │└┐ └┐   │ │  │ │     │  │     │  ││  │   │ └──┘ │   │ │└┐  │││"
                    ,"││└─┘  └─┘   └─┘  └─┘   └─┘ └──┘   └─┘  └─┘     └──┘     └──┘└──┘   └──────┘   └─┘ └──┘││"
                    ,"││▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓││"
                    ,"││▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓││"
                    ,"││  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓┌────────────────────────┐▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓ ││"
                    ,"││  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓│      (CHALLENGE)       │▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓ ││"
                },
                {
                     "││▓▓  ▓▓┌─────────────────────┘                        └─────────────────────┐▓▓  ▓▓  ▓││"
                    ,"││▓▓  ▓▓│  Do you have what it takes to complete a math marathon?            │▓▓  ▓▓  ▓││"
                    ,"││  ▓▓  │                                                                    │  ▓▓  ▓▓ ││"
                    ,"││  ▓▓  │  Then you can help Mathy, the math marathon runner!                │  ▓▓  ▓▓ ││"
                    ,"││▓▓  ▓▓│                                                                    │▓▓  ▓▓  ▓││"
                    ,"││▓▓  ▓▓│  Each correct answer moves Mathy 1km in the 42km race.             │▓▓  ▓▓  ▓││"
                    ,"││  ▓▓  │  But one wrong answer, and it's Game Over.                         │  ▓▓  ▓▓ ││"
                    ,"││  ▓▓  │                                                                    │  ▓▓  ▓▓ ││"
                    ,"││▓▓  ▓▓│  The game gets progressively harder, so take your time.            │▓▓  ▓▓  ▓││"
                    ,"││▓▓  ▓▓│  And make sure to write out your solutions on paper!               │▓▓  ▓▓  ▓││"
                    ,"││  ▓▓  └────────────────────────────────────────────────────────────────────┘  ▓▓  ▓▓ ││"
                    ,"│└┐ ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓┌┘│"
                    ,"│ └───────────────────────────────────────────────────────────────────────────────────┘ │"
                    ,"└───────────────────────────────────────────────────────────────────────────────────────┘"
                }

        };

        //Creates space between last output and logo.
        System.out.println("\n\n\n\n");

        //Below section prints the arrays interspersed with pauses.
        printMachine(instruction[0], 80);
        pauseLine(1500);
        printMachine(instruction[1], 150);
        printMachine(instruction[2], 1500);
        pauseLine(1500);
        printMachine(instruction[3], 150);
        printMachine(instruction[4], 1500);
        pauseLine(1500);
    }

    /** 'Pop - Quiz' Logo image. */
    public static void quizLogo(){

        //Pause length sent to printMachine.
        int length = 80;

        String quizLogo[] = {
                 "_________________________________________________________________________________________"
                ,"_________________________________________________________________________________________"
                ,"_________________________________________________________________________________________"
                ," * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * "
                ,"┌───────┐ ┌───────┐ ┌───────┐ * * * * * * * * * * * * ┌───────┐ ┌───┐ ┌─┐ ┌───┐ ┌───────┐"
                ,"│ ┌──┐  │ │  ┌──┐ │ │ ┌───┐ │  * * * * * * * * * * *  │┌────┐ │ │   │ │ │ │   │ └────┐  │"
                ,"│ │  │  │ │  │  │ │ │ │   │ │ * * * * * * * * * * * * ││    │ │ │   │ │ │ │   │ ┌────┘  │"
                ,"│ └──┘  │ │  │  │ │ │ └───┘ │  * * *  ┌─────┐  * * *  ││  ┌─┘ │ │   │ │ │ │   │ │       │"
                ,"│   ┌───┘ │  │  │ │ │   ┌───┘ * * * * └─────┘ * * * * ││  │┌──┘ │   │ │ │ │   │ │  ┌────┘"
                ,"│   │  *  │  └──┘ │ │   │  * * * * * * * * * * * * *  │└──┘│┌─┐ │   └─┘ │ │   │ │  └────┐"
                ,"└───┘ * * └───────┘ └───┘ * * * * * * * * * * * * * * └────┘└─┘ └───────┘ └───┘ └───────┘"
                ," * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * "
                ,"  * * * * ┌─┐ ┌─────┐ ┌─────┐ ┌─┐ ┌─┐ ┌─────┐ ┌─────┐ ┌─────┐ ┌─────┐ ┌─────┐ * * * * *  "
                ,"    ┌─┐   │ │ └───┐ │ └───┐ │ │ │ │ │ │ ┌───┘ │ ┌───┘ └───┐ │ │ ┌─┐ │ │ ┌─┐ │  * * * * * "
                ,"  ┌─┘ └─┐ │ │ ┌───┘ │   ┌─┘ │ │ └─┘ │ │ └───┐ │ └───┐ * * │ │ │ └─┘ │ │ └─┘ │ ┌─────┐ *  "
                ,"  └─┐ ┌─┘ │ │ │ ┌───┘   └─┐ │ └───┐ │ └───┐ │ │ ┌─┐ │  *  │ │ │ ┌─┐ │ └───┐ │ └─────┘  * "
                ,"  * └─┘ * │ │ │ └───┐ ┌───┘ │ * * │ │ ┌───┘ │ │ └─┘ │ * * │ │ │ └─┘ │ ┌───┘ │ * * * * *  "
                ," * * * *  └─┘ └─────┘ └─────┘  *  └─┘ └─────┘ └─────┘  *  └─┘ └─────┘ └─────┘  * * * * * "
        };

        //Creates space between last output and logo.
        System.out.println("\n\n\n\n");

        //Print quizLogo array.
        printMachine(quizLogo, length);

        //Three lines.
        logoEnd();

        //Two second pause after logo.
        pauseLine(2000);
    }

    /** 'Marathon' Logo image. */
    public static void marathonLogo(){

        //Pause length sent to printMachine.
        int length = 80;

        String marathonLogo[] = {
                 "_________________________________________________________________________________________"
                ,"_________________________________________________________________________________________"
                ,"_________________________________________________________________________________________"
                ,"   ┌┐                            ┌┐                    ┌────┐          │   ▓▓▓   ▓▓▓   │ "
                ,"   ├┼────┐       ┌┐              ├┼────┐               │  o └┐         │   ▓▓▓   ▓▓▓   │ "
                ,"   ││    ├──┐    ├┼────┐         ││    ├──┐            │   -┌┘┌──┐     │▓▓▓   ▓▓▓   ▓▓▓│ "
                ,"   ├┼───┬┤  │    ││    ├──┐      ├┼───┬┤  │            └────┘ │  │     │▓▓▓   ▓▓▓   ▓▓▓│ "
                ,"   ││   └┴──┘    ├┼───┬┤  │      ││   └┴──┘      ┌─────────┐  │  │     │   ▓▓▓   ▓▓▓   │ "
                ,"   ││            ││   └┴──┘      ││              │  ┌──┐   └──┘  │     │   ▓▓▓   ▓▓▓   │ "
                ,"   ││            ││              ││              │  │  │   ┌─────┘     │▓▓▓   ▓▓▓   ▓▓▓│ "
                ,"   ││            ││              ││              │  │  │   │           │▓▓▓   ▓▓▓   ▓▓▓│ "
                ,"───┴┴────────────┴┴───── ───  ── ┴┴──  ── ─   ─  └──┘  │   │           │   ▓▓▓   ▓▓▓   │ "
                ,"  ~  ~              ~    ~        ~   ~                │   └──────┐    │   ▓▓▓   ▓▓▓   │ "
                ,"   ~    ~  ~   ~ ~       ~   ~  ~    ~    ~            │  ┌────┐  │    │▓▓▓   ▓▓▓   ▓▓▓│ "
                ,"  ~  ~    ~  ~     ~   ~    ~ ~     ~  ~    ~          │  │    │  │    │▓▓▓   ▓▓▓   ▓▓▓│ "
                ," ~     ~  ~    ~     ~   ~   ~  ~ ~            ┌───────┘  │    │  │    │   ▓▓▓   ▓▓▓   │ "
                ,"      ~      ~     ~      ~     ~    ~ ~       └──────────┘    │  │    │   ▓▓▓   ▓▓▓   │ "
                ," ~       ~    ~    ~   ~   ~   ~   ~ ~ ~ ~ ~                   └──┘    │▓▓▓   ▓▓▓   ▓▓▓│ "
                ,"   ~    ~   ~    ~  ~       ~ ~   ~ ~ ~     ~  ~                       │▓▓▓   ▓▓▓   ▓▓▓│ "
        };

        //Creates space between last output and logo.
        System.out.println("\n\n\n\n");

        //Print marathonLogo array.
        printMachine(marathonLogo, length);

        //Three lines.
        logoEnd();

        //Two second pause.
        pauseLine(2000);
    }

    /** Marathon Question Counter Animation.
     *  @param questNum Question number determines placement of 'Mathy' character on in printout. */
    public static void marathonMap(int questNum){

        // 4/10th second pause.
        pauseLine(400);

        //Character.
        String[] figure = {" o \n"
                          ,"┌┼┐\n"
                          ,"┌┴┐\n"
                          ,"┴─┴"
        };

        //Spaces around character.
        String[] spaces = {"  ", "  ", "  ", "──", "▓ ", " ▓"};

        //Print character in correct position.
        for ( int i=0; i<5; i++){

            //First three lines.
            if(i<3){
                preSpacing(spaces[i], questNum);
                System.out.print(figure[i]);
            }

            //Fourth line.
            else if (i==3){
                preSpacing(spaces[i], questNum);
                System.out.print(figure[i]);
                postSpacing(spaces[i], questNum);
                System.out.println();
            }

            //Fifth line.
            else{
                preSpacing(spaces[i], questNum);
                System.out.printf("%02dK", questNum);
                postSpacing(spaces[i+1], questNum);
            }
        }

        System.out.println("\n────────────────────────────────────────" +
                           "─────────────────────────────────────────────");

        // 8/10th second pause.
        pauseLine(800);

    }

    /** Winning Marathon game image. */
    public static void marathonEnd(){

        //Pause length sent to printMachine.
        int length = 80;

        String marathonEnd[] = {
                "_________________________________________________________________________________________"
                ,"_________________________________________________________________________________________"
                ,"_________________________________________________________________________________________"
                ," │   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓│ "
                ," │   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓│ "
                ," │▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   │ "
                ," │▓▓▓   ▓▓▓   ▓▓▓┌────────────────────────────────────────────────────┐   ▓▓▓   ▓▓▓   │ "
                ," │   ▓▓▓   ▓▓▓   │ ┌───────┐  ┌───────┐  ┌───────┐  ┌─┐       ┌─┐ ┌─┐ │▓▓▓   ▓▓▓   ▓▓▓│ "
                ," │   ▓▓▓   ▓▓▓   │ │ ┌───┐ │  │ ┌───┐ │  │ ┌───┐ │  │ │       │ │ │ │ │▓▓▓   ▓▓▓   ▓▓▓│ "
                ," │▓▓▓   ▓▓▓   ▓▓▓│ │ │   └─┘  │ │   │ │  │ │   │ │  │ │       │ │ │ │ │   ▓▓▓   ▓▓▓   │ "
                ," │▓▓▓   ▓▓▓   ▓▓▓│ │ │  ┌──┐  │ │   │ │  │ └───┘ │  │ │       │ │ │ │ │   ▓▓▓   ▓▓▓   │ "
                ," │   ▓▓▓   ▓▓▓   │ │ │  └┐ │  │ │   │ │  │ ┌───┐ │  │ │       │ │ │ │ │▓▓▓   ▓▓▓   ▓▓▓│ "
                ," │   ▓▓▓   ▓▓▓   │ │ │   │ │  │ │   │ │  │ │   │ │  │ │       └─┘ └─┘ │▓▓▓   ▓▓▓   ▓▓▓│ "
                ," │▓▓▓   ▓▓▓   ▓▓▓│ │ └───┘ │  │ └───┘ │  │ │   │ │  │ └─────┐ ┌─┐ ┌─┐ │   ▓▓▓   ▓▓▓   │ "
                ," │▓▓▓   ▓▓▓   ▓▓▓│ └───────┘  └───────┘  └─┘   └─┘  └───────┘ └─┘ └─┘ │   ▓▓▓   ▓▓▓   │ "
                ," │   ▓▓▓   ▓▓▓   └────────────────────────────────────────────────────┘▓▓▓   ▓▓▓   ▓▓▓│ "
                ," │   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓│ "
                ," │▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   │ "
                ," │▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓   │ "
                ,"_________________________________________________________________________________________"
                ,"_________________________________________________________________________________________"
                ,"_________________________________________________________________________________________"
        };

        //Creates space between last output and logo.
        System.out.println("\n\n\n\n");

        //Print marathonEnd array.
        printMachine(marathonEnd, length);

        //Two second pause.
        pauseLine(2000);
    }

    /** Marathon banners that display varying 'level up' screens. */
    public static void marathonLevelUp(int level){

        //Pause length sent to printMachine.
        int length = 80;

        //NOTE: Arrays are initialized inside conditionals because of varying lengths.

        //Image at level 40.
        if(level ==40){

            String marathonLevel40[] = {
                    ""
                    ,"   ┌───────┐ ┌─┐       ┌──┐ ┌──┐ ┌───────┐ ┌───────┐ ┌───────┐         ┌────┐      "
                    ,"   │  ┌─┐  │ │ │       │  └─┘  │ │  ┌──┐ │ │ ┌─────┘ └──┐ ┌──┘         │  o └┐     "
                    ,"   │  └─┘  │ │ │       │ ┌┐ ┌┐ │ │  │  │ │ │ └─────┐    │ │            │   -┌┘┌──┐ "
                    ,"   │  ┌─┐  │ │ │       │ │└─┘│ │ │  │  │ │ └─────┐ │    │ │            └────┘ │  │ "
                    ,"   │  │ │  │ │ └─────┐ │ │   │ │ │  └──┘ │ ┌─────┘ │    │ │      ┌─────────┐  │  │ "
                    ,"   └──┘ └──┘ └───────┘ └─┘   └─┘ └───────┘ └───────┘    └─┘      │  ┌──┐   └──┘  │ "
                    ,"                                                                 │  │  │   ┌─────┘ "
                    ,"   ┌───────┐ ┌──┐ ┌──┐ ┌───────┐ ┌───────┐ ┌───────┐             └──┘  │   │       "
                    ,"   └──┐ ┌──┘ │  │ │  │ │ ┌─────┘ │  ┌──┐ │ │ ┌─────┘                   │   └──────┐"
                    ,"      │ │    │  └─┘  │ │ └─┐     │  └──┘ │ │ └─┐                       │  ┌────┐  │"
                    ,"      │ │    │  ┌─┐  │ │ ┌─┘     │  ┌┐  ┌┘ │ ┌─┘               ┌───────┘  │    │  │"
                    ,"      │ │    │  │ │  │ │ └─────┐ │  │└┐ └┐ │ └─────┐           └──────────┘    │  │"
                    ,"      └─┘    └──┘ └──┘ └───────┘ └──┘ └──┘ └───────┘                           └──┘"
            };


            printMachine(marathonLevel40, length);
            System.out.println();
        }

        //Image at level 20.
        else if(level ==20){

            String marathonLevel20[] = {
                    ""
                    ,"   ┌──┐ ┌──┐ ┌───────┐ ┌─┐       ┌───────┐┌────┐                                   "
                    ,"   │  │ │  │ │  ┌─┐  │ │ │       │ ┌─────┘│  o └┐               ┌┐          ┌┐     "
                    ,"   │  └─┘  │ │  └─┘  │ │ │       │ └─┐    │   -┌┘┌──┐           ├┼──────────┼┤     "
                    ,"   │  ┌─┐  │ │  ┌─┐  │ │ │       │ ┌─┘    └────┘ │  │           ││ G O A L  ││     "
                    ,"   │  │ │  │ │  │ │  │ │ └─────┐ │ │┌─────────┐  │  │           ├┼──────────┼┤     "
                    ,"   └──┘ └──┘ └──┘ └──┘ └───────┘ └─┘│  ┌──┐   └──┘  │ ─  ─  ── ─┴┴─ ────────┴┴─────"
                    ,"   ~    ~   ~   ~   ~   ~ ~ ~       │  │  │   ┌─────┘                              "
                    ,"         ~    ~     ~   ~   ~       └──┘  │   │       ┌─┐   ┌─┐ ┌───────┐ ┌──┐  ┌─┐"
                    ,"   ~    ~   ~   ~   ~   ~ ~ ~ ~ ~         │   └──────┐│ │   │ │ │  ┌─┐  │ │  │  │ │"
                    ,"     ~    ~  ~   ~ ~       ~   ~  ~       │  ┌────┐  ││ │┌─┐│ │ │  └─┘  │ │  └──┘ │"
                    ,"     ~    ~     ~   ~   ~  ~ ~    ┌───────┘  │    │  ││ └┘ └┘ │ │  ┌─┐  │ └─────┐ │"
                    ,"   ~    ~    ~   ~   ~   ~   ~    └──────────┘    │  ││  ┌─┐  │ │  │ │  │ ┌─────┘ │"
                    ,"    ~    ~   ~    ~  ~       ~ ~   ~ ~ ~          └──┘└──┘ └──┘ └──┘ └──┘ └───────┘"
            };

            printMachine(marathonLevel20, length);
            System.out.println();
        }

        //Image at other levels.
        else {

            String marathonLevel[] = {
                    ""
                    ,"     ┌─┐       ┌───────┐ ┌─┐  ┌──┐ ┌───────┐ ┌─┐             ┌──┐ ┌──┐ ┌───────┐"
                    ,"     │ │       │ ┌─────┘ │ │ ┌┘ ┌┘ │ ┌─────┘ │ │             │  │ │  │ │  ┌──┐ │"
                    ,"     │ │       │ └─┐     │ │┌┘ ┌┘  │ └─┐     │ │             │  │ │  │ │  └──┘ │"
                    ,"     │ │       │ ┌─┘     │ └┘ ┌┘   │ ┌─┘     │ │             │  │ │  │ │  ┌────┘"
                    ,"     │ └─────┐ │ └─────┐ │   ┌┘    │ └─────┐ │ └─────┐       │  └─┘  │ │  │     "
                    ,"     └───────┘ └───────┘ └───┘     └───────┘ └───────┘       └───────┘ └──┘     "
            };

            printMachine(marathonLevel, length);
            System.out.println();
        }
    }

    /** Game Over Screen for Marathon Game. */
    public static void marathonGameOver(){

        //Pause length sent to printMachine.
        int length = 80;

        String marathonOver[] = {
                ""
                ,""
                ,"                             ┌───────────────┐┌───────┐                                 "
                ,"                             │               ││ ]   X │                                 "
                ," ┌────────┐┌────────┐┌──┐   ┌│   ┌────────┐  │└───┐ ┌─┘──┐┌─┐   ┌──┐┌────────┐┌────────┐"
                ," │  ┌──┐  ││  ┌──┐  ││  ┌────┘   │ ┌─────┘│  │  │ └─┘─┐  ││ │  ┌┘  ││  ┌─────┘│  ┌──┐  │"
                ," │  │  └──┘│  │  │  ││  └────────┘ │      │  │  │  │  │  ││ │ ┌┘  ┌┘│  │      │  │  │  │"
                ," │  │      │  └──┘  ││  ┌┐ ┌┐  ││  └─┐    └──┘  │  │  │  ││ │┌┘  ┌┘ │  └─┐    │  └──┘  │"
                ," │  │ ┌───┐│  ┌──┐  ││  │└─┘│  ││  ┌─┘          │  │  │  ││ └┘  ┌┘  │  ┌─┘    │  ┌─┐  ┌┘"
                ," │  │ └┐  ││  │  │  ││  │   │  ││  │            │  │  │  ││    ┌┘   │  │      │  │ │  └┐"
                ," │  └──┘  ││  │  │  ││  │   │  ││  └─────┐      │  └──┘  ││   ┌┘    │  └─────┐│  │ │   │"
                ," └────────┘└──┘  └──┘└──┘   └──┘└────────┘      └────────┘└───┘     └────────┘└──┘ └───┘"
                ,"_________________________________________________________________________________________"
                ,"_________________________________________________________________________________________"
        };

        //Print marathonOver array.
        printMachine(marathonOver, length);
        System.out.println();

        pauseLine(2000);
    }

    /** Marathon Countdown images. */
    public static void marathonCountdown(){

        //Length sent to pauseLine.
        int length = 1000;

        System.out.println();
        System.out.println("                                   ┌─────────────┐                                       ");
        System.out.println("                                  ┌┘  ┌───────┐  └┐                                      ");
        System.out.println("                                 ┌┘  ┌┘       └┐  └┐                                     ");
        System.out.println(" * * * * * * * * * * * * * * * * └───┘         │   │  * * * * * * * * * * * * * * * * *  ");
        System.out.println("                                              ┌┘  ┌┘                                     ");
        System.out.println("  * * * * * * * * * * * * * * * *         ┌───┘  ┌┘  * * * * * * * * * * * * * * * * * * ");
        System.out.println("                                          └───┐  └┐                                      ");
        System.out.println(" * * * * * * * * * * * * * * * *              └┐  └┐  * * * * * * * * * * * * * * * * *  ");
        System.out.println("                                 ┌───┐         │   │                                     ");
        System.out.println("                                 └┐  └┐       ┌┘  ┌┘                                     ");
        System.out.println("                                  └┐  └───────┘  ┌┘                                      ");
        System.out.println("                                   └─────────────┘                                       ");
        System.out.println();
        System.out.println();

        pauseLine(length);
        System.out.println("                                   ┌─────────────┐                                       ");
        System.out.println("                                  ┌┘  ┌───────┐  └┐                                      ");
        System.out.println("                                 ┌┘  ┌┘       └┐  └┐                                     ");
        System.out.println(" * * * * * * * * * * * * * * * * └───┘         │  ┌┘  * * * * * * * * * * * * * * * * *  ");
        System.out.println("                                             ┌─┘ ┌┘                                      ");
        System.out.println("  * * * * * * * * * * * * * * * *          ┌─┘ ┌─┘   * * * * * * * * * * * * * * * * * * ");
        System.out.println("                                         ┌─┘ ┌─┘                                         ");
        System.out.println(" * * * * * * * * * * * * * * * *       ┌─┘ ┌─┘        * * * * * * * * * * * * * * * * *  ");
        System.out.println("                                     ┌─┘ ┌─┘                                             ");
        System.out.println("                                   ┌─┘ ┌─┘                                               ");
        System.out.println("                                 ┌─┘   └──────────┐                                      ");
        System.out.println("                                 └────────────────┘                                      ");
        System.out.println("\n");

        pauseLine(length);
        System.out.println("                                         ┌──┐                                            ");
        System.out.println("                                       ┌─┘  │                                            ");
        System.out.println("                                     ┌─┘    │                                            ");
        System.out.println(" * * * * * * * * * * * * * * * *     └───┐  │         * * * * * * * * * * * * * * * * *  ");
        System.out.println("                                         │  │                                            ");
        System.out.println("  * * * * * * * * * * * * * * * *        │  │        * * * * * * * * * * * * * * * * * * ");
        System.out.println("                                         │  │                                            ");
        System.out.println(" * * * * * * * * * * * * * * * *         │  │         * * * * * * * * * * * * * * * * *  ");
        System.out.println("                                         │  │                                            ");
        System.out.println("                                         │  │                                            ");
        System.out.println("                                   ┌─────┘  └─────┐                                      ");
        System.out.println("                                   └──────────────┘                                      ");
        System.out.println("\n");

        pauseLine(length);
        System.out.println("                    ┌─────────┐        ┌─────────┐      ┌──┐  ┌──┐  ┌──┐                 ");
        System.out.println("                   ┌┘         └┐      ┌┘         └┐     │  │  │  │  │  │                 ");
        System.out.println("                  ┌┘   ┌───┐   └┐    ┌┘   ┌───┐   └┐    │  │  │  │  │  │                 ");
        System.out.println(" * * * * * * * *  │   ┌┘   └────┘    │   ┌┘   └┐   │    │  │  │  │  │  │  * * * * * * *  ");
        System.out.println("                  │   │              │   │     │   │    │  │  │  │  │  │                 ");
        System.out.println("  * * * * * * * * │   │              │   │     │   │    │  │  │  │  │  │ * * * * * * * * ");
        System.out.println("                  │   │    ┌────┐    │   │     │   │    │  │  │  │  │  │                 ");
        System.out.println(" * * * * * * * *  │   │    └┐   │    │   │     │   │    │  │  │  │  │  │  * * * * * * *  ");
        System.out.println("                  │   └┐   ┌┘   │    │   └┐   ┌┘   │    │  │  │  │  │  │                 ");
        System.out.println("                  └┐   └───┘   ┌┘    └┐   └───┘   ┌┘    └──┘  └──┘  └──┘                 ");
        System.out.println("                   └┐         ┌┘      └┐         ┌┘     ┌──┐  ┌──┐  ┌──┐                 ");
        System.out.println("                    └─────────┘        └─────────┘      └──┘  └──┘  └──┘                 ");

        pauseLine(200);
    }

    /** Creates 3 lines to appear between game logos. */
    public static void logoEnd(){

        //3 iterations of a straight line.
        for(int i = 0; i<3; i++) {
            System.out.println("_____________________________________________"
                              + "____________________________________________");
            pauseLine(600);
        }

        System.out.println();
    }

    /** 'Top Secret Banana' Easter Egg. Only Appears if user gets 100% on all 'Pop-Quiz' scores.
     *  A Menu option for 'Top Secret Banana' will appear in the High Scores screen. */
    public static void topSecretBanana(){

        String[] banana = {
                " A"
                ,"BAN"
                ,"BANA"
                ," BANAn"
                ,"  Ban An             TOP SECRET BANANA"
                ,"   B A  Na"
                ,"   B  A   Na"
                ,"    B  Aa   Na                                naNa"
                ,"     B   Aa   Na                            na N  A"
                ,"      B    An   Ana                    nanaN  A  N"
                ,"       B     A     Nanan        anananA     nA  N"
                ,"        B     An        AnananaN          aN   A"
                ,"         B      An                     anA   nA"
                ,"          Ba      Nanana          nanaN    aN"
                ,"            Ba          NananananA       nA"
                ,"              Bana                   nanA"
                ,"                  Banana        nanaN"
                ,"                        BanananA"

        };

        printMachine(banana, 200);

        pauseLine(2000);

    }

    /** Print images to the console interspersed with pauses.
     *  This is meant to emulate the loading-style of old game consoles.
    *  @param image Image to be printed to console.
    *  @param length Length of the pause between lines (in ms). */
    private static void printMachine(String[] image, int length){

        //Print each content of an array followed by a pause.
        for(String i : image){
            System.out.println(i);
            pauseLine(length);
        }
    }

    /** Uses Thread.sleep to pause console action.
     *  @param pause Length of the pause (in ms). */
    public static void pauseLine(int pause){

        //Sleep the program for amount of time.
        try {
            Thread.sleep(pause);
        }

        //Catch interrupt error.
        catch (InterruptedException error) {
            error.printStackTrace();
        }
    }

    /** For marathonMap; spaces ahead of character.
     *  @param printOut String used to create space.
     *  @param questNum Current question number dictates location of character. */
    private static void preSpacing(String printOut, int questNum){

        for (int i = 1; i < questNum; i++)
            System.out.print(printOut);
    }

    /** For marathonMap; spaces after character.
     *  @param printOut String used to create space.
     *  @param questNum Current question number dictates location of character. */
    private static void postSpacing(String printOut, int questNum){

        for (int i = 42; i > questNum; i--)
            System.out.print(printOut);
    }
}
