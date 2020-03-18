package exercise.volkanIstek;

public class DisplayPyramid {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            for (int j = 12 - i; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.println(" " + i);
        }
    }
}
/*
Write a program that prompts the user to enter
an integer from 1 to 15 and display a pyramid, as shown below
            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5
  6 5 4 3 2 1 2 3 4 5 6
7 6 5 4 3 2 1 2 3 4 5 6 7

 */