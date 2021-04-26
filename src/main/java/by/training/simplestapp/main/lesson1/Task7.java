package by.training.simplestapp.main.lesson1;

import static java.lang.Math.*;

public class Task7 {
    public static void main(String[] args) {
        //В формуле "А" избавился от деления. На бумаге формулы равны, но программа считает иначе, поэтому оставил 2 варианта
        //В формуле "В" избавился от деления. Сохранил 2 формулы.

        int a = 110;
        int b = 1000;
        int c = 1010;
        int d = 250;
        Task7 tempObject = new Task7();
        System.out.println(tempObject.functionBVar1(a, b, c, d));
        System.out.println(tempObject.functionBVar2(a, b, c, d));
    }

    private double functionAVar1(int a, int b, int c){
        //(b + sqrt(b^2 + (4ac))) - ((2a^4c) + (2ab))
        return (b + sqrt(pow(b, 2) + (4 * a * c))) - ((2 * pow(a, 4) * c) + (2 * a * b));
    }
    private double functionAVar2(int a, int b, int c){
        //((b + sqrt(b^2 + 4ac))/2a) - (a^3c) + b
        return ((b + sqrt(pow(b, 2) + (4 * a * c))) * 0.5 * a) - (2 * pow(a, 3) * c) + b;
    }

    private double functionBVar1(int a, int b, int c, int d){
        //a/c*b/d-(ab-c)/cd
        return (((a / c) * (b / d)) - (((a * b) - c) / (c * d)));
    }

    private double functionBVar2(int a, int b, int c, int d){
        //a/c*b/d-(ab-c)/cd == abcd - abcd + c^2d = c^2d
        return (c * c) * d;
        //return (pow(c, 2) * d);
    }
}
