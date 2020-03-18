package day59;

public class FinallyBlock {
    public static void main(String[] args) {


        int nums[] = {1, 4, 6};


        try {
            System.out.println("nums[5] = " + nums[5]);
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
            e.getSuppressed();
        } finally {
            System.out.println("Finally");
        }


    }
}
