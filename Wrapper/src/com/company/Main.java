package com.company;

public class Main {

//    static void modify(Integer x){
//        int a=x;
//        a+=5;
//        x=new Integer(a);
//    }

    public static void main(String[] args) {
	    Integer a;
        a=Integer.parseInt("12");
        System.out.println(a);
//        System.out.println(Integer.floor("3.2"));
        Integer y=5;
        modify(y);
        System.out.println(y);
    }
}
