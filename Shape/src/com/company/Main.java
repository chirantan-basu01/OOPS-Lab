package com.company;

class Shape2D
{
    int dimension1,dimension2;
    String name_of_shape;
    String color;

    Shape2D(int d1,int d2 ,String name, String c)
    {
        dimension1 = d1;
        dimension2 = d2;
        name_of_shape = name;
        color = c;
    }

    Shape2D(int d2,String n , String co)
    {
        dimension2 = dimension1=d2;
        name_of_shape = n;
        color = co;
    }

    int area()
    {
        return dimension1 * dimension2;
    }

    void Display()
    {
        System.out.println("Name of shape:"+ name_of_shape);
        System.out.println("Color of object:"+ color);

        System.out.println("dimension1:"+ dimension1+"unit");
        System.out.println("dimension2:"+ dimension2+"unit");

        System.out.println("Area:"+ area()+"square unit");


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

//------OUPUT------
//
//        Name of shape:rectangle
//        Color of object:red
//        dimension1:12unit
//        dimension2:9unit
//        Area:108square unit
//        Name of shape:Square
//        Color of object:black
//        dimension1:6unit
//        dimension2:6unit
//        Area:36square unit
//