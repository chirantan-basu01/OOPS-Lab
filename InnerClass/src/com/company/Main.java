package com.company;

class Outer{

    public class Inner{
        int a;
        void display(){
            System.out.println("Inner: " + a);
        }
        void set(int x){
            a = x;
        }
    }
}

public class Main {

    public static void main(String[] args) {
	    Outer obj1 = new Outer();
        Outer.Inner obj2 = obj1.new Inner();
        obj2.set(5);
        obj2.display();
    }
}
