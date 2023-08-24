public class Main {
    public static void main(String[] args) {
        for (int j = 1; j <= 3; j++) {
            for (int i = 0; i < 4 - j; i++) { //3
                System.out.print(i);
            }
            System.out.println();
        }

    }
}