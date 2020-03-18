package day55;

public class Practice {

    public Practice() {
//        super();
        this(100);
        System.out.println(" no arg constructor ");

    }

    //     any  object you created using constructor must call no arg constructor first
    public Practice(int x) {
//        super();
//        this();
        System.out.println(" 1 arg constructor " + x);

    }

    public Practice(String str) {
        //this();
        this(100);
        System.out.println(" 1 arg constructor with String" + str);
    }


    public static void main(String[] args) {
        // 25 --> 7-9-  15-18 - 7-10 --- done 28
        Practice t = new Practice("abc");


    }

}
