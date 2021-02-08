package com.company;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int power = 1;
        double[] a = new double[N+1];
        for (int i = 0; i <= N; i++){
            a[i] = power;
            power*=2;
        }
        for (int i = 0; i <= N; i++){
            System.out.println((int)a[i] + " ");
        }
    }
}
