package com.baopn2004110009.tuan02.Lab2;
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập a = ");
        int a = sc.nextInt();
        System.out.println("Hãy nhập b = ");
        int b = sc.nextInt();
        if(a == 0)
        {
            if(b == 0)
            {
                System.out.println("Phương trình vô số nghiệm");
            }
            else
            {
                System.out.println("Phương trình vô nghiệm");
            }
        }
        else
        {
            float x = (float) -b / a;
            System.out.println("Phương tình có nghiệm x duy nhất =" + x);
        }
        sc.close();
    }
}
