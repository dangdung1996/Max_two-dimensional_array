package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng: ");
        int n = sc.nextInt();
        System.out.println("nhập số cột: ");
        int m = sc.nextInt();
        double[][] arr = new double[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("nhập vào vị trí hàng " + (i + 1) + ", cột " + (j + 1) + ": ");
                arr[i][j] = sc.nextInt();
            }
        }

        double max = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    System.out.println("Vị trí tại hàng "+ (i + 1) + ", cột "+(j + 1));
                }
            }
        }
        System.out.println("Giá trị lớn nhất là :" + max);
    }
}
