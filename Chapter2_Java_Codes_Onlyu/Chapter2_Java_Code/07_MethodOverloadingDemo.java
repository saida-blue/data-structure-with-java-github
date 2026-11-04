// Method overloading: same method name, different parameter lists.
class PersonDisplay {
    public void display() {
        System.out.println("Person...");
    }

    public void display(String name) {
        System.out.println(name);
    }
}

class MethodOverloadingDemo {
    public static void main(String[] args) {
        PersonDisplay person = new PersonDisplay();
        person.display();
        person.display("Amina");
    }
}
