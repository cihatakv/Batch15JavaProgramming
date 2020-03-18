package day36;

public class WrapperClassRecall {
    public static void main(String[] args) {
        System.out.println(Integer.parseInt('9' + ""));
        System.out.println('9' == 9);
        char myChar = '9';
        int asciiChar = myChar;
        System.out.println((int) '9');

        Integer i = Integer.valueOf("100");
        System.out.println(Integer.parseInt("123") + 1);
    }
}
