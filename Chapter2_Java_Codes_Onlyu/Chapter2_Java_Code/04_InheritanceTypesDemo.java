// Single, multilevel, and hierarchical inheritance examples.
class Animal {
    public void eat() {
        System.out.println("Animal eats");
    }
}

// Single inheritance: Dog extends Animal.
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks");
    }
}

// Multilevel inheritance: Puppy -> Dog -> Animal.
class Puppy extends Dog {
    public void weep() {
        System.out.println("Puppy weeps");
    }
}

// Hierarchical inheritance: Cat and Dog share Animal as parent.
class Cat extends Animal {
    public void meow() {
        System.out.println("Cat meows");
    }
}

class InheritanceTypesDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.weep();

        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }
}
