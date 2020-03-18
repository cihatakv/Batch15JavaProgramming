package day22;

public class ArrayCreation2 {
    public static void main(String[] args) {
        int[] ages = new int[]{3, 5, 11, 33, 57, 18};

        int itemCount = ages.length;

        int[][] people = new int[][]{{1, 13} , {1, 15}, {2, 8}, {2, 16} };

        System.out.println(people[0][1]);

    }
}
