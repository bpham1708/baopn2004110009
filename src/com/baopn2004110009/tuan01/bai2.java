package com.baopn2004110009.tuan01.Lab1;
import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        double chieuDAI = sc.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double chieuRONG = sc.nextDouble();
        System.out.println("Chu vi = " + ((chieuDAI + chieuRONG) * 2));
        System.out.println("Diện tích = " + (chieuDAI * chieuRONG));
        System.out.println("Cạnh nhỏ nhất = " + (Math.min(chieuDAI, chieuRONG)));
        sc.close();
    }
}
