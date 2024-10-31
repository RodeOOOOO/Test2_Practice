package test3_practice;

public abstract class Animal {
    protected String name;
    protected int hunger;

    public Animal(String name, int hunger) {
        this.name = name;
        this.hunger = hunger;
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public abstract int feed(); // Abstract method as specified

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        return name.equals(animal.name);
    }
}