package com.company;

public class Main {

    public static void main(String[] args) {
        String s1 = "Hello World!";
        String s2 = new String("Good Afternoon !!");
        char ch1[] = {'a','b','c','d','e','f','g'};
        String s3 = new String(ch1);
        String s4 = new String(ch1,2,5);
        byte b1[] = {65,66,67,68,89,90};
        String s5 = new String(b1);
        String s6 = new String(b1,1,4);
        String s7 = new String(s2); //s7 is copy constructor
        System.out.println(s7);
    }
}
