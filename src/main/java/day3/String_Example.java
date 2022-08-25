package day3;

import java.util.Locale;

public class String_Example {
    public static void main(String[] args) {
        String name = "chaitra";

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.replace("i","1"));
        System.out.println(name.equals("arvind"));
        System.out.println(name==("arvind"));
        System.out.println(name.equalsIgnoreCase("chaitra"));
    }
}
