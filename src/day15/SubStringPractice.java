package day15;

public class SubStringPractice {
    public static void main(String[] args) {
        //              0123456789012345
        String movie = "Lord Of The Ring";
        
        String ofString = movie.substring(5, 7);

        System.out.println("ofString = " + ofString);
        
        String wordThe = movie.substring(8, 11);

        System.out.println("wordThe = " + wordThe);

        
        
    }
}
