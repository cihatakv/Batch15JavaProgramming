package day47;

public class ExtremeSport extends Sport {

    public static void main(String[] args) {

        ExtremeSport e1 = new ExtremeSport();

        // ExtremeSport.X = 5;
        System.out.println("e1.X = " + e1.X);

    }

//    @Override
//    public void doSomething(){
//        System.out.println("Doing extreme sport");
//    }

    public void doSomething(int x) {
        System.out.println("Doing extreme sport");
        super.doSomething();
    }

    @Override
    public void doSomethingElse() {
//        super.doSomethingElse();
        System.out.println("doing something else in extreme sport");
    }
}
