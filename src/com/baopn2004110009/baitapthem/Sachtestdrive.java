package com.baopn2004110009.tuan04.Lab4;
import java.util.Scanner;
public class Sachtestdrive {
        public static void main(String[] args) {
            Sach[] sachlist = new Sach[2];
            Scanner bienNhap = new Scanner(System.in);
            for(int i = 0; i < sachlist.length; i++){
                System.out.print("Nhà xuất bản: ");
                String nxb = bienNhap.nextLine();
                System.out.print("Năm xuất bản: ");
                String nb = bienNhap.nextLine();
                System.out.print("Loại: ");
                String l = bienNhap.nextLine();
                System.out.print("Số lượng: ");
                int sl = bienNhap.nextInt();
                System.out.print("Giá: ");
                float gb = bienNhap.nextFloat();
                bienNhap.nextLine();
                sachlist[i] = new Sach(nxb, nb, l, sl, gb);
            }
            System.out.println("===IN THÔNG TIN SÁCH===");
            for(Sach sach : sachlist){
                sach.intThongTinSach();
            }
            bienNhap.close();
        }
    }
