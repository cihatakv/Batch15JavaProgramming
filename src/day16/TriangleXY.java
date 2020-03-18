package day16;

public class TriangleXY {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++){
            System.out.print("x");
            for (int j = 5-i ; j > 0; j--){
                System.out.print("y");
            }
            System.out.println();
        }
    }
}
