// Runtime polymorphism through method overriding.
class Employee {
    public void work() {
        System.out.println("Employee works");
    }
}

class Manager extends Employee {
    @Override
    public void work() {
        System.out.println("Manager manages the team");
    }
}

class PolymorphismOverridingDemo {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee manager = new Manager(); // Superclass reference, subclass object.

        employee.work();
        manager.work(); // Manager version runs at runtime.
    }
}
