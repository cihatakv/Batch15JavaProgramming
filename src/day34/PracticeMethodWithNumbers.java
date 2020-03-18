package day34;

public class PracticeMethodWithNumbers {

    public static int build3DigitNumber(int digit1, int digit2, int digit3) {

        // int threeDigit;
        if (digit1 < 10)
            digit1 *= 100;
        else
            digit1 = 0;
        if (digit2 < 10)
            digit2 *= 10;
        else
            digit2 = 0;
        if (digit3 < 10)
            digit3 *= 1;
        else
            digit3 = 0;

        return digit1 + digit2 + digit3;


    }


    public static void main(String[] args) {

        int result1 = build3DigitNumber(5, 0, 6);
        System.out.println("result1 = " + result1);

        int result2 = build3DigitNumber(45, 20, 16);
        System.out.println("result2 = " + result2);

        System.out.println("(result1 + result2) = " + (result1 + result2));
    }
}
/*
1, write a method called build3DigitNumber
   it has 3 int parameters digit1 digit2 digit3
   and it will return the 3 digit numbers you have build
   if any of digit1 digit2 digit3 is not within the range of 0-9 the change it to 0 ,
   for example :
   build3DigitNumber(4,2,4) --->> 424
   build3DigitNumber(0,2,1) --->> 21
   build3DigitNumber(65,6,9) --->> 69
 */