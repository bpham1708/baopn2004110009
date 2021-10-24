package com.baopn2004110009.tuan01.Lab1;
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh của khối lập phương = ");
        double canH = sc.nextDouble();
        System.out.println("Thể tích khối lập phương = " + (canH * canH * canH));
        sc.close();
    }
    
}
