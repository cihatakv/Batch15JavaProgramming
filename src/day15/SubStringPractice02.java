package day15;

public class SubStringPractice02 {
    public static void main(String[] args) {
        //              0123456789012345
        String movie = "Lord Of The Ring";
        
        String ringString = movie.substring(12);

        String otherPartOfTheString = movie.substring(4, 12);

        String lordString = movie.substring(0, 4);

        System.out.println(ringString + otherPartOfTheString + lordString);
        System.out.println(ringString.concat(otherPartOfTheString).concat(lordString));



        
        
        
    }
}
