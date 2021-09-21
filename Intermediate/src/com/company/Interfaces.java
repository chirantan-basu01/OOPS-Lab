package com.company;

public class Transformer implements Car,Person{
    public static void main(String[] args){
        Transformer bumbleBee=new Transformer();
    }
    @Override
    public void start(){
        System.out.println("my car is starting");
    }
    @Override
    public void walk(){

    }
}

interface Car{
    void start();
}

interface Person{
    void walk();
}