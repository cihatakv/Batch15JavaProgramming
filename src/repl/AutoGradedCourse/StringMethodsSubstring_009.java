package repl.AutoGradedCourse;

public class StringMethodsSubstring_009 {
    public static void main(String[] args) {
        String str = "laptops out for harambe";
        //            01234567890123456789012
        //write code below
        System.out.println(str.substring(5)); // write a print statement that prints out a substring of str starting at index 5 and going to the end
        System.out.println(str.substring(7, 10)); // write a print statement that prints out a substring of str starting at index 7 and ending at index 10

        //fill in the blanks below:
        System.out.println(str.substring(16));      //fill in substring so it prints "harambe"
        System.out.println(str.substring(10, 13));  //fill in substring so it prints "t f"
    }
}
