public class Guess {

    private String[] values;
    //private String guess;

    public Guess(){


    }

    public void takeGuess(String guess){

        this.values = guess.replaceAll(" ", "").split(",");
        System.out.println("Test: The guess is " + guess);
        System.out.println("Test: Values are " + values[0] + ", "+ values[1] + ", ");
/*
       for(int i = 0; i < values.length -1; i++){

       }
*/
    }


    /** DON'T NEED PREVIOUS/ANSWER HERE

    public boolean checkIfPrevious(String guess){

        return guess.equalsIgnoreCase("previous");
    }

    public boolean checkIfAnswer(String guess){

        return guess.equalsIgnoreCase("answer");
    }
    **/

    ///TODO
    public boolean hasErrors(String guess){

        if(checkWrongAnswerAmount() == true || checkPatternErrorExist() == true) return true;

        return false;
    }

    public boolean checkWrongAnswerAmount(){
        return !(values.length == 3);
    }




    //Not implemented
    public boolean checkPatternErrorExist(){

        for(int i = 0; i < values.length -1; i++){
            int holder = Integer.parseInt(values[i]);

            if(holder % 3 != 0){
                return true;
            }
        }
        return false;

    }


    @Override
    public String toString() {
        return "test";//"Number 1 : " + numberOne + " , Number 2 : " + numberTwo + " , Number 3 : " + numberThree;

    }
}
