package com.company;

import java.awt.*;

abstract class Shape3D{
    public int height;
    public int breadth;
    public int length;

    abstract void find_vol();
}

class cone extends Shape3D{
    cone(int height,int breadth){
        this.height=height;
        this.breadth=breadth;
    }

    public void find_vol(){
        double ans=(3.14*(breadth*breadth)*(height/3));
        System.out.println(ans);
    }
}

class cube extends Shape3D{
    cube(int height){
        this.height=height;
    }

    public void find_vol() {
        double ans=(height*height*height);
        System.out.println(ans);
    }
}

class cuboid extends Shape3D{
    cuboid(int length,int breadth,int height){
        this.height=height;
        this.length=length;
        this.breadth=breadth;
    }

    public void find_vol(){
        double ans=(length*breadth*height);
        System.out.println(ans);
    }
}
class sphere extends Shape3D{
    sphere(int breadth){
        this.breadth=breadth;
    }

    public void find_vol(){
        double ans=((4/3)*3.14*(breadth*breadth*breadth));
        System.out.println(ans);
    }
}

public class Main {

    public static void main(String[] args) {
        Shape3D obj;

        obj=new cone(3,4);
        obj.find_vol();

        obj=new cuboid(3,4,5);
        obj.find_vol();

        obj=new cube(3);
        obj.find_vol();

        obj=new sphere(3);
        obj.find_vol();
    }
}
