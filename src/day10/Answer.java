package day10;

public class Answer {
    public static void main(String[] args) {
        String myAnswer = "";
        int myNumber = 45;

        if (myNumber % 5 == 0){
            myAnswer = "Fizz Number";
        }
        else
            myAnswer = "not Fizzzzzzz";
        System.out.println("My number is " + myNumber + ", It is " + myAnswer);
    }
}
