package day20;

public class ThreeCharacterAtATime {
    public static void main(String[] args) {
        String word = "abcdefghijkl";


        for (int i = 0; i < word.length()-2 ; i+= 3) {
            System.out.println(word.substring(i, i + 3));
        }
    }
}
