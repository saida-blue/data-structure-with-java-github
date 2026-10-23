package CH1;public class Constructor {
    String name;

    public Constructor(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor("saida");
        System.out.println(obj.name);
    }
}