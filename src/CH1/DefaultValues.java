package CH1;
public class DefaultValues {
    int number;
    double price;
    boolean status;
    String name;

    public static void main(String[] args) {
        DefaultValues obj = new DefaultValues();

        System.out.println(obj.number);
        System.out.println(obj.price);
        System.out.println(obj.status);
        System.out.println(obj.name);
    }
}