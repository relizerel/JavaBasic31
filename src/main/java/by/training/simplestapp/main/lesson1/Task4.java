package by.training.simplestapp.main.lesson1;

public class Task4 {
    public static void main(String[] args) {
        int cathetus1 = 4;
        int cathetus2 = 2;
        Task4 task4 = new Task4();
        System.out.println(task4.function(cathetus1, cathetus2));
    }

    private double function(int cathetus1, int cathetus2){
        return Math.sqrt(Math.pow(cathetus1, 2) + Math.pow(cathetus2, 2));
    }
}
