package CH1;
public class ConstructorChaining {
    String name;
    int age;

    public ConstructorChaining() {
        this("saida", 20);
    }

    public ConstructorChaining(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        ConstructorChaining obj = new ConstructorChaining();

        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}