package com.baopn2004110009.kiemtragiuaky;
public class Apple {
    int ID;
    float khoiLuong;
    String mauSac;
    
    Apple(){}
    Apple (int id, float khoiLuong, String mauSac) {
        ID = ID;
        khoiLuong = khoiLuong;
        mauSac = mauSac;
    }


    void inThongTinApple() {
        System.out.println("Mã ID: " + ID);
        System.out.println("Khối lượng: " + khoiLuong);
        System.out.println("Màu sắc: " + mauSac);
    }
}
