package by.training.simplestapp.main.lesson1;

public class Task5 {
    public static void main(String[] args) {
        int term1 = 1;
        int term2 = 2;
        int term3 = 3;
        int term4 = 4;
        Task5 tempObject = new Task5();
        System.out.println(tempObject.addition(term1, term2, term3, term4));
    }

    private int addition(int term1, int term2, int term3, int term4){
        return term1 + term2 + term3 + term4;
    }
}
