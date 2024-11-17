package Assignment;

public class InheritanceChecking {
    public static void main(String[] args) {
        // Single Inheritance
        Dog dog = new Dog();
        dog.eat(); // Inherited from Animal
        dog.bark();

        // Multilevel Inheritance
        Puppy puppy = new Puppy();
        puppy.eat();  // Inherited from Animal
        puppy.bark(); // Inherited from Dog
        puppy.weep();

        // Hierarchical Inheritance
        Cat cat = new Cat();
        cat.eat(); // Inherited from Animal
        cat.meow();
    }
}
