package day17;

public class BackwardEvenNumberFinder {
    public static void main(String[] args) {
        int counter = 100;
        String strCounter = "";
        while (counter >= 0) {

            if (counter % 2 == 0 && counter != 0 && counter % 10 != 0 && counter > 10) {
                strCounter += counter + " - ";                
            }
            else if (counter % 10 == 0 && counter != 0){
                strCounter += counter + "\n";
            }
            else if (counter == 0)
                strCounter += " " + counter;
            else if (counter < 10 && counter % 2 == 0)
                strCounter += " " + counter + " - ";

            counter--;
        }
        System.out.println("strCounter =       " + strCounter);
    }
    
}
