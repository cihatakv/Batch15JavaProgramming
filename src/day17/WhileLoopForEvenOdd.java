package day17;

public class WhileLoopForEvenOdd {
    public static void main(String[] args) {

        int counter = 0;
        String evenNumber = "";
        String oddNumber = "";
        while (counter < 50){
            counter++;
            if (counter %2 == 0)
                evenNumber += counter + " ";
            else
                oddNumber += counter + " ";
        }
        System.out.println("oddNumber = " + oddNumber);
        System.out.println("evenNumber = " + evenNumber);
    }
}
