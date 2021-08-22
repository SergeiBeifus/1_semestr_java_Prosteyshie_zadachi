package com.levelp.jb2;
import java.util.Scanner;
import java.awt.*;

public class HelloWorld1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Введите три вещественных числа");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        double num3 = in.nextDouble();
        double Discriminant = num2*num2 - 4*num1*num3;
        if (Discriminant < 0){
            System.out.println("Корней нет");
        }
        else if(Discriminant == 0){
            double X = (-1*num2)/(2*num1);
            System.out.println("X: " + X);
        }
        else{
            double X1 = ((-1*num2)-(Math.sqrt(Discriminant)))/(2*num1);
            double X2 = ((-1*num2)+(Math.sqrt(Discriminant)))/(2*num1);
            System.out.println("X1: " + X1);
            System.out.println("X2: " + X2);
        }
    }
}
