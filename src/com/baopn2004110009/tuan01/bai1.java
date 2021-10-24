package com.baopn2004110009.tuan01.Lab1;
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Họ và tên: ");
        String hoTen = sc.nextLine();
        System.out.print("Điểm trung bình: ");
        double diemTB = sc.nextDouble();
        System.out.printf("%s %f điểm", hoTen, diemTB);
        sc.close();
    }
}
