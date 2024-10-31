package test3_practice;
import java.util.ArrayList;
public class TestAnimal {
    public static void main(String[] args) {
        // a. Make a Bear object and store it in a variable.
        Bear bear1 = new Bear("Grizzly", 5);

        // b. Make two MommaBear objects using different constructors, storing both in different variables.
        MommaBear mommaBear1 = new MommaBear("Ursa", 7, 3); // Specified number of cubs
        MommaBear mommaBear2 = new MommaBear("Barda", 4); // Default number of cubs (2)

        // c. Make a Zoo object and store it in a variable.
        Zoo zoo = new Zoo();

        // d. Add all three Animals created above to the Zoo.
        zoo.addAnimal(bear1);
        zoo.addAnimal(mommaBear1);
        zoo.addAnimal(mommaBear2);

        // e. Assume lots of animals have been added to the zoo. Get the 8th animal from the Zoo and store it in a variable.
        Animal eighthAnimal = zoo.getAnimal(7); // Index 7 because it's 0-based

        // f. Get the Animal with name "Urg" from the Zoo and store it in a variable.
        Animal urgAnimal = zoo.getAnimal("Urg");

        // g. Remove the 5th animal in the zoo and store the result in a variable.
        Animal removedFifthAnimal = zoo.removeAnimal(4); // Index 4 for the 5th animal

        // h. Remove the animal with name "Quola" from the Zoo and store the result in a variable.
        Animal removedQuola = zoo.removeAnimal("Quola");

        // i. Call a method that returns a list of the MommaBears from the Zoo with at least 3 cubs
        //    and be sure to define a variable to hold the return from this method.
        ArrayList<MommaBear> mommaBearsWith3Cubs = zoo.getMommaBears(3);

        // j. Call the feedAll method and catch the result in a variable.
        int totalHungerAfterFeeding = zoo.feedAll();

        // k. Write several lines of code to build a string with each Animal's toString (assume there is one)
        //    appended together with line breaks.
        StringBuilder allAnimalsInfo = new StringBuilder();
        for (Animal animal : zoo.getAnimals()) {
            allAnimalsInfo.append(animal.toString()).append("\n");
        }
        String animalsDetails = allAnimalsInfo.toString();
        System.out.println(animalsDetails);
    }
}
