package oop;

public class Pet {
    private boolean hasTail;
    private String name;
    private int age;
    private String breed;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid data!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid data!");
        }
    }

    public String getBreed() {
        return breed;
    }

    public Pet(boolean hasTail, String name, int age, String breed, Address address) {
        setHasTail(hasTail);
        setName(name);
        setAge(age);
        setBreed(breed);
        setAddress(address);
    }

    public void setBreed(String breed) {
        this.breed = breed;

    }

    public void printData() {
        System.out.printf("This cat's name is: %s.%nThis cat`s age: %d.%nThis cat`s breed is: %s.%n", name, age, breed);
        if (hasTail) {
            System.out.println("This cat has tail.");
        } else {
            System.out.println("This cat does not have tail.");
        }
    }


}




