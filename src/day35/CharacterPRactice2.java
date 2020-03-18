package day35;

public class CharacterPRactice2 {
    public static int sumOfNumbers(char iChar) {
        int sum = Integer.parseInt(iChar + "");
        return sum;
    }

    public static void main(String[] args) {
        int sum = 0;
        String str = "1F3G5E7S9";
        char[] strChar = str.toCharArray();

        String strCharDigit = "";
        for (char eachChar : strChar) {
            if (Character.isDigit(eachChar))
                sum += sumOfNumbers(eachChar);
            strCharDigit += eachChar;
        }


        System.out.println("sum = " + sum);
    }
}
