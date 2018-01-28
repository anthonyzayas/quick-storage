public class GuessCopy {

private int numberOne;
private int numberTwo;
private int numberThree;
private boolean result;



    public GuessCopy(int[] userGuesses){
        this.numberOne = userGuesses[0];
        this.numberTwo = userGuesses[1];
        this.numberThree = userGuesses[2];
       // this.result = result;
        CorrectPattern();
    }


    private void CorrectPattern(){
        this.result = (this.numberOne %3 == 0 && this.numberTwo %3 == 0 && this.numberThree %3 == 0);

    }


    @Override
    public String toString() {

        if(result){
            return ("Correct Guess : " + numberOne + ", " + numberTwo + ", " + numberThree );
        }
        return ("Incorrect Guess : " + numberOne + ", " + numberTwo + ", " + numberThree );

    }
}
