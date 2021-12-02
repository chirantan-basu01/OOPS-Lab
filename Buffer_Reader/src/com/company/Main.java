package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {

    public static void main(String[] args) throws IOException {
        int var1;
        double var2;
        char var3;
        String var4;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        (new BufferedReader(new InputStreamReader(System.in))).read()  //another way

        var1 = Integer.parseInt(br.readLine());
        System.out.println(var1+10);
//
//        var2 = Double.parseDouble(br.readLine());
//        System.out.println(var2+2.50);

//        var3 = (char)br.read();
//        var3 = (char)(new BufferedReader(new InputStreamReader(System.in))).read();
//        System.out.println(var3);

//        var4 = (String)(br.readLine());
//        var4 = (String) (new BufferedReader(new InputStreamReader(System.in))).readLine();
//        System.out.println(var4);
    }
}
