package com.baopn2004110009.tuan02.Lab2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập số điện sử dụng của tháng: ");
    int soDien = sc.nextInt();
    if(soDien < 50)
    {
        System.out.println("Số tiền điện = " + soDien * 1000);
    }
    else
    {
        System.out.println("Số tiền điệm = " + (50 * 1000 + (soDien - 50) * 1200));
    }
    sc.close();
    }
}
