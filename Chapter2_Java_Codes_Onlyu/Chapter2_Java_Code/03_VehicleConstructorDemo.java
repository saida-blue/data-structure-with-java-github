// Constructor chaining and the super keyword.
class Vehicle {
    private String make;
    private int year;

    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
        System.out.println("Vehicle constructor");
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }
}

class Car extends Vehicle {
    private int doors;

    public Car(String make, int year, int doors) {
        super(make, year); // Must be the first statement.
        this.doors = doors;
        System.out.println("Car constructor");
    }

    public void display() {
        System.out.println(getYear() + " " + getMake() + ", doors: " + doors);
    }
}

class VehicleConstructorDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2024, 4);
        car.display();
    }
}
