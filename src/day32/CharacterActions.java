package day32;

public class CharacterActions {
    public static void main(String[] args) {
        printAToZ();
        //System.out.print(" ");
        printZToA();
    }

    public static void printAToZ() {
        for (char iChar = 'A'; iChar <= 'Z'; iChar++) {
            System.out.print(iChar + " ");
        }
        // System.out.println();+
    }

    public static void printZToA() {
        for (char iChar = 'Y'; iChar >= 'A'; iChar--) {
            System.out.print(iChar + " ");
        }
        System.out.println();
    }
}
