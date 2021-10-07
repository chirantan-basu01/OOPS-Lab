package com.company;

class copy_constructor{
    public int a;
    copy_constructor(int x){
        a=x;
    }
    copy_constructor(copy_constructor obj){
        a=obj.a;
    }
}

public class Main {

    public static void main(String[] args) {
        copy_constructor c=new copy_constructor(5);
        System.out.println(c.a);
//        copy_constructor b=c; //shallow copy
        copy_constructor b=new copy_constructor(c); //deep copy
        System.out.println(b.a);
        b.a=10;
        System.out.println(b.a);
        System.out.println(c.a);
    }
}
