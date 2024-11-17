package AssignmentTwo;

public class JumpStatements {
    public static void main(String[] args) {
        // break statement
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;  // exit loop when i is 3
            }
            System.out.println("Break Example - i: " + i);
        }

        // continue statement
        for (int j = 1; j <= 5; j++) {
            if (j == 3) {
                continue;  // skip the rest of the loop when j is 3
            }
            System.out.println("Continue Example - j: " + j);
        }
    }
}
