package com.company;

import java.util.Scanner;

public class MinMax5 {
    public static void main(String[] args) {
        double max = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            double m = sc.nextInt();
            double v = sc.nextInt();
            double P = m/v;
            if(P > max){
                max = P;
            }
        }
        System.out.println("Max density of item: " + max);
    }
}
