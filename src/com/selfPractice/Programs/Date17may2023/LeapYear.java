package com.selfPractice.Programs.Date17may2023;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the Year:");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(((year%4==0)&& (year%100 !=0))||(year%400==0)){
            System.out.println(year+" : is Leap year.");
        }else{
            System.out.println(year+ " : is not a leap year");
        }
    }
}
