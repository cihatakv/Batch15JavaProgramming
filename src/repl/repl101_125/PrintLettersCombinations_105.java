package repl.repl101_125;

public class PrintLettersCombinations_105 {
    public static void main(String[] args) {
        for (char iChar = 'z'; iChar >= 'v' ; iChar--) {
            for (char jChar = 'z'; jChar >= 'v' ; jChar--) {
                System.out.println(iChar + "" + jChar);
            }
        }
    }
}
