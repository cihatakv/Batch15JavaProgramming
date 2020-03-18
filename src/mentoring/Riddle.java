package mentoring;

public class Riddle {
    public static void main(String[] args) {
        int d1, d2, d3, d4;
        for (int streetAddress = 1111; streetAddress <= 1113; streetAddress++) {
            int tempStreetAddress = streetAddress;
            d1 = tempStreetAddress / 1000;
            tempStreetAddress %= 1000;
            d2 = tempStreetAddress / 100;
            tempStreetAddress %= 100;
            d3 = tempStreetAddress / 10;
            //tempStreetAddress %= 10;
            d4 = tempStreetAddress / 1;
            System.out.println(d1 + "" + d2 + "" + d3 + "" + d4);

//            if (d1!=d2 && d1!=d3 && d1!=d4 && d2!=d3 && d2!=d4 && d3!=d4){
//
//
//            }

        }
    }

}
