package com.company;

import encapsulation.EncapsulationIntro;

public class Main {

    public static void main(String[] args) {
        //Classes and Objects

//        Person p1=new Person();
//        p1.age=20;
//        p1.name="Chirantan";
//        Person p2=new Person();
//        p2.age=20;
//        p2.name="Basu";
//        System.out.println(p1.age+ " "+p1.name);
//        System.out.println(p2.age+ " "+p2.name);

        //Methods - calling functions

//        p1.eat();
//        p2.walk();

        //Polymorphism - taking multiple forms or calling functions with diff arguments

//        p2.walk();
//        p2.walk(4);

        //Constructors

//        Person function inside class person is constructor
//        It is printing 2 times "Creating an object" because of p1 and p2
//        Person p1=new Person();
//        p1.age=20;
//        p1.name="Chirantan";
//        Person p2=new Person(22,"Rahul Gandhi");
//        p2.walk();
//        p2.walk(4);

        //[static]-keyword

//        System.out.println(Person.count);

        //Inheritance

//        Developer d1=new Developer(20,"Shivam");
//        d1.walk(); //walk is working in multiple forms(runtime-polymorphism)

        //Encapsulation

        EncapsulationIntro obj = new EncapsulationIntro();
        obj.doWork();
    }
}

//Inheritance
class Developer extends Person{
    public Developer(int age,String name){
        //[super]-keyword ->is used to call parent constructor
        super(age,name);
    }
    void walk(){
        System.out.println("Developer " + name + " is walking.");
    }
}

//Classes and Objects
class Person{
    String name;
    int age;
    static int count;

    //Constructor
//    public Person(){
//        count++;
//        System.out.println("Creating an object");
//    }
    //Constructor overloading
    public Person(int newAge, String newName){
        //[this]-keyword->can call different constructors with the help of this
//        this();
        name=newName;
        age=newAge;
    }
    //Methods
    void walk(){
        System.out.println(name + " is walking.");
    }
    void eat(){
        System.out.println(name + " is eating.");
    }
    void walk(int steps){
        System.out.println(name + " walked " + steps + " steps.");
    }
    //Inheritance
    void doWork(){
        System.out.println("Person is walking.");
    }
}
