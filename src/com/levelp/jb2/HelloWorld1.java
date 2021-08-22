package com.levelp.jb2;
import java.util.Scanner;
import java.awt.*;

public class HelloWorld1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        double num3 = in.nextDouble();
        double ans = num1*num2*num3;

        System.out.println("произведение: "+ ans);

        ans = (num1+num2+num3)/3;

        System.out.println("среднее арифметическое: " + ans);
        double temp;
        if(num1 > num2){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if(num1 > num3){
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if(num2 > num3){
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        System.out.println("числа в порядке возрастания: " + num1 + " " + num2 + " " + num3);
    }
}
