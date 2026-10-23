
package CH1;
class Student {
    String name;
    int id;
    double gpa;
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "saida";
        student.id = 1;
        student.gpa = 4.0;

        System.out.println(student.name);
        System.out.println(student.id);
        System.out.println(student.gpa);
    }
}