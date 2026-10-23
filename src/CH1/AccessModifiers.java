package CH1;public class AccessModifiers {
    public String name = "saida";
    private int age = 20;

    public void display() {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        obj.display();
    }
}