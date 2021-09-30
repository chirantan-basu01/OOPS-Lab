package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    String str = "Hello \"World!\""; // \->suppress character
        String str2 = "   Hello  World   ";
        String str3 = "Kolkata";
        String str4 = "Kolkata";
        String str5 = new String("Kolkata");
        String str6 = new String("Kolkata");
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.substring(2));
        System.out.println(str.substring(1,10));
        System.out.println(str.concat(" Good Afternoon !"));
        System.out.println(str.replace('l','t'));
        System.out.println(str2.trim());
        System.out.println(str.startsWith("H"));
        System.out.println(str.endsWith("Hel"));
        System.out.println(str2.toUpperCase(Locale.ROOT));
        System.out.println(str2.toLowerCase(Locale.ROOT));
        System.out.println(str2.indexOf('l'));
        System.out.println(str.lastIndexOf('l'));


        if(str3 == str4){
            System.out.println("== return true");
        }
        else{
            System.out.println("== return false");
        }
        System.out.println(str3.equals(str4));


        if(str5 == str6){
            System.out.println("== return true");
        }
        else{
            System.out.println("== return false");
        }
        System.out.println(str5.equals(str6));

    }
}
