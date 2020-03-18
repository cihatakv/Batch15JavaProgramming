package day46;

public class JavaProgrammer extends Programmer {

    public void drinkCoffee() {
        System.out.println("Drinking Coffee");
    }

    public void doRepl() {
        System.out.println("Doing Repl");
    }

    public void doJavaDevelopment() {
        System.out.println("Doing Java Development");
    }

    @Override
    void code() {
        super.code();
    }

    @Override
    void test() {
        super.test();
    }
}
