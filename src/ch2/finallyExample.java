package ch2;
public class finallyExample {
    public static void main(String[] args) {
        try {
            int number = 10 / 2;
            System.out.println("Result: " + number);
        } catch (ArithmeticException e) {
            System.out.println("An error occurred");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}