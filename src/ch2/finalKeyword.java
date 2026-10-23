package ch2;
class FinalExample {
    final int MAX_VALUE = 100;

    final void display() {
        System.out.println("Maximum value: " + MAX_VALUE);
    }
}

public class finalKeyword {
    public static void main(String[] args) {
        FinalExample example = new FinalExample();
        example.display();
    }
}