package day29;

public class HeroIdentity2 {
    public static void main(String[] args) {
        String hero1 = "Superman-Clark J Kent";
        // hide this hero identity
        // String heroX = "Superman-************";

        // Given a string with hero code and name separated by -
        // turn this String into hero code and * with same length as hero name

        // plain english Logic :

        // split it by - to get the code and full name
        // get the length of full name
        // generate stars with same length as full name character count
        // One star is generated, replace fullname with stars
        // concatenate heroCode with dash and stars and save it

        String[] heroSplitted = hero1.split("-");
        String heroCode = hero1.split("-")[0];
        String fullName = hero1.split("-")[hero1.split("-").length -1];

        String stars = "";
        for (int i = 0; i < fullName.length(); i++) {
            stars += "*";
        }
        System.out.println("stars = " + stars);

        String heroX = hero1.replace(fullName,stars);
        System.out.println("hero1 = " + hero1);
        System.out.println("heroX = " + heroX);




    }
}
/*
{"Superman-Clark Kent",
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
"Martian Manhunter-John Jones"}
 */