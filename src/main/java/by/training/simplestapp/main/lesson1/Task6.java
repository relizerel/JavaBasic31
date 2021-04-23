package by.training.simplestapp.main.lesson1;

import static java.lang.Math.*;

public class Task6 {
    public static void main(String[] args) {
        // a^2-(b-c)^2 == a^2-b^2+2bc-c^2
        int a = 6;
        int b = 2;
        int c = 4;
        Task6 tempObject = new Task6();
        System.out.println(tempObject.function(a, b, c));
    }

    private double function(int a, int b, int c){
        return pow(a, 2) - pow(b, 2) + 2*b*c - pow(c, 2);
    }
}
