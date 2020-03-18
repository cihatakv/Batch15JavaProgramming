package day21;

public class LoopControlStatement {
    public static void main(String[] args) {
        int sum = 0 ;
        for (int i = 0; i <=10 ; i++) {

            sum += i;
            if (sum + i > 40){
                // sum -= i;
                break;
            }
        }
        System.out.println(sum);
    }
}
