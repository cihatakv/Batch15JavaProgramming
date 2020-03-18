package day64;

import java.util.*;

public class MapEntrySetView_Practice {
    public static void main(String[] args) {


        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "Female");
        employeeMap.put("Winfred", "Male");
        employeeMap.put("Jereme", "Male");
        employeeMap.put("Glad", "Female");
        employeeMap.put("Desirae", "Female");
        employeeMap.put("Kakalina", "Female");
        employeeMap.put("Bertrando", "Male");
        employeeMap.put("Ajay", "Female");
        employeeMap.put("Brigitte", "Female");
        employeeMap.put("Derk", "Male");
        employeeMap.put("Orlando", "Male");
        employeeMap.put("Selle", "Female");
        employeeMap.put("Marika", "Female");
        employeeMap.put("Griffy", "Male");
        employeeMap.put("Shanon", "Female");
        employeeMap.put("Clerkclaude", "Male");
        employeeMap.put("Rickard", "Male");
        employeeMap.put("Job", "Male");
        employeeMap.put("Aida", "Female");
        employeeMap.put("Alonzo", "Male");

        System.out.println("employeeMap = " + employeeMap);


        //Task1 : get the name of all the Female from map

        Set<Map.Entry<String, String>> entryView = employeeMap.entrySet();


        for (Map.Entry<String, String> eachEmployee : employeeMap.entrySet()) {

            if (eachEmployee.getValue().equals("Female")) {
                System.out.println("eachEmployee.getKey() = " + eachEmployee.getKey());
            }
        }

        // Task 2:

        for (Map.Entry<String, String> eachEmployee : employeeMap.entrySet()) {
            if (eachEmployee.getValue().equals("Female")) {
                eachEmployee.setValue("Queen");
                System.out.println("eachEmployee.getKey() = " + eachEmployee.getKey());
            } else {
                eachEmployee.setValue("King");
            }
        }

        System.out.println("employeeMap = " + employeeMap);









//        Set<Map.Entry<String,String>> entryView= employeeMap.entrySet();
//        for(Map.Entry<String,String> each: entryView){
//            if(each.getValue().equals("Female")){
//                System.out.println("each.getKey() = " + each.getKey());
//            }
//        }


//         for (Map.Entry<String, String> each : entryView) {
//                    if (each.getValue().equalsIgnoreCase("female"))
//                    System.out.println(each.getKey());
//                }
//            }

//         for (Map.Entry<String, String> each:entryset){
//            if (each.getValue().equalsIgnoreCase("female")){
//                System.out.println(each.getKey());
//            }
//        }
//
//        Set<Map.Entry<String,String>> employee=employeeMap.entrySet();
//        for (Map.Entry<String, String> each : employee) {
//            if(each.getValue().equals("Female")){
//                System.out.println(each.getKey());
//
//            }
//        }




    }
}
