package class10;

public class Student {

    String name;
    int age;
    String id;

    void study() {
        System.out.println("Studying 16 hours a day...");
    }

    public static void main(String[] args) {
        Student giulia = new Student();
        giulia.name="Giulia";
        giulia.age=24;
        giulia.id="abc123";
        giulia.study();

        Student habib=new Student();
        habib.name="deepali";
        habib.age=20;
        habib.id="123abc";
        habib.study();

    }
}
