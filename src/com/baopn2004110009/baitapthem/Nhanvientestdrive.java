package com.baopn2004110009.tuan04.Lab4;
import java.util.Scanner;
public class Nhanvientestdrive {
    public static void main(String[] args) {
        Nhanvien[] dsnhanvien = new Nhanvien[2];
        Scanner biennhap = new Scanner(System.in);
        for(int i = 0; i < dsnhanvien.length; i++){
        System.out.print("Tên nhân viên: ");
        String t = biennhap.nextLine();
        System.out.print("Địa chỉ: ");
        String dc = biennhap.nextLine();
        System.out.print("Bộ phận làm việc: ");
        String bplv = biennhap.nextLine();
        System.out.print("Lương: ");
        int l = biennhap.nextInt();
        System.out.print("Ngày sinh: ");
        String ns = biennhap.nextLine();
         biennhap.nextLine();
        dsnhanvien[i] = new Nhanvien(t, dc, bplv, l, ns);
        }
        System.out.println("****Thông tin nhân viên****");
        for(Nhanvien nhanvien : dsnhanvien){
        nhanvien.intThongtinnhanvien();
        }
        biennhap.close();
    }
}
