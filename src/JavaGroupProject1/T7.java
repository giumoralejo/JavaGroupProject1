package JavaGroupProject1;

public class T7 {
    public static void main(String[] args) {

        int firstNum = 0;
        int secondNum = 1;

        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(firstNum + " ");
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}
