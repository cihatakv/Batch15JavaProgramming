package day20;

public class WorkingWithMoreThanOneCharInString {
    public static void main(String[] args) {
        String word = "Gokyuzum";

//        for (int i = 0; i < word.length(); i++){
//            if (i %2 == 0)
//                System.out.println();
//            System.out.print(word.charAt(i));
//        }
        for (int i = 0; i < word.length()-1 ; i+= 2) {
            System.out.println(word.substring(i, i + 2));
        }
    }
}
