package com.company;

import java.util.Scanner;

//
//Write one menu driven program to do bubble sort and selection sort. There
// will be one class containing one integer array, Input() Display(), Bubble()
// and Selection (). Menu will be there in main() within an infinite loop to
// call the method as needed.
//        Input() will input the array elements
//        Display () will print the array elements
//        Bubble () will do the bubble sort
//        Selection () will do the selection sort.
//


class Sorting{

    int arr[];
    int sz;
    void input(int n){
        Scanner sc= new Scanner(System.in);
        arr=new int[n];
        sz=n;
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }
    void bubble_sort(){
        for(int i=0;i<sz-1;i++){
            for(int j=0;j<sz-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
    }

    void selection_sort(){
        for(int i=0;i<sz-1;i++){
            int idx=i;
            for(int j=i+1;j<sz;j++) {
                if (arr[j] < arr[idx]) {
                    idx = j;
                }
                int t = arr[idx];
                arr[idx] = arr[i];
                arr[i] = t;
            }
        }
    }

    void display(){
        int n= arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

}

public class Main {

    public static void main(String[] args) {
        Sorting arr=new Sorting();
        arr.input(6);
        arr.display();
        arr.bubble_sort();
        System.out.println("Bubble sorting the array: ");
        arr.display();

//        Sorting arr2=new Sorting();
        arr.input(6);
        arr.display();
        arr.selection_sort();
        System.out.println("Selection sorting the array: ");
        arr.display();
    }
}

//------OUTPUT------
//
//    Enter the elements:
//        5
//        5 4 3 2 1
//        5 5 4 3 2 1
//        Bubble sorting the array:
//        1 2 3 4 5 5
//        Enter the elements:
//        5
//        5 4 3 2 11
//        5 5 4 3 2 11
//        Selection sorting the array:
//        3 4 5 5 2 11
//