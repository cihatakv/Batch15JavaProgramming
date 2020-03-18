package repl.repl201_225;

public class Utils {
    public static String reverseLetters(String word) {
        //TODO
        String reversedLetterWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            if (Character.isLetter(word.charAt(i)))
                reversedLetterWord += "" + word.charAt(i);
        }
        String newWord = "";
        int index = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i))) {
                newWord += "" + reversedLetterWord.charAt(index);
                index++;
            } else {
                newWord += "" + word.charAt(i);
            }
        }

        return newWord;
    }
}
