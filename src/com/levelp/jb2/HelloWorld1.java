package com.levelp.jb2;
import java.util.Scanner;
import java.awt.*;


public class HelloWorld1 {

    public static int factorial(int n)
    {
        if (n == 0) return 1;
        return n * factorial(n-1);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        double exp=0;

        System.out.println("Введите х");
        double x = 1.0;
        x = in.nextDouble();

        System.out.println("Введите точность");
        double eps = 1.0;
        eps = in.nextDouble();

        double fctrl = 1;
        double trm =1 ;
        for(int i = 1;trm >= eps;i++){

            exp = exp + trm;
            fctrl = factorial(i);
            trm = (Math.pow(x,i)/fctrl);

        }
        System.out.println(exp);
    }
}

