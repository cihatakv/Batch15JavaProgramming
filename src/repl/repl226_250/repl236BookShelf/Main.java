package repl.repl226_250.repl236BookShelf;

import static repl.repl226_250.repl236BookShelf.Shelf.addBook;

public class Main {
    public static void main(String[] args) {


        //  *Drink{name='Iced Coffee', cost=4.5, quantity=10}

        String name = "Iced Coffee";
        double cost = 4.5;
        int quantity = 10;
        System.out.println("Drink{name=\'" + name + "\', cost= " + cost + ", quantity=" + quantity + "}");


        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();
        //private String author;
        //    private String title;
        //    private int id;
        //    private int pages;

        b1.setId(1);
        b1.setPages(23);
        b1.setTitle("Lord of THE rings");
        b1.setAuthor("James ha");

        b2.setId(2);
        b2.setPages(65);
        b2.setTitle("Harry potter");
        b2.setAuthor("Cameron ja");

        b3.setId(3);
        b3.setPages(-1);
        b3.setTitle(null);
        b3.setAuthor("Charles dickens");
//        b3.setAuthor(null);

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);

        System.out.println("==================");

        System.out.println("Shelf.addBook(b1) = " + addBook(b1));
        System.out.println("Shelf.addBook(b2) = " + addBook(b2));
        System.out.println("Shelf.addBook(b3) = " + addBook(b3));


        // public static boolean addBook(int id, String author, String title, int pages ){
        //        if (!isIDUnique(id) || title.isEmpty() || pages <=0 )
        //            return false;
        //        else
        //            theBooks.add(new Book(id, author, title, pages));
        //        return true;
        //    }



        /*
        isTitleWordTest2

                addBook_PositiveTest1
        setAuthorTest1
                setAuthorTest2
        capitalizeTest1
                capitalizeTest2
        isTitleWordTest1
                emptyAuthorTest
        setTitleTest1
                setTitleTest3
        emptyShelfTest
                setTitleTest2
        addBook_PositiveTest2
                addBook_PositiveTest3
        getTitleByIDTest
                clearBookShelfTest
        addBook_negative_DuplicateID
                addBook_negative_EmptyTitle
        addBook_negative_Pages
                removeBookByAuthorTest
        findBookByPartialTitleTest
                getAllBooksForAuthorTest
        removeBookByIDTest
*/
    }
}
