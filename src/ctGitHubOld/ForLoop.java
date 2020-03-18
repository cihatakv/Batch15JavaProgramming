package ctGitHubOld;

public class ForLoop {
    public static void main(String[] args) {
        // 1,2,3,4,5,6

        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i] + " " + arr[i + 1]);
        }

    }
}
/*
1 2
3 4
5 6
 */