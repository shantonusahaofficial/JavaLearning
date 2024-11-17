package AssignmentTwo;

public class LoopStatements {
    public static void main(String[] args) {
        // for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("for loop - Count: " + i);
        }

        // for-each loop
        int[] numbers = {10, 20, 30};
        for (int number : numbers) {
            System.out.println("for-each loop - Element: " + number);
        }

        // while loop
        int count = 1;
        while (count <= 3) {
            System.out.println("while loop - Count: " + count);
            count++;
        }

        // do-while loop
        int index = 1;
        do {
            System.out.println("do-while loop - Index: " + index);
            index++;
        } while (index <= 3);
    }
}
