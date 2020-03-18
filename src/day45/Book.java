package day45;

// If we do not explicitly (visibly, manually) extends another class
// we always automatically extends Object class
// Object class is super class of all the classes in Java
public class Book {

    public static void main(String[] args) {
        Book b1 = new Book();

        System.out.println(b1.toString());

    }

    @Override
    public String toString() {
        return "My own version of toString";
    }
}
