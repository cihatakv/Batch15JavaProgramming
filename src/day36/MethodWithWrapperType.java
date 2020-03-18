package day36;

public class MethodWithWrapperType {
    public static void main(String[] args) {


        //			  Auto-Boxing
        //			  ===========>
        //	byte	  					Byte
        //	short	  					Short
        //	int		  					Integer
        //	float	  					Float
        //	long	  					Long
        //	double	  					Double
        //	char	  					Character
        //	boolean	  					Boolean
        //			  <===========
        //			    Unboxing


        // i1 is a variable with data type Integer
        // and it c an store Integer object
        // what's the deal here with 12 ? -->>
        Integer i1 = 12;
        Integer i2 = 20;
        System.out.print("01 -> ");
        sumAndPrint(i1, i2);
        System.out.print("02 -> ");
        sumAndPrint(15, 30);
        System.out.print("03 -> ");
        sumAndPrint(new Integer(5), new Integer(10));
        System.out.print("04 -> ");
        sumAndPrint(Integer.valueOf("3"), Integer.valueOf("2"));

        System.out.println("Print Doubled");

        Integer i3 = 15;
        System.out.println(i3);
    }

    /**
     * This method add 2 Integer numbers and print
     *
     * @param num1 type Integer , first number to add
     * @param num2 type Integer , second number to add
     */
    public static void sumAndPrint(Integer num1, Integer num2) {
        System.out.println(num1 + num2);
    }

    /**
     * This method will print the doubled value of what user passed.
     *
     * @param x
     * @return nothing
     */

    public static void printTheDoubledValue(int x) {
        System.out.println("After Doubling x = " + (x * 2));
    }
}
