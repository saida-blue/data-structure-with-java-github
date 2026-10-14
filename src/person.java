class Person {
    private String name;
    private int id;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

class Student extends Person {
    private double gpa;

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }
}

class Lecturer extends Person {
    private String subject;

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
}

 void main() {


        Student student1 = new Student();

        student1.setName("Saida");
        student1.setId(222);
        student1.setGpa(3.5);

        System.out.println("Student name: " + student1.getName());
        System.out.println("Student ID: " + student1.getId());
        System.out.println("Student GPA: " + student1.getGpa());

        Lecturer lecturer1 = new Lecturer();

        lecturer1.setName("Ahmed");
        lecturer1.setId(101);
        lecturer1.setSubject("Java");

        System.out.println("Lecturer name: " + lecturer1.getName());
        System.out.println("Lecturer ID: " + lecturer1.getId());
        System.out.println("Lecturer subject: " + lecturer1.getSubject());
    }
