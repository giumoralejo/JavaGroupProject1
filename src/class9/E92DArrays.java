package class9;
import java.util.Arrays;

public class E92DArrays {
    public static void main(String[] args) {
        String [][] names=
                {       {"Giulia", "Ayesha", "Madina", "Deepali"},
                        {"Abi", "Artur", "Ehab", "Tahmin"},
                        {"Jamel", "Laura", "Clare", "Tamim"},
                        {"Habib", "Ahmed", "Shawn", "Rakhima"}

                };
        for(String [] row:names){
            for(String v:row){
                System.out.println(v);
            }

        }
        System.out.println(Arrays.deepToString(names));

        //System.out.println(names[2][2]);
        //System.out.println(names[1][3]);



    }
}
