package homeworkAug19;

public class T2 {
    public static void main(String[] args) {

        /*
        Create a 2D array or integer type
        and store numbers in 3 rows and 3 columns. Print the sum of all numbers.
         */

        int [][] num=
                {
                        {10,20,30},
                        {40,50,60},
                        {70,80,90},
                };
        int sum = 0;
        for (int row = 0; row < num.length; row++) {
            for (int col = 0; col < num[row].length; col++) {
                sum +=num[row][col];
            }

        }

        System.out.println("Total Sum of numbers is: "+sum);
    }
}
