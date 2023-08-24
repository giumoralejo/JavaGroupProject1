package JavaGroupProject1;

public class T10 {
    public static void main(String[] args) {

        int[] numbers = { 10,20,20,30,32,30,21,25,23,25 };
        boolean[] isDuplicate = new boolean[numbers.length];

        System.out.println("Duplicate elements:");

        for (int i = 0; i < numbers.length - 1; i++) {
            if (!isDuplicate[i]) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (!isDuplicate[j] && numbers[i]==(numbers[j])) {
                        System.out.println(numbers[i]);
                        isDuplicate[j] = true;
                    }
                }
            }
        }


    }
}
