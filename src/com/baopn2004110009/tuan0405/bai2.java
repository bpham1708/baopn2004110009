package com.baopn2004110009.tuan0405;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        menu();
    }
    static void menu() {
        ArrayList<String> listName = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        int luaChon;
        do {
            System.out.println("\n==== Menu chương trình ====");
            System.out.println("1: Nhập danh sách");
            System.out.println("2: Xuất danh sách");
            System.out.println("3: Xuất danh sách ngẫu nhiên");
            System.out.println("4: Sắp xếp giảm dần");
            System.out.println("5: Xóa họ tên");
            System.out.println("6: Thoát");
            System.out.println("===========================");
            System.out.print("Bạn chọn: ");
            luaChon = scanner.nextInt();
            switch (luaChon) {
                case 1:
                    scanner.nextLine();
                    nhapHoTen(listName, scanner);
                    break;
                case 2:
                    xuatHoTen(listName);
                    break;
                case 3:
                    xuatHoTenNgauNhien(listName);
                    break;
                case 4:
                    sapXepGiamDan(listName);
                    break;
                case 5:
                    scanner.nextLine();
                    xoaPhanTu(listName, scanner);
                    break;
                case 6:
                    System.out.println("Kết thúc chương trình");
                    break;
                default:
                    System.out.println("Nhập sai, nhập lại!");
                    break;
            }
        } while (luaChon != 6);
    }
    static void nhapHoTen(ArrayList<String> dsHoTen, Scanner scanner) {
        System.out.println("===== Nhập danh sách họ tên: =====");
        String xacNhan;
        do {
            System.out.print("Họ tên: ");
            String name = scanner.nextLine();
            dsHoTen.add(name);

            System.out.print("Nhập thêm (Y/N)? ");
            xacNhan = scanner.nextLine();
            if (xacNhan.toUpperCase().equals("N")) {
                break;
            }
        } while (xacNhan.toUpperCase().equals("Y"));
    }
    static ArrayList<String> xuatHoTen(ArrayList<String> dsHoTen) {
        if (dsHoTen.isEmpty()) {
            System.out.println("Danh sách này chưa có phần tử");
            return null;
        }
        System.out.println("===== Danh sách họ tên: =====");
        for (String hoTen : dsHoTen) {
            System.out.println(hoTen);
        }
        return dsHoTen;
    }
    static void xuatHoTenNgauNhien(ArrayList<String> dsHoTen) {
        if (dsHoTen.isEmpty()) {
            System.out.println("Danh sách này chưa có phần tử");
            return;
        }
        System.out.println("===== Sắp xếp ngẫu nhiên: =====");
        Collections.shuffle(dsHoTen);
        for (String hoTen : dsHoTen) {
            System.out.println(hoTen);
        }
    }
    static void sapXepGiamDan(ArrayList<String> dsHoTen) {
        if (dsHoTen.isEmpty()) {
            System.out.println("Danh sách này chưa có phần tử");
            return;
        }
        System.out.println("===== Sắp xếp giảm dần theo thứ tự alphabet: =====");
        Collections.sort(dsHoTen);
        Collections.reverse(dsHoTen);
        for (String hoTen : dsHoTen) {
            System.out.println(hoTen);
        }
    }
    static void xoaPhanTu(ArrayList<String> dsHoTen, Scanner scanner) {
        boolean isExist = false;
        if (dsHoTen.isEmpty()) {
            System.out.println("Danh sách này chưa có phần tử");
            return;
        }
        System.out.print("Nhập tên bạn muốn xóa: ");
        String name = scanner.nextLine();

        for (int i = 0; i < dsHoTen.size(); i++) {
            if (dsHoTen.contains(name)) {
                dsHoTen.remove(name);
                isExist = true;
                break;
            }
        }
        if (!isExist)
            System.out.println("Phần tử bạn nhập không tồn tại");
        else {
            System.out.println("==== Danh sách sau khi xóa: ====");
            for (String hoTen : dsHoTen) {
                System.out.println(hoTen);
            }
        }
    }
}