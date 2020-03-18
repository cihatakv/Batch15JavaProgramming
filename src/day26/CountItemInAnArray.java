package day26;

import java.util.Arrays;

public class CountItemInAnArray {
    public static void main(String[] args) {
        String[] marvelHeroes = {"Iron Man", "Captain America", "Spider man", "Black Panther",
                "Hulk", "Black Widow", "Wanda", "Captain Marvel", "Captain America", "Spider man",
                "Black Widow", "Wanda", "Captain Marvel", "Captain America"};
        System.out.println("Marvel Heroes = " + Arrays.toString(marvelHeroes));

        int sizeOfArray = marvelHeroes.length;
        System.out.println("Hero count = " + sizeOfArray);

        String itemToSearch = "Iron Man";
        int itemCount = 0;

        for (String eachHero : marvelHeroes) {
            if (eachHero.equals("Captain America"))
                itemCount++;
        }
        System.out.println("itemCount = " + itemCount);

        System.out.println("--------------------------------");
        System.out.println("Find how many BLACK in the array");
        String wordToSearch = "BLACK";
        int wordCount = 0;

        for (String eachHero : marvelHeroes) {
            eachHero = eachHero.toUpperCase();
            if (eachHero.contains("BLACK"))
                wordCount++;
        }
        System.out.println("Black word Count = " + itemCount);
        System.out.println("--------------------------------");

        System.out.println("Find longest one in the array");

        int max = marvelHeroes[0].length();
        int indexOfLongest = 0;
        for (int i = 0; i < marvelHeroes.length; i++) {
            if (marvelHeroes[i].length() > max) {
                max = marvelHeroes[i].length();
                indexOfLongest = i;
            }
        }
        System.out.println("Longest one is " + indexOfLongest + " with " + max + " characters.");
        System.out.println("------------------------------------");
    }
}
