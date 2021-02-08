package com.company;

import java.util.Scanner;

public class MinMax4 {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write number of elements: \n");
        int N = sc.nextInt();
        int[] a = new int[N];
        System.out.println("Please write each element: \n");
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        for(int i = 0; i < N; i++){
            if(min == a[i]){
                minIndex = i;
            }
        }
        System.out.println("The minimum element index is: " + minIndex);
    }
}
