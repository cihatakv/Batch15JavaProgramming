package day21;

public class LoopControlStatement2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; ) {
            if (i %2 == 1){
                continue;
            }

            System.out.println(i);
            i++;
        }
    }
}
