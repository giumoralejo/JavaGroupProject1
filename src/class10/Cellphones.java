package class10;

public class Cellphones {
    public static void main(String[] args) {
        Phone iphone=new Phone();
        iphone.brand="Apple";
        iphone.model="14 pro max";
        iphone.system="IOS 17";
        iphone.price=1200;

        System.out.println(iphone.brand);
        System.out.println(iphone.model);
        System.out.println(iphone.system);
        System.out.println(iphone.price);

        iphone.siri();
        iphone.alarm();
        iphone.calls();
    }

}
