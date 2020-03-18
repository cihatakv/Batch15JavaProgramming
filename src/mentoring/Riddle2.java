package mentoring;

public class Riddle2 {
    public static void main(String[] args) {
        boolean first, second, third, fourth;
        for (int address = 1000; address <= 9999; address++) {
            int temp = address;
            // address= 1942
            int d1, d2, d3, d4;
            d1 = temp / 1000;        // d1=1
            temp = temp % 1000;   // 1942 % 1000 = 942
            d2 = temp / 100;         // d2=9
            temp = temp % 100;    // 942 % 100 = 42
            d3 = temp / 10;          // 42 /10 =4
            d4 = temp % 10;          // 42 % 10 = 2
            //System.out.println(d1 +" - "+d2+" - "+d3+" - "+d4);
            //First Condition
            if (d1 != d2 && d1 != d3 && d1 != d4 && d2 != d3 && d2 != d4 && d3 != d4) {
                first = true;
            } else {
                first = false;
                continue;
            }
            //Second condition
            if (d1 == 3 * d3) {
                second = true;
            } else {
                second = false;
                continue;
            }
            //Third condition
            if (address % 2 == 1) {
                third = true;
            } else {
                third = false;
                continue;
            }
            //Fourth condition
            if ((d1 + d2 + d3 + d4) == 27) {
                fourth = true;
            } else {
                fourth = false;
                continue;
            }
            if (first == true && second == true && third == true && fourth == true) {
                System.out.println("\nThe address is " + address);
                break;
            }
        }
    }
}
