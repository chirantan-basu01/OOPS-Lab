package com.company;

class encapsulation {
    int def_variable;
    public int pub_variable;
    private int prv_variable;
    protected int prt_variable;
}

public class Main {

    public static void main(String[] args) {
	    encapsulation obj = new encapsulation();
        obj.def_variable = 5;
        obj.pub_variable = 10;
        obj.prt_variable = 15;
        System.out.println(obj.def_variable);
        System.out.println(obj.pub_variable);
        System.out.println(obj.prt_variable);
    }
}
