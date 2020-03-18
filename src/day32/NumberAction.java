package day32;

public class NumberAction {
    public static void main(String[] args) {
        numberComparison(5, 6);
        stringRepeater("Cihat", 5);
        skipCountBy3from0to50();
        countDownByEvenNumberFrom50to0();
        print1toX(10);
        countDownByEvenNumberFromXtoY(20, 3);
    }

    public static void numberComparison(int num1, int num2) {
        if (num1 > num2)
            System.out.println(num1 + " is more than " + num2);
        else if (num2 > num1)
            System.out.println(num2 + " is more than " + num1);
        else
            System.out.println(num1 + " and " + num2 + " are equal.");
    }

    public static void stringRepeater(String strToRepeat, int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println(strToRepeat);
        }
    }

    public static void skipCountBy3from0to50() {
        for (int i = 0; i <= 50; i++) {
            if (i % 3 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void countDownByEvenNumberFrom50to0() {
        for (int i = 50; i >= 0; i--) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void countDownByEvenNumberFromXtoY(int x, int y) {
        for (int i = x; i >= y; i--) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void print1toX(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
