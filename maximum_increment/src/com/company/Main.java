package com.company;

import java.util.Scanner;

//
//Problem: Find the maximum increment in a sequence of integers.
//        In an array some user given non-negative integers are given. The program will find the maximum increment between two numbers.
//        Input:
//        First line will take an integer N representing number of elements in the array.
//        Second line will take N number of non-negative integers.
//        Output:
//        It will show highest difference between a lower position number and a higher position number. If no non-negative difference found then it will display -1
//        Test case 1:
//        Input:
//        5
//        3 4 8 5 2
//        Output:
//        5
//        Test case 2:
//        Input:
//        7
//        4 2 5 4 8 1 2
//        Output:
//        6
//        Test case 3:
//        Input:
//        6
//        7 2 4 3 4 2
//        Output:
//        2




public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[] = new int[n];
        int ans=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int diff=arr[j]-arr[i];
//                if(diff>ans){
//                    ans=diff;
//                }
                ans=Math.max(ans,diff);
            }
        }
        if(ans<0){
            System.out.println(-1);
        }
        else{
            System.out.println(ans);
        }
    }
}
//8 7 6 5 4 3 ->0
//7 6 5 5 1 -> 0