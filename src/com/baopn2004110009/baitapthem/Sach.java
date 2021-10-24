package com.baopn2004110009.tuan04.Lab4;

public class Sach {
    String nhaxuatban;
    String namxuatban;
    String loai;
    int soluong;
    float gia;    
    Sach(){}    
    Sach(String nxb, String nb, String l, int sl, float g){
        nhaxuatban = nxb;
        namxuatban = nb;
        loai = l;
        soluong = sl;
        gia = g;
        }

    void intThongTinSach(){
        System.out.println("Nhà xuất bản: " + nhaxuatban + " " + "Năm xuất bản: " + namxuatban + " " + "Loại sách: " + loai + " " + "Số lượng: " + soluong + " " + "Giá: " + gia);
    }        
}
