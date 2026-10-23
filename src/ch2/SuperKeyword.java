package ch2;


class Parent {
    String message = "Message from Parent";

    void display() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    String message = "Message from Child";

    void show() {
        System.out.println(super.message);
        System.out.println(message);
        super.display();
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Child child = new Child();
        child.show();
    }
}