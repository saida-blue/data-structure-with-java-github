// Person -> Student and Lecturer (hierarchical inheritance).
class Person {
    private String name;
    private String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String describe() {
        return name + " (" + id + ")";
    }
}

class Student extends Person {
    private double gpa;

    public Student(String name, String id, double gpa) {
        super(name, id);
        this.gpa = gpa;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0 && gpa <= 4.0) {
            this.gpa = gpa;
        }
    }

    public String studentCard() {
        return "Student " + describe() + " - GPA: " + gpa;
    }
}

class Lecturer extends Person {
    private String faculty;

    public Lecturer(String name, String id, String faculty) {
        super(name, id);
        this.faculty = faculty;
    }

    public String staffCard() {
        return "Lecturer " + describe() + " - " + faculty;
    }
}

class PersonStudentLecturerDemo {
    public static void main(String[] args) {
        Student student = new Student("Amina Hassan", "C120345", 3.6);
        Lecturer lecturer = new Lecturer("Abdi Yusuf", "L0042", "Computer & IT");

        System.out.println(student.studentCard());
        System.out.println(lecturer.staffCard());
    }
}
