package com.company;

import java.util.Scanner;

public class MinMax2 {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of rectangles: ");
        int N = sc.nextInt();
        System.out.println("Please write values for rectangles");
        for(int i = 0; i < N; i++){
            System.out.println("Please write values for " + i+1 + "rectangle");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int area = a * b;
            if(area < min){
                min = area;
            }
        }
        System.out.println("The minimal area is: " + min);
    }
}
