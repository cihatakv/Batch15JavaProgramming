package repl.repl151_175;

import java.util.Scanner;

public class Methods15PrintUniqueWords_160 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for (int i = 0; i < size; i++) {
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    // java, code, python, code, rust, code, rust
    public static void printUniqueWords(String[] words) {
        //WRITE YOUR CODE HERE
        int cnt;
        for (int i = 0; i < words.length; i++) {
            cnt = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j]))
                    cnt++;
            }
            if (cnt == 1)
                System.out.println(words[i]);
        }
    }
}
/*
Complete a void method printUniqueWords()
that will print only unique words from an array of strings.
Every single unique word should be printed from the new line.
Example:
input:[java, code, python, code, rust, code, rust]
output:
java
python
 */