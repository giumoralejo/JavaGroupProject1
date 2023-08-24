package JavaGroupProject1;

public class T3 {
    public static void main(String[] args) {
        int[][] num = {
                {1,2,3,4,5},
                {10,11,12,13,14},
                {20,21,22,23,24},
        };

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {

                if (num[i][j]%2 !=0){
                    System.out.print(num[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
