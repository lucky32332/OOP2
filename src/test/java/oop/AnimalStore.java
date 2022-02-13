package oop;

public class AnimalStore {
    public static void main(String[] args) {
        Cat Bengal = new Cat();
        Address catAddress = new Address();
        catAddress.setCity("Sofia");
        catAddress.setPostalCode(1000);
        catAddress.setStreetName("Bulevard Bulgaria");
        String bengalCat = new String("Bengal Cat");
        Bengal.setBreed(new String("Bengal Cat"));
        Bengal.setBreed(bengalCat);
        Bengal.printData();



//        Breed bengalCat = new Breed("Bengal Cat");
//        Bengal.setBreed(new Breed("Bengal Cat"));
//        Bengal.setBreed(bengalCat);



    }
}

