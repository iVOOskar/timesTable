package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        System.out.println("what times table do you want?");
        double userNumber = input.nextDouble();
        for (int i=1; i<11; i++){
            double answer = i*userNumber;
            System.out.println(i+" times "+userNumber+" = "+answer);
        }


    }
}
