package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //int,float,double,char,long,String,boolean

//        int age = 18;
//        float averageMarks = 19.345f;
//        char grade = 'C';
//        String name = "Chirantan";
//        boolean isValid = false;
//        long bigNumber = 5623875675635l;
//        System.out.println(bigNumber);

        //+,-,/,*,%,++,--

//        int firstNum=234;
//        int secondNum=142;
//        double sum=(double)firstNum % (double)secondNum;
//        System.out.println(sum);

        //Taking user input

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your age: ");
//        int age = sc.nextInt();
//        System.out.println(age);
//        System.out.println("Enter your name: ");
//        String name = sc.nextLine();
//        System.out.println(name);

        //Conditional Statements >,<,>=,<=,==,!=

//        int age=20;
//        if( age > 18) {
//            System.out.println("You can vote !");
//        } else {
//            System.out.println("You cannot vote !");
//        }

        //Logical Operators &&,||,!

//        int age=65;
//        if( age > 18 && age < 50) {
//            System.out.println("You can vote !");
//        } else {
//            System.out.println("You cannot vote !");
//        }

        //Switch Case

//        char grade = 'C';
//        switch(grade){
//            case 'A':
//                System.out.println("Your grade is very good !");
//                break;
//            case 'B':
//                System.out.println("Very good, keep learning !!");
//                break;
//            case 'C':
//                System.out.println("Nice keep going !");
//                break;
//            default:
//                System.out.println("Wrong argument !");
//        }

        //Loops for,while,do-while

//        for(int i=0;i<5;i++){
//            System.out.println("Chirantan");
//        }
//        int a=1;
//        while (a<10){
//            System.out.println(a);
//            a++;
//        }
//        int a=23;
//        do{
//            System.out.println(a);
//            a++;
//        } while (a>100);

        //Arrays

//        int marks[]=new int [5];
//        marks[0]=23;
//        marks[1]=12;
//        marks[2]=56;
//        marks[3]=30;
//        marks[4]=76;
//        int marks[]={23,54,7,86,33};
//        for(int i=0;i<marks.length;i++){
//            System.out.println(marks[i]);
//        }

        //Matrix

//        int a[][]=new int [2][3];
//        int a[][]={{1,2},{3,4}};
//        System.out.println(a[0][1]);

        //Methods or Functions

//        System.out.println(avg(3,6));
//        System.out.println(avg(4,6));

        //Exception Handling

        int a[]= new int [3];
        try{
            System.out.println(a[4]);
        }
        catch (Exception e){
            System.out.println("Error aya tha ");
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println("Niche ki line ");

    }
//    static int avg(int firstNum,int secondNum){
//        int sum = firstNum+secondNum;
//        return sum/2;
//    }
}
