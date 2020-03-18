package day29;

public class HeroIdentity2_JusticeLeague {
    public static void main(String[] args) {
        String[] allHeroes = {"Superman-Clark Kent",
                "Batman-Bruce Wayne",
                "Wonder Woman-Princess Diana",
                "Aquaman-Arthur Orin Curry",
                "Wonder Woman-Princess Diana",
                "Cyborg-Victor Stone",
                "The Flash-Barry Allen ",
                "Green Lantern-Hal Jordan",
                "Green Arrow-Oliver Queen",
                "Atom-Ray Palmer",
                "Hawkman-Carter Hall",
                "Hawkgirl-Shiera Hall",
                "Zantana-Zantana Zatara",
                "Martian Manhunter-John Jones"};
        for (String eachHero : allHeroes) {
            //System.out.println("each Hero  = " + eachHero);

            String hero1 = eachHero;
            String[] heroSplitted = hero1.split("-");
            String heroCode = hero1.split("-")[0];
            String fullName = hero1.split("-")[hero1.split("-").length -1];

            String stars = "";
            for (int i = 0; i < fullName.length(); i++) {
                stars += "*";
            }
            // System.out.println("stars = " + stars);

            String heroX = hero1.replace(fullName,stars);
            System.out.println("hero = " + hero1);
            System.out.println("hero = " + heroX);

        }



    }
}
/*

 */