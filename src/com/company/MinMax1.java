package com.company;

import java.util.Scanner;

public class MinMax1 {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write number of elements in the array\t");
        int N = sc.nextInt();
        int[] a = new int[N];

        System.out.println("Please write each element splitted by spaces: ");
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        for(int i = 0; i < N; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println("Min element: " + min);
        System.out.println("Max element: " + max);
    }
}
