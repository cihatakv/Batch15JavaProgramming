package day19;

public class FindingTheCountOfSomething {
    public static void main(String[] args) {
        
        
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.print(i + " ");
                sum++;
            }
        }
        System.out.println();
        System.out.println("sum = " + sum);
        
        
    }
}
