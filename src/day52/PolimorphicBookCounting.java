package day52;

import java.util.Arrays;
import java.util.List;

public class PolimorphicBookCounting {
    public static void main(String[] args) {


        Book b1 = new PaperBook("Java", "Akbar", 3);
        Book b2 = new PaperBook("Selenium", "Vasyl", 2);
        Book b3 = new AudioBook("Agile", "Guljannat", 1.8);
        Book b4 = new PaperBook("The Kite Runner", "Khaled Hosseini", 3);
        Book b5 = new PaperBook("Lord of the Rings", "J. R. R. Tolkien", 2000);
        Book b6 = new AudioBook("Game of Thrones", "George R. R. Martin", 95.5);

        List<Book> bookList = Arrays.asList(b1, b2, b3, b4, b5, b6);

        int paperBookCnt = 0;

        for (Book each : bookList) {
            // each.displayInfo();
            if (each.getClass().getSimpleName().contains("PaperBook"))
                paperBookCnt++;
            System.out.println(each.getClass().getSimpleName());
        }

        System.out.println("\n");
        System.out.println("Paper Book Count = " + paperBookCnt);

    }
}
