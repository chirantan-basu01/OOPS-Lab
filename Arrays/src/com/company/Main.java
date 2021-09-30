package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int arr[] = new int[10];
        int []arr1 = new int [5];
        int arr3[];
        int arr4[];
        arr3 = new int[20];
        arr3 = new int[3];

        Arrays.fill(arr3,5);

        arr4=arr3;
        System.out.println(arr3.length);
        arr4[2] = 7;

//        for(int i=0;i<arr3.length;i++){
//            System.out.println(arr3[i]);
//        }

        System.out.println("Array 3 :");
        for(int a:arr3){
            System.out.print(a + " ");
        }

        System.out.println("\n");

        System.out.println("Array 4 :");
        for(int a:arr4){
            System.out.print(a + " ");
        }

    }
}
