package homeworkAug19;

public class T3 {
    public static void main(String[] args) {
        /*
        Create a 2D array or integer type where you will store odd
        and even numbers in 3 rows and 4 columns. Develop a program
        which will identify/print the even numbers only.
         */
        int [][] num=
                {
                        {11,21,31,41},
                        {40,50,60,70},
                        {72,81,90,91},
                };

        for (int row = 0; row < num.length; row++) {
            for (int col = 0; col < num[row].length; col++) {

                if (num[row][col] % 2 == 0) {
                    System.out.print(num[row][col] + " ");

                }
            }
            System.out.println();
        }


    }
}
