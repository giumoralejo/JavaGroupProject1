package class9;
import java.util.Arrays;

public class T32DArrays {
    public static void main(String[] args) {
        String [][] cars=
                {       {"Ford", "Cadillac", "Jeep", "Tesla"},
                        {"BMW", "Audi", "Mercedes", "Volkwagen"},
                        {"Kia", "Hyundai", "Sportage", "Genesis Motor"},
                        {"Ferrari", "Lamborghini", "Maserati", "Fiat"}

                };
        for(String [] row:cars){
            for(String v:row){
                System.out.print(v+", ");
            }
            System.out.println();

        }

        System.out.println("--------------------------------------------");


        for (int row = 0; row < cars.length; row++) {
            for (int col = 0; col < cars[row].length; col++) {
                System.out.print(cars[row][col]+" ");

            }
            System.out.println();






    }
}}
