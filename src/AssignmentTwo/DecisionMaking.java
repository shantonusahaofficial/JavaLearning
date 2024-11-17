package AssignmentTwo;

public class DecisionMaking {
    public static void main(String[] args) {
        int number = 10;

        // Simple if statement
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // if-else statement
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // if-else-if ladder
        if (number < 0) {
            System.out.println("Negative number");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Positive number");
        }

        // Nested if-statement
        if (number > 0) {
            if (number < 100) {
                System.out.println("The number is positive and less than 100.");
            }
        }

        // Switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
