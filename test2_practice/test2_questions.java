package test2_practice;

public class test2_questions {

    public static void main(String[] args) {
        //a.
        Dog dog1 = new Dog("Buddy", 25.0);
        Dog dog2 = new Dog("Max", 30.0);
        Dog dog3 = new Dog("Charlie", 40.0);
        Dog dog4 = new Dog("Rocky", 35.0);
        Dog dog5 = new Dog("Luna", 45.0);
        //b.
        Wolfdog wolfdog1 = new Wolfdog("Shadow", 40.0, 4);
        //c.
        Person person = new Person();
        //d.
        person.addDog(dog1);
        person.addDog(dog2);
        person.addDog(dog3);
        person.addDog(dog4);
        person.addDog(dog5);
        person.addDog(wolfdog1);
        //e.
        Dog fifthDog = person.getDog(5);
        //f.
        double totalDogPower = person.totalDogPower();
        //g.
        Dog leastWeightDog = person.leastWeightDog();
        //h.
        Dog[] newDogs = new Dog[]{dog1, wolfdog1};
        //i.
        person.newDogs(newDogs);
        //j.
        for (int i = 0; i < person.getNumDogs(); i++) {
            System.out.printf("weight : %.1f\n", person.getDogs()[i].getWeight());
        }
        /* 
         * better way to write this
        for (Dog dog : person.getDogs()) {
            System.out.printf("weight : %.1f\n", dog.getWeight()); 
        }
        */
    }

    /*
     * 3. 
     */
}