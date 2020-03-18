package day31;



public class PrintVsPrintln {
    public static void main(String[] args) {
        hello7Times();
        MethodIntro.sayHello();
    }

    public static void hello7Times() {
        // 3 print line statement
        System.out.println("Hello world line 1 ");
        System.out.println("Hello world line 2 ");
        System.out.println("Hello world line 3 ");
// 2 print statement
        System.out.print("Hello world line 4 ");
        System.out.print("Hello world line 5 ");
// 2 print line statement
        System.out.println("Hello world line 6 ");
        System.out.println("Hello world line 7 ");

    }
}
