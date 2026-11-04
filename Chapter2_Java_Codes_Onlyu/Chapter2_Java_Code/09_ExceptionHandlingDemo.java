// try, multiple catch blocks, finally, throw, and throws.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ExceptionHandlingDemo {
    public static void main(String[] args) {
        readNumberFromFile("scores.txt");
        divide(10, 0);
    }

    // Checked exception: the method declares throws.
    public static void readNumberFromFile(String fileName) {
        try (Scanner input = new Scanner(new File(fileName))) {
            if (input.hasNextInt()) {
                System.out.println("Number: " + input.nextInt());
            } else {
                throw new NumberFormatException("The file does not start with an integer");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number: " + e.getMessage());
        } finally {
            System.out.println("File reading operation finished");
        }
    }

    public static void divide(int a, int b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
