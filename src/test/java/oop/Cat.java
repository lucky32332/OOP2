package oop;

public class Cat extends Pet {

    public Cat(boolean hasTail, String name, int age, String breed, Address address) {
        super(hasTail, name, age, breed, address);
    }

    public Cat() {
        super(true, "Maco", 2, new String("Bengal cat"), null);
    }

    public void sound() {
        System.out.println("Meow Meow");
    }
}
