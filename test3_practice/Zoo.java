package test3_practice;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals;

    // No-argument constructor that initializes the animals list
    public Zoo() {
        animals = new ArrayList<>();
    }

    // Adds an animal to the list if it doesn't already exist (based on name)
    public boolean addAnimal(Animal animal) {
        for (Animal a : animals) {
            if (a.equals(animal)) { // Checks if an animal with the same name exists
                return false;
            }
        }
        animals.add(animal);
        return true;
    }

    // Simply adds the animal to the list without checking
    public void addAnimal2(Animal animal) {
        animals.add(animal);
    }

    // Returns the number of animals in the zoo
    public int getNumAnimals() {
        return animals.size();
    }

    // Gets the animal at the specified index, or returns null if index is invalid
    public Animal getAnimal(int index) {
        if (index >= 0 && index < animals.size()) {
            return animals.get(index);
        }
        return null;
    }

    // Gets the animal with the specified name, or returns null if not found
    public Animal getAnimal(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        return null;
    }

    // Removes the animal at the specified index and returns it, or returns null if index is invalid
    public Animal removeAnimal(int index) {
        if (index >= 0 && index < animals.size()) {
            return animals.remove(index);
        }
        return null;
    }

    // Removes the animal with the specified name and returns it, or returns null if not found
    public Animal removeAnimal(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                animals.remove(animal);
                return animal;
            }
        }
        return null;
    }

    // Returns a list of MommaBears with at least as many cubs as specified
    public ArrayList<MommaBear> getMommaBears(int numCubs) {
        ArrayList<MommaBear> mommaBears = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof MommaBear) {
                MommaBear mommaBear = (MommaBear) animal;
                if (mommaBear.getNumCubs() >= numCubs) {
                    mommaBears.add(mommaBear);
                }
            }
        }
        return mommaBears;
    }

    // Calls the feed method on all animals and returns the total hunger reduction
    public int feedAll() {
        int totalHunger = 0;
        for (Animal animal : animals) {
            totalHunger += animal.feed();
        }
        return totalHunger;
    }

    // Provides access to the animals list for external classes
    public ArrayList<Animal> getAnimals() {
        return animals;
    }
}
