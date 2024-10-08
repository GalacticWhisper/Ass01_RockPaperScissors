import java.util.Scanner;
public class RPS {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String player1Move = "";
        String player2Move = "";
        String YN = "";
        boolean player1done = false;
        boolean player2done = false;
        boolean done = false;
        boolean YNDone = false;

        System.out.println("Welcome to Rock/Paper/Scissors!"); // This welcome message is outside the Do While Loop; it should only execute the first time through.

        do {
            do {
                YNDone = false;
                player1done = false;
                player2done = false;
                System.out.println("Player 1, please enter R, P, or S: ");
                player1Move = in.next();
                if (player1Move.equalsIgnoreCase("R"))
                {
                    player1done = true;
                    do
                    {
                        System.out.println("Player 2, please enter R, P, or S: ");
                        player2Move = in.next();
                        if (player2Move.equalsIgnoreCase("R"))
                        {
                            player2done = true;
                            System.out.println("Rock VS Rock ties!");
                        } else if (player2Move.equalsIgnoreCase("P"))
                        {
                            player2done = true;
                            System.out.println("Paper covers Rock! Player 2 wins!");
                        }
                        else if (player2Move.equalsIgnoreCase("S"))
                        {
                            player2done = true;
                            System.out.println("Rock breaks Scissors! Player 1 wins!");
                        }
                        else
                        {
                            System.out.println("Player 2's input, " + player2Move + ", is invalid. Please enter R, P, or S.");
                        }
                    } while (!player2done);
                } else if (player1Move.equalsIgnoreCase("P"))
                {
                    player1done = true;
                    do {
                        System.out.println("Player 2, please enter R, P, or S: ");
                        player2Move = in.next();
                        if (player2Move.equalsIgnoreCase("R"))
                        {
                            player2done = true;
                            System.out.println("Paper covers Rock! Player 1 wins!");
                        }
                        else if (player2Move.equalsIgnoreCase("P"))
                        {
                            player2done = true;
                            System.out.println("Paper VS Paper ties!");
                        }
                        else if (player2Move.equalsIgnoreCase("S"))
                        {
                            player2done = true;
                            System.out.println("Scissors cuts Paper! Player 2 wins!");
                        }
                        else
                        {
                            System.out.println("Player 2's input, " + player2Move + ", is invalid. Please enter R, P, or S.");
                        }
                    } while (!player2done);
                } else if (player1Move.equalsIgnoreCase("S"))
                {
                    player1done = true;
                    do
                    {
                        System.out.println("Player 2, please enter R, P, or S: ");
                        player2Move = in.next();
                        if (player2Move.equalsIgnoreCase("R"))
                        {
                            player2done = true;
                            System.out.println("Rock breaks Scissors! Player 2 wins!");
                        }
                        else if (player2Move.equalsIgnoreCase("P"))
                        {
                            player2done = true;
                            System.out.println("Scissors cuts Paper! Player 1 wins!");
                        }
                        else if (player2Move.equalsIgnoreCase("S"))
                        {
                            player2done = true;
                            System.out.println("Scissors VS Scissors ties!");
                        }
                        else
                        {
                            System.out.println("Player 2's input, " + player2Move + ", is invalid. Please enter R, P, or S.");
                        }
                    } while(!player2done);
                }
                else
                {
                    System.out.println("Player 1's input, " + player1Move + ", is invalid. Please enter R, P, or S.");
                }
            } while (!player1done);
                do
                {
                    System.out.println("Would you like to play again? [Y/N]: ");
                    YN = in.next();
                    if (YN.equalsIgnoreCase("Y"))
                    {
                        YNDone = true;
                    }
                    else if(YN.equalsIgnoreCase("N"))
                    {
                        YNDone = true;
                        done = true;
                    }
                    else
                    {
                        System.out.println("Invalid input. Please enter Y or N.");
                    }
                } while (!YNDone);
        } while (!done);
    }
}

