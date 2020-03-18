package tasks;

import java.util.Arrays;
import java.util.Scanner;

public class WarmUpTaskOn12_19_2019 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

//        1. write a program that can check if a string is build out of the same letters
//        as another string
//        Ex: input:
//        str1 = "abc";
//        str2 = "cba";
//        output:
//        true
        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();

        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);

        System.out.println(Arrays.toString(str1Arr).equals(Arrays.toString(str2Arr)));

        // 2. Write a program that will remove all the duplicates from a string
        //				Do it with Arrays only


    }
}
/*

2. Write a program that will remove all the duplicates from a string
				Do it with Arrays only
	3. given the array of names:
			String[] names = { "Ahmed", "John", "Eric", "Ahmed", "Hassan"};
	   write a program that can remove all the names named Ahmed from the array
	   Ex:
	   		names = { "Ahmed", "John", "Eric", "Ahmed", "Hassan"};
	   		System.out.println( Arrays.toString(names) );
	   		output:
	   			[John, Eric, Hassan]
 */