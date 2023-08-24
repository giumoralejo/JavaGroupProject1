package homeworkAug19;

public class T1Grocerylist {
    public static void main(String[] args) {
/*
Using 2D array create a grocery list.
Inside you should have an array of veggies, fruits, dairy and sweets.
Retrieve all values from that array using 2 different loops
 */

        String [][] groceries=
                {       {"cucumber", "tomato", "potato", "onion"},
                        {"banana", "apple", "kiwi", "orange"},
                        {"milk", "cheese", "yogurt", " cream"},
                        {"chocolate", "ice cream", "twix", "kinder"}

                };
        for(String [] row:groceries){
            for(String a:row){
                System.out.print(a+", ");
            }
            System.out.println();

        }

        System.out.println("--------------------------------------------");


        for (int row = 0; row < groceries.length; row++) {
            for (int col = 0; col < groceries[row].length; col++) {
                System.out.print(groceries[row][col]+" ");

            }
            System.out.println();






    }
}}
