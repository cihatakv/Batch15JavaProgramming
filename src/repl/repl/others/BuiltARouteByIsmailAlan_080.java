package repl.repl.others;

import java.util.Scanner;

public class BuiltARouteByIsmailAlan_080 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        String map = "ABCDABC";
        String output = "";
        String path = "";
        if (start.equals(end))
            System.out.println(start + " found");
        else if(start.charAt(0)<end.charAt(0))
            path = map.substring(map.indexOf(start), map.indexOf(end));
        else if(start.charAt(0)>end.charAt(0))
            path = map.substring(map.indexOf(start),map.lastIndexOf(end));
        for (int i = 0; i < path.length(); i++) {
            char point = path.charAt(i);
            if (point == 'A')
                output += "right" + " > ";
            if (point == 'B')
                output += "down" + " > ";
            if (point == 'C')
                output += "left" + " > ";
            if (point == 'D')
                output += "up" + " > ";
        }
        if(path!=""){
            output=output.substring(0,output.lastIndexOf(">")-1);
            System.out.println(output+": "+end+" found");
        }
    }
}
