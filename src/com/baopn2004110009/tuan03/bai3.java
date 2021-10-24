package com.baopn2004110009.tuan03.Lab3;
import java.util.Scanner;
import java.util.Arrays;
public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mảng: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n ; i++){
            System.out.printf("A[%d] = ", i);
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        for(int i = 0; i < n; i++)        
            System.out.print(a[i]);

        System.out.println();
        int Min = a[0];
        for(int x : a){
            Math.min(Min, x);
        }
        System.out.println("Phần tử nhỏ nhất trong mảng = " + Min);
        int tong = 0, dem = 0;
        for(int x : a){
            if(x % 3 == 0){
                tong += x;
                dem++;
            }      
        }
        System.out.printf("Trung bình cộng các phần tử của mảng chia hết cho 3 = %d", tong/dem);
        scanner.close();
    }
}