package com.baopn2004110009.tuan03.Lab3;
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ok = true;
        System.out.print("Nhập số cần kiểm tra: ");
        int N = sc.nextInt();
        for(int i = 2; i <= N-1; i++){
            if(N % i == 0){
                ok = false;
                break;
            }
        }
        if( ok == true){
            System.out.println("Đây là số nguyên tố ");
        }
        else
        System.out.println("Đây không phải là số nguyên tố ");
        sc.close();
    }
    
}
