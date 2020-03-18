package day20;

public class PalindromeTest {
    public static void main(String[] args) {
        String word = "kayak";
        String reversedWord = "";
        for (int i = word.length()-1; i >=0; i--)
            reversedWord += word.charAt(i);
        if (word.equalsIgnoreCase(reversedWord))
            System.out.println(word + " is Palindrome");
        System.out.println("--------------");
    }
}
