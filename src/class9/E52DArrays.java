package class9;

public class E52DArrays {
    public static void main(String[] args) {

        int[][] numbers = {
                {10, 20, 30, 40},
                {15, 30, 35, 45},
                {16, 20, 32, 22}};

        int sum=0;
        for (int row = 0; row < 4; row++) {

            System.out.println(numbers[row][1]);//prints all elements from column 1
            //[][], first one changes row, second column
        }
    }
}

