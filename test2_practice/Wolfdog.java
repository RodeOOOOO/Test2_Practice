package test2_practice;

public class Wolfdog extends Dog {
    final int toughness;

    public Wolfdog(String name, double weight, int toughness) {
        super(name, weight);
        this.toughness = toughness;
    }
    public Wolfdog(String name, double weight) {
        this(name, weight, 1);
    }
    public int getToughness() {
        return toughness;
    }
    @Override
    public double power() {
        return super.power() * toughness;
    }
    @Override
    public String toString() {
        return String.format("name=%s, weight=%.2f, toughness=%d", super.getName(), super.getWeight(), toughness);
    }
}
