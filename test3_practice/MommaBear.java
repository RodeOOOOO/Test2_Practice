package test3_practice;
public class MommaBear extends Bear {
    private int numCubs;

    public MommaBear(String name, int hunger, int numCubs) {
        super(name, hunger);
        this.numCubs = numCubs;
    }

    public MommaBear(String name, int hunger) {
        super(name, hunger);
        this.numCubs = 2; // Default number of cubs if not specified
    }

    public int getNumCubs() {
        return numCubs;
    }

    @Override
    public int feed() {
        int totalReduction = 1 + numCubs; // 1 for the MommaBear + number of cubs
        hunger -= totalReduction;
        if (hunger < 0) {
            hunger = 0; // Ensure hunger doesn't go below zero
        }
        return hunger;
    }
}
