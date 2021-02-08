package com.company;

import java.util.Scanner;

public class MinMax3 {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write number of rectangles\n");
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            System.out.println("Please write values for " + i+1 + "rectangle");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int p = a*2 + b*2;
            if(p > max){
                max = p;
            }
        }
        System.out.println("Max perimeter: " + max);
    }
}
