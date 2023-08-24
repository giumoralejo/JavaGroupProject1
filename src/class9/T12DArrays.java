package class9;

public class T12DArrays {
    public static void main(String[] args) {

        int[][] numbers = {
                {10, 20, 30, 40, 50},
                {15, 30, 35, 45, 20},
                {16, 20, 32, 22, 30}};

        //write a loop to get all the elements from 2 row
        int sum=0;
        for (int row = 0; row < 5; row++) {

            System.out.println(numbers[1][row]);//prints all elements from column 1
            //[][], first one changes row, second column
        }
    }
}

