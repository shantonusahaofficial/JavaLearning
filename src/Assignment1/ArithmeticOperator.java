package Assignment1;

public class ArithmeticOperator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return b != 0 ? a / b : Double.POSITIVE_INFINITY; // Avoid divide-by-zero
    }

    public int modulus(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        ArithmeticOperator arithOp = new ArithmeticOperator();
        System.out.println("Addition: " + arithOp.add(10, 5));
        System.out.println("Subtraction: " + arithOp.subtract(10, 5));
        System.out.println("Multiplication: " + arithOp.multiply(10, 5));
        System.out.println("Division: " + arithOp.divide(10, 5));
        System.out.println("Modulus: " + arithOp.modulus(10, 5));
    }
}
