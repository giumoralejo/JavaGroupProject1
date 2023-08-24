package class10;

public class DogTester {
    public static void main(String[] args) {

        Dog luna=new Dog();
        luna.name="Luma";
        luna.gender="F";
        luna.breed="Shiba";
        luna.weight=10;
        luna.age=20;
        System.out.println(luna.name);
        System.out.println(luna.age);
        System.out.println(luna.breed);

        luna.bark();
        luna.eat();
        luna.sleep();

    }

}
