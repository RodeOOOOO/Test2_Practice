public class StackOfPersons {
    private Person[] persons;
    private int size = 0;

    public StackOfPersons(int capacity) {
        persons = new Person[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // Push method
    public void push(Person p) {
        if (size < persons.length) {  // Ensure there is space in the stack
            persons[size] = p;        // Add person at the top (size index)
            size++;                   // Increase the size of the stack
        } else {
            System.out.println("Stack is full, cannot add more persons.");
        }
    }

    // Pop method
    public Person pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot pop.");
            return null;              // Return null if the stack is empty
        } else {
            size--;                   // Decrease the size of the stack
            return persons[size];     // Return the top person
        }
    }
}
