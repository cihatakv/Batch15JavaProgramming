package day22;

public class ArrayChar {
    public static void main(String[] args) {
        char[] charArray = new char[5];

        System.out.println("0 = <" + charArray[0] + ">");
        charArray[0] = 'C';
        charArray[1] = 'i';
        charArray[2] = 'h';
        charArray[3] = 'a';
        charArray[4] = 't';

        for (int i = 0; i < charArray.length; i++) {
            System.out.println("charArray[" + i + "] = " + charArray[i]);
        }

        char[] name= {'c','i','h','a','t'};
        System.out.println(name);
    }
}
