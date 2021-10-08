package com.company;

import java.util.Scanner;

class password{
    void properties(String p ,int n){
        if(n>=8){

            for(int i=0 ;i<=n;i++){
                if(i<n) {
                    if (p.charAt(i) >= 'a' && p.charAt(i) <= 'z') {
                        break;
                    }
                }
                else
                    System.out.println("Password must contain atleast one lowercase character");

            }

            for(int i=0 ;i<=n;i++){
                if(i<n) {
                    if (p.charAt(i) >= 'A' && p.charAt(i) <= 'Z') {
                        break;
                    }
                }
                else
                    System.out.println("Password must contain atleast one uppercase character");

            }

            for(int i=0 ;i<=n;i++){
                if(i<n) {
                    if (p.charAt(i) >= '0' && p.charAt(i) <= '9') {
                        break;
                    }
                }
                else
                    System.out.println("Password must contain atleast one numeric character");

            }

            for(int i=0 ;i<=n;i++){
                if(i<n) {
                    if ((p.charAt(i) >= 32 && p.charAt(i) <=47)||( p.charAt(i)>=58 &&p.charAt(i)<=64)||(p.charAt(i)>=91 &&p.charAt(i)<=96)||(p.charAt(i)>=123 &&p.charAt(i)<=126))  {
                        break;
                    }
                }
                else
                    System.out.println("Password must contain atleast one special character");

            }

            if ((p.charAt(0)>='9'&&p.charAt(0)<='9')||p.charAt(n-1)>='0'&&p.charAt(n-1)<='9')  {
                System.out.println("Password must not have first and last character as number");
            }


        }
        else System.out.println("Password length should be atleast 8 character");
    }

}

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the password");
        String p=sc.next();
        int n=p.length();
        password obj =new password();
        obj.properties(p,n);
    }
}


//------OUTPUT------
//        Enter the password
//        1Kill$game
//        Enter the password
//        chirantan
//        Password must contain atleast one uppercase character
//        Password must contain atleast one numeric character
//        Password must contain atleast one special character