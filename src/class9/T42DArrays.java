package class9;

public class T42DArrays {
    public static void main(String[] args) {

        //veggies, fruits, dairy, sweets
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
