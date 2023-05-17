package com.selfPractice.Programs.Date17may2023;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println(num+" is Even .");
        }else{
            System.out.println(num+" is Odd .");
        }
    }
}
