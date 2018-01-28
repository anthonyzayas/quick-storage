import java.util.ArrayList;



public class Game {

    private ArrayList<Guess> test;

    public Game(){

        test = new ArrayList<Guess>();

    }

    public void checkAnswer(String guess){

        Guess answer = new Guess();
        answer.takeGuess(guess);


        // if(!answer.hasErrors(guess)){
             this.test.add(answer);
        // }
         //return false;
    }


    @Override
    public String toString() {
        return test.toString();


    }
}
