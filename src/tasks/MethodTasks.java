package tasks;

public class MethodTasks {

    // write a method that can convert km to miles
    public static void convertKmToMiles() {
        int km = 1000;
        double mile = km * 0.612;
        System.out.println(km + " km = " + mile + " miles.");
    }

    // write a method that can convert gallons to litters
    public static void convertGallonsToLitters() {
        int gallon = 2;
        double litter = gallon * 3.75;
        System.out.println(gallon + " G = " + litter + " litters.");
    }

    // write a method that can print out the array in Descending order
    public static String descendingOrderArray(int[] a) {

        return "";
    }

    public static void main(String[] args) {
        convertKmToMiles();
        convertGallonsToLitters();
        int[] arr = {1, 6, 4, 8, 9};
        System.out.println(descendingOrderArray(arr));
    }
}

/*
1. write a method that can convert km to miles
	 				Hint: 1 km = 0.612 miles
	 	2. write a method that can convert gallons to litters
	 			   Hint: 1 G = 3.75 L
	 	3. write a method that can print out the array in Descending order
	 	4. write a method that accepts 3 parameters: 2 numbers and one operator,
	 	and prints out the calculation
		if operator is not between [-, +, *, /, %] output should be Invalid Operator
			Ex: calculate(10, 2, "*") ==> 20;
				calculate(20, 2, "~") ==> invalid operator
		5. write a method that can calculate grade
					if score is 100 ~ 90 ==> A
					if score is 89 ~ 80 ==> B
					if score is 79 ~ 70 ==> C
					if score is 69 ~ 60 ==> D
					if score is 0 ~ 59 ==> F
					otherwise ==> Invalid Score
 */