package com.levelp.jb2;
import java.util.Scanner;
import java.awt.*;

public class HelloWorld1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Введите два числа ввиде промежутка [a,b]");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();

        System.out.println("Введите число, чтобы задать шаг N");
        double num3 = in.nextDouble();

        for (double i = num1; i <= num2; i += num3) {
            System.out.printf("%.0f  %.5f \n", i, ((Math.sqrt(i-2)+1)/i-2));
        }
    }
}
