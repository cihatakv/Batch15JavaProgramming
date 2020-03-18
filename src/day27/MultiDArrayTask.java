package day27;

public class MultiDArrayTask {
    public static void main(String[] args) {
        String[] developersTeam = {"Vladislav", "Hasan", "T.         olkun", "Abide"};
        String[] testerTeam = {"Zhibekchach", "Mohammed Sohrabi", "Nursultan"};
        String[] businessAnalystTeam = {"Lisa", "Ershad", "Naila"};

        String[][] scrumTeam = {developersTeam, testerTeam, businessAnalystTeam};

        String longestStr = "";
        int maxLength = scrumTeam[0][0].length();
        for (int i = 0; i < scrumTeam.length; i++) {
            for (int j = 0; j < scrumTeam[i].length; j++) {
                if (scrumTeam[i][j].length() > maxLength) {
                    maxLength = scrumTeam[i][j].length();
                    longestStr = scrumTeam[i][j];
                }
            }
        }
        System.out.println(longestStr + " has " + maxLength + " characters.");

        System.out.println("=================================================");

        String longestString = "";
        for(String[]  each1DArray  :  scrumTeam ){
            for( String eachElement :  each1DArray ){
                if(maxLength < eachElement.length() ){  // to compare which string has the largest length
                    maxLength = eachElement.length();
                    //  to assign maximum string length

                    longestString = eachElement;
                    // if the string has the largest length, we assign that string to longestString
                }
            }
        }
        System.out.println(maxLength);
        System.out.println(longestString);



        for(String[]  each1DArray  :  scrumTeam ){
            for( String eachElement :  each1DArray ){
                if(maxLength == eachElement.length() ){
                    System.out.println(eachElement);
                }
            }
        }



    }
}
