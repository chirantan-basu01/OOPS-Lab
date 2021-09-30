package com.company;

public class Main {

    public static void main(String[] args) {
	    String str = "Hello";
        System.out.println(str);
        str = str + " World !";//creates a new object after joining 2 string str and "world"
        System.out.println(str);
        StringBuffer str2 = new StringBuffer("Good");
        str2.append(" Afternoon !");//modifies the original object str2 and append the new string "afternoon" - doesn't create any new object
        System.out.println(str2);
    }
}
