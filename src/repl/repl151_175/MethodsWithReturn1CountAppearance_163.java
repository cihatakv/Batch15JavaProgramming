package repl.repl151_175;

public class MethodsWithReturn1CountAppearance_163 {
    public static void main(String[] args) {

    }

    public int count_appearance(String[] arr, String t) {
        int i = 0;
        for (String each : arr) {
            if (each.equals(t))
                i++;
        }

        return i;

    } //end  count_appearance

}
/*
Create a method that gets an array of strings and a string, the method returns an int.
It counts how many times a string appears in the array and returns the count.
for example (pseudo code):
some_array = ["a","foo","bar","foo","bla"]
some_string = "foo"
count_appearance(some_array ,some_string )
will return 2 because some_array  has 2 appearances of "foo" string.
 */