package AssignmentTwo;

public class Car {
    // Fields
    String color;
    String model;
    int year;

    // Constructor
    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayInfo() {
        System.out.println("Car Model: " + model + ", Color: " + color + ", Year: " + year);
    }

    // Main method
    public static void main(String[] args) {
        // Creating objects
        Car car1 = new Car("Red", "Toyota Supra", 2020);
        car1.displayInfo();

        Car car2 = new Car("Blue", "Honda Civic", 2022);
        car2.displayInfo();
    }
}
