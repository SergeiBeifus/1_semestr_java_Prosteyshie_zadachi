package com.levelp.jb2;
import java.util.Scanner;
import java.awt.*;

public class HelloWorld1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("имеется система уравнений вида: / а1*х1 + а2*х2 + а3 = 0");
        System.out.println("                                \\ b1*х1 + b2*х2 + b3 = 0");
        System.out.println("Введите: а1;а2;а3;b1;b2;b3 , чтобы найти: х1;x2");

        double a1 = in.nextDouble();
        double a2 = in.nextDouble();
        double a3 = in.nextDouble();

        double b1 = in.nextDouble();
        double b2 = in.nextDouble();
        double b3 = in.nextDouble();

        if((a1/b1 == a2/b2) && (a2/b2 != a3/b3)){
            System.out.println(" Решений нет!");
            }
        else if((a1/b1 == a2/b2) && (a2/b2 == a3/b3)){
            System.out.println(" Решений бесконечное множество.");
        }
        else if(a1/b1 != a2/b2){

            double x1,x2;
            x1=(a3*b2-a2*b3)/(a1*b2-a2*b1);
            x2=(a1*b3-a3*b1)/(a1*b2-a2*b1);
            System.out.println("x1 =" + x1 + ", x2 =" + x2);
        }
    }
}
