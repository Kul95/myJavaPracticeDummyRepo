package com.selfPractice.Programs.Date17may2023;

import java.util.Scanner;

public class SumOfInputNum {
    public static void main(String[] args) {
        System.out.println("Input the numbers:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        while(num>0){
            sum=sum+num%10;
            num=num/10;
        }
        System.out.println(sum);


    }
}
