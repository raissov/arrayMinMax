package com.company;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for N: ");
        int N = sc.nextInt();
        System.out.println("Enter value for D: ");
        int D = sc.nextInt();
        System.out.println("Enter value for A: ");
        int A = sc.nextInt();
        double[] a = new double[N];
        for(int i = 0; i < N; i++){
            a[i] = A*Math.pow(D, i);
        }
        for(int i = 0; i < N; i++){
            System.out.println((int)a[i]+ " ");
        }

    }
}
