package by.training.simplestapp.main.lesson1;

import static java.lang.Math.*;

public class Task4 {
    public static void main(String[] args) {
        int cathetus1 = 4;
        int cathetus2 = 2;
        Task4 tempObject = new Task4();
        System.out.println(tempObject.hypotenuseLength(cathetus1, cathetus2));
        System.out.println(tempObject.areaTriangle(cathetus1, cathetus2));
    }

    private double hypotenuseLength(int cathetus1, int cathetus2){
        return sqrt(pow(cathetus1, 2) + pow(cathetus2, 2));
    }

    private double areaTriangle(int cathetus1, int cathetus2){
        return (cathetus1 * cathetus2) * 0.5;
    }
}
