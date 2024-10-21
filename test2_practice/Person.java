package test2_practice;

public class Person {
    private int numDogs = 0;
    private Dog[] dogs = new Dog[20];

    public Person() {
    }
    public void addDog(Dog d) {
        if (numDogs < 20) {
            dogs[numDogs] = d;
            numDogs++;
        } else {
            System.out.println("Dogs array is full");
        }
    }
    public void addDogs(Dog[] dogs) {
        for (Dog dog : dogs) {
            if (dog != null) {
                addDog(dog);  // Reusing the existing addDog() method
            }
        }
    }
    public void newDogs(Dog[] newDogs) {
        for(Dog dog : newDogs){
            addDog(dog);
        }
    }
    public int getNumDogs() {
        return numDogs;
    }
    public Dog getDog(int i) {
        if (i >= 0 && i < numDogs && dogs[i] != null) {
            return dogs[i];
        }
        return null;
    }
    /*
     * this is a better way to get the array for question j.
    public Dog[] getDogs() {
        return dogs;
    }
    */
    public Dog getDogWithName(String name) {
        for (int i = 0; i < numDogs; i++) {
            if (dogs[i].getName().equals(name)) {
                return dogs[i];
            }
        }
        return null;
    }
    public Dog remDog(Dog d) {
        for (int i = 0; i < numDogs; i++) {
            if (dogs[i] == d) {
                for (int j = i; j < numDogs - 1; j++) {
                    dogs[j] = dogs[j + 1];
                }
                dogs[numDogs - 1] = null;
                numDogs--;
                return d;
            }
        }
        return null;
    }       
    public double totalDogPower() {
        double totalPower = 0.0;
        for (Dog dog : dogs) {
            totalPower += dog.power();
        }
        return totalPower;
    }
    public double averageWolfDogPower(){
        double totalPower = 0.0;
        int numWolfDogs = 0;
        for (Dog dog : dogs) {
            if (dog instanceof Wolfdog) {
                totalPower += dog.power();
                numWolfDogs++;
            }
        }
        if (numWolfDogs > 0) {
            return totalPower / numWolfDogs;
        } else {
            return 0.0;
        }
    }
    public int totalWolfDogToughness() {
        int totalToughness = 0;
        for (Dog dog : dogs) {
            if (dog instanceof Wolfdog) {
                Wolfdog Wolfdog = (Wolfdog) dog;
                totalToughness += Wolfdog.getToughness();
            }
        }
        return totalToughness;
    }
    public Dog leastWeightDog() {
        if (numDogs == 0) {
            return null;
        }
        Dog leastWeightDog = null;
        for (Dog dog : dogs) {
            if (dog != null) {
                if (leastWeightDog == null || dog.getWeight() < leastWeightDog.getWeight()) {
                    leastWeightDog = dog;
                }
            }
        }
        return leastWeightDog;
    }
    public double maxWeight() {
        double maxWeight = 0.0;
        if (numDogs == 0) {
            return 0.0;
        } else {}
        for (Dog dog : dogs) {
            if (dog != null && dog.getWeight() > maxWeight) {
                maxWeight = dog.getWeight();
            }
        }
        return maxWeight;
    }
}
