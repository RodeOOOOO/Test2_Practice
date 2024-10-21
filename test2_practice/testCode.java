package test2_practice;

public class testCode {
    public static void main(String[] args) {
        testAverageWolfDogPower();
        testTotalWolfDogToughness();
        testLeastWeightDog();
        testMaxWeight();
    }
    public static void testMaxWeight() {
        Person person = new Person();
        Dog dog1 = new Dog("Buddy", 25.0);
        Dog dog2 = new Dog("Max", 30.0);
        person.addDog(dog1);
        person.addDog(dog2);
        double maxWeight = person.maxWeight();
        System.out.println("Max Weight: " + maxWeight);
    }
    public static void testLeastWeightDog() {
        Person person = new Person();
        Dog dog1 = new Dog("Buddy", 25.0);
        Dog dog2 = new Dog("Max", 30.0);
        person.addDog(dog1);
        person.addDog(dog2);
        Dog leastWeightDog = person.leastWeightDog();
        System.out.println("Least Weight Dog: " + leastWeightDog);
    }
    public static void testTotalWolfDogToughness() {
        Person person = new Person();

        Dog dog1 = new Dog("Buddy", 25.0);           // Toughness: 0
        Dog dog2 = new Dog("Max", 30.0);             // Toughness: 0
        Wolfdog wolfdog1 = new Wolfdog("Shadow", 40.0, 5); // Toughness: 20
        Wolfdog wolfdog2 = new Wolfdog("Luna", 35.0, 4);   // Toughness: 16

        person.addDog(dog1);
        person.addDog(dog2);
        person.addDog(wolfdog1);
        person.addDog(wolfdog2);

        int totalWolfDogToughness = person.totalWolfDogToughness();
        System.out.println("Total Wolfdog Toughness: " + totalWolfDogToughness);
    }

    public static void testAverageWolfDogPower() {
        Person person = new Person();

        Dog dog1 = new Dog("Buddy", 25.0);           // Power: 625.0
        Dog dog2 = new Dog("Max", 30.0);             // Power: 900.0
        Wolfdog wolfdog1 = new Wolfdog("Shadow", 40.0, 5); // Power: 8000.0
        Wolfdog wolfdog2 = new Wolfdog("Luna", 35.0, 4);   // Power: 4900.0

        person.addDog(dog1);
        person.addDog(dog2);
        person.addDog(wolfdog1);
        person.addDog(wolfdog2);

        double averageWolfDogPower = person.averageWolfDogPower();
        System.out.println("Average Wolfdog Power: " + averageWolfDogPower);
    }
}