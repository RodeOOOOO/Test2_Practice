package test3_practice;
public class Bear extends Animal {

    public Bear(String name, int hunger) {
        super(name, hunger);
    }

    @Override
    public int feed() {
        if (hunger > 0) {
            hunger -= 1;
        }
        return hunger;
    }
}
