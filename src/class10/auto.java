package class10;

public class auto {
    public static void main(String[] args) {
        Car tesla=new Car();
        tesla.model="X";
        tesla.category="sedan";
        tesla.brand="tesla";
        tesla.color="white";

        System.out.println(tesla.model);
        System.out.println(tesla.category);
        System.out.println(tesla.brand);
        System.out.println(tesla.color);

        tesla.honk();
        tesla.selfpark();

    }
}
