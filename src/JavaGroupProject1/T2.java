package JavaGroupProject1;

public class T2 {
    public static void main(String[] args) {
        int[] num = {84,90,81,92,100,101,84,79};


        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }

        System.out.println("The total for the sum is: " + sum);
    }
}
