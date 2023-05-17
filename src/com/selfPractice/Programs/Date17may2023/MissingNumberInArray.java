package com.selfPractice.Programs.Date17may2023;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,5,6,7};
        int num=arr.length;
        int sum=(num*(num+1))/2;
        for(int i=0;i<arr.length;i++){
            sum=sum-arr[i];
            System.out.println("Missing number is : "+sum);
        }

    }
}
