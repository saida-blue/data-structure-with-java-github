package ch2;
class AnimalType {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends AnimalType {
    @Override
    void sound() {
        System.out.println("Cat says Meow");
    }
}

public class methodOveriding{
    public static void main(String[] args) {
        AnimalType animal = new AnimalType();
        Cat cat = new Cat();

        animal.sound();
        cat.sound();
    }
}