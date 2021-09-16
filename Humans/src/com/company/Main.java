package com.company;

class Human
{
    String Name;
    int age;
    Human(String n,int i)
    {
        Name = n;
        age = i;
    }
    void Breath()
    {
        System.out.println("I, "+Name+" breathing through lungs");
    }

    void eat(String Food)
    {
        System.out.println("I, "+Name+" eating "+Food );
    }
}


public class Main {

    public static void main(String[] args) {
        Human obj1 = new Human("Chirantan" ,20);
        obj1.Breath();
        obj1.eat("Chowmein");
        Human obj2 = new Human("Rahul" ,25);
        obj2.eat("Maggie");
        obj2.Breath();
    }
}
