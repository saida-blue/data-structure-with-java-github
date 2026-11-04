// Examples of checked and unchecked exceptions.
import java.io.FileReader;
import java.io.IOException;

class CheckedUncheckedDemo {
    public static void main(String[] args) {
        // Checked exception example: IOException must be caught or declared.
        try (FileReader reader = new FileReader("data.txt")) {
            System.out.println("First character code: " + reader.read());
        } catch (IOException e) {
            System.out.println("File problem: " + e.getMessage());
        }

        // Unchecked exception examples.
        try {
            int result = 10 / 0; // ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        }

        try {
            String[] names = {"Ali", "Amina"};
            System.out.println(names[2]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of range");
        }
    }
}
