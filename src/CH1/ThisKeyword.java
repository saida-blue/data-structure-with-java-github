package CH1;public class ThisKeyword {
    String name;

    public ThisKeyword(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword("saida");
        obj.display();
    }
}