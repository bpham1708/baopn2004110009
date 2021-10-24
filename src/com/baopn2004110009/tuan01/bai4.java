package com.baopn2004110009.tuan01.Lab1;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hệ số a = ");
        double a = sc.nextDouble();
        System.out.println("Nhập hệ số b = ");
        double b = sc.nextDouble();
        System.out.println("Nhập hệ số c = ");
        double c = sc.nextDouble();
        System.out.println(" Delta =" + (Math.pow(b, 2) - 4 * a * c));
        System.out.println(" Căn Delta = " + (Math.sqrt(Math.pow(b, 2) - 4 * a * c)));
        sc.close();
    }    
}
