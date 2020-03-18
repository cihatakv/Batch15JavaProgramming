package day19;

public class HowManyShowedUpACharacter {
    public static void main(String[] args) {
        String name = "Esra fidan";
        int len = name.length();
        int count = 0;

        for (int i = 0; i<len; i++) {

            if (name.charAt(i) == 'a') {
                count++;
                System.out.println('a' + " ==> BINGO FOUND IT !!");
            }
            else
                System.out.println(name.charAt(i));
        }
        System.out.println(count);


    }
}
