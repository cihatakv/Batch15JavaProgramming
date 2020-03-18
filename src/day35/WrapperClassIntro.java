package day35;

public class WrapperClassIntro {
    public static void main(String[] args) {
        int x = 10;
        // primitive data types are pure value has no attribute or behavious

        // each primitive type has wrapper class that turn it into object so we can treat it

        Integer xObj1 = new Integer(12);
        Integer xObj2 = Integer.valueOf(10);
        Integer xObj3 = Integer.valueOf("10");

        System.out.println(xObj1.equals(12));
        System.out.println(xObj2 == 10);
        System.out.println(xObj3 == 10);
        byte bValue = xObj2.byteValue();

    }
}
