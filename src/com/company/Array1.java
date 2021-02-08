package com.company;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int x = 0;
        for(int i = 0; i < N; i++){
            a[i] = i * 2 + 1;
        }
        for(int i = 0; i < N; i++){
            System.out.println(a[i] + " " );
        }
    }
}
