import com.sun.org.apache.bcel.internal.generic.GOTO;

import java.util.*;


public class GameDriverCopy {

    /***
     * Used to Add Guesses to game object
     * @param guess
     */
    public void AddGuess(int[] guess){
        GuessCopy userGuesses = new GuessCopy(guess);
      //  this.game.add(userGuesses);

    }

    /***
     * Converts the users string into a workable int[] object.
     * @param guess
     * @return
     */
    public static int[] ConvertGuessToIntArray(String[] guess){
        int[] guessHolder = new int[guess.length];

        //Converts String array into int holder
        for(int i = 0; i < guess.length; i ++){

            System.out.println("String Value: " + guess[i]);

            //TODO - skip spaces
            if(guess[i].isEmpty()){
                System.out.println("-- Skipping value --");
                continue;
            }

            //TODO check if invalid characters entered|| Can be done w/ try catch
            try {
                System.out.println("!--Trying to Parse : " + guess[i]);
                guessHolder[i] = Integer.parseInt(guess[i]);
                System.out.println("!--Parsed : " + guessHolder[i]);
            }
            catch(Exception ex){


                System.out.println("Enter only numbers and commas! You tried to guess -> " + guess[i]);

                //TODO - prompt user to reenter numbers

            }
        }

        return guessHolder;
    }

    public static String[] ConvertGuessToStringArray(String guess){

        //Replaces excess whitespace in the guess, and splits it into an array
        String[] guessArray = guess.replaceAll(" ", "").split(",");
        return guessArray;

    }


    public static boolean CheckGuessForErrors(String userGuess){

        String[] guessArray = ConvertGuessToStringArray(userGuess);

        if(guessArray.length != 3){ return true; }

        for(String guess: guessArray){

            try{
                int number = Integer.parseInt(guess);
            }catch(Exception ex){
                return true;
            }
        }
        return false;
    }


    /**
     * Prompts the user the rules for the game.
     */
    public static void PromptUser(){
        System.out.println("Try to guess the pattern of the following numbers: 6, 12, 24 !");
        System.out.println("To exit the game, type 'answer', to display past entries enter 'previous' .");
        System.out.println("Now enter 3 numbers separated by a comma (i.e.) #, #, #");
    }


    public static void main (String[] args)  {

        ArrayList<GuessCopy> game = new ArrayList<GuessCopy>();



        System.out.println("Try to guess the pattern of the following numbers: 6, 12, 24 !");


        System.out.println("To exit the game, type 'answer', to display past entries enter 'previous' .");
        System.out.println("Now enter 3 numbers separated by a comma (i.e.) #, #, #");


        Scanner keyboard = new Scanner(System.in);

        String userGuess = keyboard.nextLine();


        while (!userGuess.equalsIgnoreCase("answer")){


            boolean hasErrors = CheckGuessForErrors(userGuess);
            if(hasErrors){PromptUser();}



           // AddGuess(guess); //needs reference to game obj

            PromptUser(); //works but STATIC ATM
            userGuess = keyboard.nextLine();



            if(userGuess.equalsIgnoreCase("previous")){
                game.toString();
            }


            PromptUser(); //works but STATIC ATM
            userGuess = keyboard.nextLine();

        }




        //TODO - check if 3 values were entered
        //boolean threeValues = tempGuessHolder.length == 3;
       // System.out.println("threeValues is " + threeValues);

        //TODO - Flag for loop
        boolean passedTest = true;



        //TODO - Convert Guess answers into Integer Array, if crash, promt user





            System.out.println("PassedTest = " + passedTest);

            /* METHOD CREATED AddGuess()

            if(passedTest){
                GuessCopy userGuesses = new GuessCopy(guessHolder, passedTest);
                game.add(userGuesses);
            }
            */

            System.out.println("User Guesses from ArrayList : " + userGuess);


    }
}

