package JavaGroupProject1;

public class T8 {
    public static void main(String[] args) {

        int[] numbers = {84,90,81,92,100,101,84,79};


        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }


        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }



        System.out.println("Maximum number of the array is: "+max);
        System.out.println("Minimum number of the array is: "+min);

    }
}
