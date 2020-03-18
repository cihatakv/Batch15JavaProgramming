package repl.repl151_175;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysZombieAttack2_170 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        //TODO. Write you code below this line.
        int day = 0;
        int[] testArr = {0, 0, 0, 0, 0, 0, 0, 0};
        int[] temp = new int[8];
        do {
            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
            ++day;
            int i = 0;
            for (int j = 0; j < inhabitants.length; j++) { //assigning inhabitant array values into temporary array temp
                temp[j] = inhabitants[j];
            }
            while (i < inhabitants.length) {
                if (inhabitants[i] == 0) {
                    if (i == 0) {
                        inhabitants[i + 1] = temp[i + 1] / 2;
                        i += 2;
                    } else if (i == inhabitants.length - 1) {
                        inhabitants[i - 1] = temp[i - 1] / 2;
                        i++;
                    } else {
                        inhabitants[i + 1] = temp[i + 1] / 2;
                        inhabitants[i - 1] = temp[i - 1] / 2;
                        i += 2;
                    }
                } else {
                    i++;
                }
            }
        } while (!Arrays.equals(inhabitants, testArr));

        System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
        System.out.println("---- EXTINCT ----");
    }
}
/*
An array inhabitants represents cities and their respective populations.
For example, the following arrays shows 8 cities and their respective populations:
[3, 6, 0, 4, 3, 2, 7, 0]
Some cities have a population of 0 due to a pandemic zombie disease that is wiping away the human lives.
After each day, any city that is adjacent to a zombie-ridden city will lose half of its population.

Write a program to loop though each city population and make it lose half of
its population if it is adjacent(right or left) to a city with zero people until all cities have no humans left.

 Make updates to each element in the array And print the array like below for each day:

Day 0 [3, 6, 0, 4, 3, 2, 7, 0]
Day 1 [3, 3, 0, 2, 3, 2, 3, 0]
Day 2 [3, 1, 0, 1, 3, 2, 1, 0]
Day 3 [3, 0, 0, 0, 3, 2, 0, 0]
Day 4 [1, 0, 0, 0, 1, 1, 0, 0]
Day 5 [0, 0, 0, 0, 0, 0, 0, 0]
---- EXTINCT ----

Write the program in a way that it will handle any number of people in cities, above was just an example numbers to follow.

Hint:
Below expression will print array in this format:

[3, 6, 0, 4, 3, 2, 7, 0]

Code:
System.out.println(Arrays.toString(inhabitants)));
 */