package com.baopn2004110009.tuan04.Lab4;

public class Nhanvien {
        String Tennhanvien;
        String Diachi;
        String Bophanlamviec;
        int Luong;
        String Ngaysinh;
        Nhanvien(String t, String dc, String bplv, int l, String ns){
            Tennhanvien = t;
            Diachi = dc;
            Bophanlamviec = bplv;
            Luong = l;
            Ngaysinh = ns;
        }
        void intThongtinnhanvien(){
            System.out.println("Tên Nhân viên:" + Tennhanvien + " " + "Địa chỉ:" + Diachi + " " + "Bộ phận làm việc:" + Bophanlamviec + " " + "Lương:" + Luong + " " + "Ngày sinh:" + Ngaysinh + " ");   
        }
}