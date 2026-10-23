package CH1;
public class Encapsulation {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setName("saida");
        System.out.println(obj.getName());
    }
}