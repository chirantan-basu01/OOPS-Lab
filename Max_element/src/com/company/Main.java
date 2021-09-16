package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double diff;
        double a;
        double b;
        System.out.println("Enter the 1st no: ");
        a=sc.nextDouble();
        System.out.println("Enter the 2nd no: ");
        b=sc.nextDouble();
        diff=a-b;
        if(diff<0){
            System.out.println("1st is smaller than 2nd");
        }
        else if(diff>0){
            System.out.println("2nd is smaller than 1st");
        }
        else{
            System.out.println("Both are equal");
        }
    }
}
