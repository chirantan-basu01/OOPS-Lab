package com.company;

class Shape2D{
    double side1,side2;
    String nameOfShape;
    String color;
    Shape2D(int s1,int s2,String n,String col){
        side1 = s1;
        side2 = s2;
        nameOfShape = n;
        color = col;
    }

    Shape2D(int s2, String n,String col){
        side1 = side2=s2;
        nameOfShape = n;
        color = col;
    }
    double area(){
       return side1 *side2;

    }
    void Display(){
        System.out.println("Name of shape: " + nameOfShape);
        System.out.println("Color of Square: " + color);

        System.out.println("Side 1: " + side1);
        System.out.println("Side 2: " + side2);

        System.out.println("Area is: "+ area());
    }
}

public class Main {

    public static void main(String[] args) {
        Shape2D obj1 = new Shape2D(12,9,"rectangle","red");
        obj1.Display();
        Shape2D obj2 = new Shape2D(6,"Square","black");
        obj2.Display();
    }
}
