package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here

        String a = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string :");
        a = s.nextLine();
        int n = a.length();
        boolean check=true;
        for(int i = 0; i < n/2; i++) {
            if(a.charAt(i) != a.charAt(a.length()-i-1)){
                check = false;
                break;
            }
        }
        if(check){
            System.out.println("It is Palindrome");
        }
        else{
            System.out.println("It is not Palindrome");
        }
    }
}
