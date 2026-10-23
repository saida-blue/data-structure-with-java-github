package ch2;
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    int id;

    Student(String name, int id) {
        super(name);
        this.id = id;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

public class constructorChaning {
    public static void main(String[] args) {
        Student student = new Student("Ali", 101);
        student.display();
    }
}