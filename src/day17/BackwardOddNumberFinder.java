package day17;

public class BackwardOddNumberFinder {
    public static void main(String[] args) {
        int counter = 100;
        String strCounter = "";
        while (counter >= 0) {

            if (counter % 2 == 1 && counter != 1) {
                strCounter += counter + " - ";                
            }
            else if (counter == 1)
                strCounter += counter;
            counter--;
        }
        System.out.println("strCounter = " + strCounter);
    }
    
}
