package JavaGroupProject1;

import java.util.Arrays;
import java.util.Collection;

public class T1 {
    public static void main(String[] args) {
        int[] temperature = {84,90,81,92,100,101,84,79};


        int high = temperature[0];
        int low = temperature[0];

        for (int i = 1; i < temperature.length; i++) {
            if (temperature[i] > high) {
                high = temperature[i];
            }
        }


        for (int i = 1; i < temperature.length; i++) {
            if (temperature[i] < low) {
                low = temperature[i];
            }
        }



        System.out.println("Highest temperature for the week is: "+high);
        System.out.println("Lowest temperature for the week is: "+low);



    }
}
