package test2_practice;

public class Dog {
    protected String name;
    protected double weight;

    public Dog(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public double power() {
        return weight*weight;
    }
    public void bulkUp(double amount) {
        this.weight += amount;
    }
    @Override
    public String toString() {
        return String.format("name=%s, weight=%.2f", name, weight);
    }
}