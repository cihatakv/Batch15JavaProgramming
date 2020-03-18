package day23;

public class StringArrayPractice {
    public static void main(String[] args) {
        String[] shows = {"Orville","Gifted", "Game of Throne",
                          "Flash", "Arrow", "Super Girl"};
        int showsCount = shows.length;
        System.out.println("Shows Count = " + showsCount);

        for (int i = 0; i < showsCount; i++) {
            System.out.println(shows[i] + " has character count " + shows[i].length());
        }




    }
}
