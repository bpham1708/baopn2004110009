package com.baopn2004110009.kiemtragiuaky;

import java.util.Scanner;

public class AppleTestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        static List<Apple> lApple = new ArrayList<>();
        Apple()
    {

    }

       public void menu(){
           System.out.println("==========MENU=========");
           System.out.println("=1=======Tạo Apple Mới==========");
           System.out.println("=2=========Thêm Apple Vào===========");
           System.out.println("=3========Tìm Kiếm Apple===========");
           System.out.println("=4======Hiển Thị Apple==========");
           System.out.println("==============Thoát=============");
       }
       public void input()
       {
           System.out.println("Nhập Apple mới:");
           idmoi = scanner.nextInt();
           System.out.println("Nhập khối lượng Apple:");
           khoiluongmoi = scanner.nextFloat();
           scanner.nextLine();
           System.out.println("Nhập màu sắc Apple:");
           mausacmoi = scanner.nextLine();
       }
       public void displayApple(){
            System.out.println("==========Apple========");
            System.out.printf("%-20S %-20S %-20S\n","Mã ID applle", "Khối Lượng apple", "Màu Sắc apple");
       }
       public void display()
       {
           for (Apple apple : lApple) {
               apple.displayApple();
                System.out.printf("%-20d %-20.2f %-20S\n",idmoi, khoiluongmoi,mausacmoi);
           }
           
       }
       public void addApple()
       {
           System.out.println("Nhập Tổng Số Apple:");
           int n = scanner.nextInt();
           for(int  i = 0; i < n; i++)
           {
               Apple apple = new Apple();
               input();
               lApple.add(apple);
           }
       }
       public void find()
       {
           System.out.println("Nhập màu sắc cần tìm:");
           String name = scanner.nextLine();
           for (Apple apple : lApple) {
               if(name.equals(apple.color)){
                   apple.displayApple();
               }
           }
       }
       sc.close();
        
    }
}
