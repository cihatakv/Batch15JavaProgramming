package day14;

import javax.xml.namespace.QName;

public class IndexOfPractice {
    public static void main(String[] args) {
        String someThing = "Game of Java";
        System.out.println(someThing.indexOf("a")+1);
        System.out.println(someThing.lastIndexOf("a"));
        System.out.println(someThing.indexOf(" ",8));
    }
}
