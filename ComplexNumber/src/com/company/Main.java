package com.company;

class Complex{
    double re,im;
    Complex(double a,double b) {
        re=a;
        im=b;
    }
    void Display(){
        System.out.println(re+"+("+im+")i");
    }
    Complex add(Complex c1){
        Complex result=new Complex(0,0);
        result.re= re+c1.re;
        result.im= im+c1.im;
        return result;
    }
    Complex sub(Complex c1){
        Complex result= new Complex(0,0);
        result.re= re-c1.re;
        result.im= im-c1.im;
        return result;
    }
    Complex mul(Complex c1){
        Complex result= new Complex(0,0);
        result.re= (re*c1.re)-(im*c1.im);
        result.im= (im*c1.re)+(re*c1.im);
        return result;
    }
    Complex div(Complex c1){
        Complex result= new Complex(0,0);
        result.re= ((re*c1.re)+(im*c1.im))/(Math.pow((c1.re),2) + Math.pow((c1.im),2));
        result.im= ((im*c1.re)-(re*c1.im))/(Math.pow((c1.re),2) + Math.pow((c1.im),2));
        return result;
    }
}

public class Main {

    public static void main(String[] args) {
        Complex ob = new Complex(2,3);
        Complex ob1 = new Complex(1,-4);
        Complex s1 = ob.add(ob1);
        Complex s2 = ob.sub(ob1);
        Complex s3 = ob.mul(ob1);
        Complex s4 = ob.div(ob1);
        s1.Display();
        s2.Display();
        s3.Display();
        s4.Display();
    }
}
    
/*
---------OUTPUT---------
* Add-> 3.0+(-1.0)i
* Sub-> 1.0+(7.0)i
* Mul-> 14.0+(-5.0)i
* Div-> -0.5882352941176471+(0.6470588235294118)i
* */