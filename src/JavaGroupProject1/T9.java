package JavaGroupProject1;

public class T9 {
    public static void main(String[] args) {

        int[] numbers = { 12,15,165,148,159,74,158,123,265};

        int largest = numbers[0];
        int secondLargest = numbers[0];

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                secondLargest = num;
            }
        }

        System.out.println("The second largest number is: " + secondLargest);


    }
}
