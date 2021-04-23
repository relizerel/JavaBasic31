package by.training.simplestapp.main.lesson1;

public class Task4 {
    public static void main(String[] args) {
        int cathetus1 = 4;
        int cathetus2 = 2;
        Task4 task4 = new Task4();
        System.out.println(task4.hypotenuseLength(cathetus1, cathetus2));
        System.out.println(task4.areaTriangle(cathetus1, cathetus2));
    }

    private double hypotenuseLength(int cathetus1, int cathetus2){
        return Math.sqrt(Math.pow(cathetus1, 2) + Math.pow(cathetus2, 2));
    }

    private double areaTriangle(int cathetus1, int cathetus2){
        return (cathetus1 * cathetus2) * 0.5;
    }
}
