import java.util.Scanner;

public class GameDriver {

    public static void main (String args []){

        Game newGame = new Game();
        System.out.println("Test");
        Scanner keyboard = new Scanner(System.in);
        String word = "";

        /** LOOP RULES
         If the user enters the word "answer", the game will prompt the user to
            1. Guess the rules of the game.
            2. Output the answer to the rules.

         If the user enters 3 numbers seperated by a comma
            1. Store into arrayList
            2. Prompt user "Yes" if input follows sequence
            3. Prompt user "No" if input does not follow sequence

         If the user enters the word "previous", the game will show
            1. all the previous guesses made by the user and if they were right or wrong.

         If any other entry
            1. treat it as an exception

         **/



        System.out.println("Enter the word 'answer' to end the game.");
        System.out.println("Enter the word 'previous' to display all answers until now.");

        while(!word.equalsIgnoreCase("answer")){

            System.out.println("Please enter a number. ");

            word = keyboard.nextLine();
            //word = "3,3,3";
            newGame.checkAnswer(word);
            //word = "previous";
            //if ANSWER game ENDS
            if(word.equalsIgnoreCase("answer")){
                System.out.println("What do you think the pattern is? ");
                String fakeAnswer = (String)keyboard.nextLine();
                System.out.println("The pattern to this game is that all numbers are divisible by 3! ");
            }

            //if PREVIOUS game DISPLAYS ALL VALUES
            if(word.equalsIgnoreCase("previous")){
                System.out.println(newGame);

            }






        }


    }
}
