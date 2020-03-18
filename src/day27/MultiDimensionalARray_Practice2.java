package day27;

public class MultiDimensionalARray_Practice2 {
    public static void main(String[] args) {
        String[] developersTeam = {"Vladislav", "Hasan" ,"Tolkun","Abide" };
        String[] testersTeam = {"Zhibekchach" , "Mohammed Sohrabi", "Nursultan"};
        String[] businessAnalysitsTeam = {"Lisa","Ershad", "Naila"};
        String[][] scrumTeam = { developersTeam , testersTeam, businessAnalysitsTeam };

        int shortest = scrumTeam[0][0].length();
        String shortNamedMember = "";
        for (String[] eachTeam : scrumTeam) {
            for (String eachMember : eachTeam) {
                if (eachMember.length()< shortest) {
                    shortest = eachMember.length();
                    shortNamedMember = eachMember;
                }
            }
        }
        System.out.println("shortNamedMember = " + shortNamedMember);
        System.out.println("shortest = " + shortest);


    }
}
