package day22;

public class MultiplationTable {
    public static void main(String[] args) {
        for (int i = 1; i <=12 ; i++) {
            System.out.println("----" + i + "----");
            for (int base = 1; base <= 12 ; base++) {
                System.out.println(i + " x " + base + " = " + i * base);
            }
        }
    }
}
