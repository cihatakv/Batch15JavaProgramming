package day17;

public class WhileLoopReverseName {
    public static void main(String[] args) {
        String name = "Cihat";
        int i = name.length() -1;
        while (i >= 0){
            System.out.print(name.charAt(i));
            i--;
        }
    }
}
