package class9;
import java.util.Arrays;
public class E12DArrays {
    public static void main(String[] args) {
        String [][] names=
                {       {"Giulia", "Ayesha", "Madina", "Deepali"},
                        {"Abi", "Artur", "Ehab", "Tahmin"},
                        {"Jamel", "Laura", "Clare", "Tamim"},
                        {"Habib", "Ahmed", "Shawn", "Rakhima"}

                };
        String[] firstRow= names[1];
        System.out.println(Arrays.toString(firstRow));

        //System.out.println(names[2][2]);
        //System.out.println(names[1][3]);



    }
}
