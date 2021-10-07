package com.company;

class Ref{
    public int a;
    Ref(int x){
        a=x;
    }
}

public class Main {

    static void modify(int a) {
	    a=10;
    }
    static void modify(Ref obj){
        obj.a=10;
    }
    public static void main(String args[]){
        int x=15;
        modify(x);
        System.out.println(x);
        Ref y=new Ref(15);
        modify(y);
        System.out.println(y.a);
    }
}
