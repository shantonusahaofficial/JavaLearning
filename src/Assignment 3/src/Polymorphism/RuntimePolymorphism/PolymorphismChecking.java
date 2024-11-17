package Assignment;

public class PolymorphismChecking {
    public static void main(String[] args) {
        // Method Overloading
        MathOperations math = new MathOperations();
        System.out.println("Addition of integers: " + math.add(5, 10));
        System.out.println("Addition of doubles: " + math.add(5.5, 10.5));

        // Method Overriding
        Animals myAnimal = new Dog(); // Upcasting
        myAnimal.sound(); // Dog's sound() method will be called
    }
}
