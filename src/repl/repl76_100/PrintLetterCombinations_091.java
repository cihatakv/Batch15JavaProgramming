package repl.repl76_100;

public class PrintLetterCombinations_091 {
    public static void main(String[] args) {

        for (char iChar = 'z'; iChar >= 'v'; iChar--){
            for (char jChar = 'z'; jChar >= 'v'; jChar--){
                System.out.println(iChar + "" + jChar);
            }
        }
    }
}
