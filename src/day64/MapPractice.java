package day64;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {
        // What if we want to have multiple value for one key ??
        // for example groupCode (bugHunter) -- group member names (abc, efg , htj , knl)
        // String         List<String>
        // key data type is String , value data type is List<String>
        Map<String, List<String>> groupMap = new HashMap<>();

        groupMap.put("PowerOf4" , Arrays.asList("Furkan","Daria","Serife","Muge")  );
        groupMap.put("Achievers" , Arrays.asList("Maiia", "Anastasia", "Zaki", "Toyly", "Like")  );
        groupMap.put("BugHunter" , Arrays.asList("Ayse","Rabiyam","Gulzina")  );
        groupMap.put("BugBusters", Arrays.asList("Rukhshona","Fariza","Seyma","Sumeyyra","Huvayda"));

        System.out.println("groupMap = " + groupMap);

        // groupMap.forEach(groupCode, allMembers -> System.out.println("groupCode = " + groupCode + "\n\t members : " + allMembers));

        groupMap.forEach( (groupCode,allMembers) -> System.out.println("groupCode = " + groupCode +"\n\t members : "+ allMembers ) );

        System.out.println(groupMap.get("Achievers").get(3));

        // Check whether this map has Gulzina in BugHunter or not

        System.out.println("Is BugHunter contains Gulzina : " + groupMap.get("BugHunter").contains("Gulzina"));

        groupMap.put("Justice League", new ArrayList<>(Arrays.asList("Superman", "Batman", "WonderWoman")));

        groupMap.get("Justice League").add("Flash");

        System.out.println("groupMap.get(\"Justice League\") = " + groupMap.get("Justice League"));






    }
}
