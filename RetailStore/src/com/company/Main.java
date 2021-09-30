package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int amount;
        System.out.println("Enter the amount: ");
        amount=sc.nextInt();
        System.out.println("Current amount: " + amount);
        System.out.print("Amount to be paid after discount: ");

        if(amount >= 50000 && amount < 10000) {
            int ans = amount - (amount * 2 / 100);
            System.out.println(ans);
        }
        else if(amount >= 10000 && amount < 25000) {
            int ans = amount - (amount * 5 / 100);
            System.out.println(ans);
        }
        else if(amount >=25000 && amount < 50000){
            int ans = amount - (amount * 10 / 100);
            System.out.println(ans);
        }
        else if(amount >= 50000){
            int ans = amount - (amount * 15 / 100);
            System.out.println(ans);
        }
        else{
            int ans = amount;
            System.out.println(amount);
        }
    }
}


//
//------OUTPUT------
//
//    Enter the amount:80000
//    Current amount: 80000
//    Amount to be paid after discount: 68000
//
