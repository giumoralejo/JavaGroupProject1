package class9;
import java.util.Arrays;
public class E22DArrays {
    public static void main(String[] args) {
        /*
        int [] row0={1, 2, 3, 4};
        int [] row1={10, 20, 30, 40};
        int [] row2={100, 200, 300, 400};
*/


        int[][] numbers = {
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4}};

        int [] row = numbers [0]; //returns the complete 1D array
        int number =numbers [0][1]; // returns a specific element
        System.out.println(numbers[0][1]);
        System.out.println(Arrays.toString(numbers[1]));//complete second row
    }
}
