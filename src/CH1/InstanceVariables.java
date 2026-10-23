package CH1;public class InstanceVariables {
    String name;
    int age;

    public static void main(String[] args) {
        InstanceVariables s1 = new InstanceVariables();
        InstanceVariables s2 = new InstanceVariables();

        s1.name = "saida";
        s1.age = 20;

        s2.name = "Ali";
        s2.age = 22;

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}