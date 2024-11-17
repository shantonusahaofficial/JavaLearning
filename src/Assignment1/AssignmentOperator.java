package Assignment1;

public class AssignmentOperator {
    public int assign(int a) {
        int b = a;
        return b;
    }

    public int addAssign(int a, int b) {
        a += b;
        return a;
    }

    public int subtractAssign(int a, int b) {
        a -= b;
        return a;
    }

    public int multiplyAssign(int a, int b) {
        a *= b;
        return a;
    }

    public int divideAssign(int a, int b) {
        a /= b;
        return a;
    }

    public int modulusAssign(int a, int b) {
        a %= b;
        return a;
    }

    public static void main(String[] args) {
        AssignmentOperator assignOp = new AssignmentOperator();
        int a = 10, b = 5;
        System.out.println("Assignment: " + assignOp.assign(a));
        System.out.println("Add assignment: " + assignOp.addAssign(a, b));
        System.out.println("Subtract assignment: " + assignOp.subtractAssign(a, b));
        System.out.println("Multiply assignment: " + assignOp.multiplyAssign(a, b));
        System.out.println("Divide assignment: " + assignOp.divideAssign(a, b));
        System.out.println("Modulus assignment: " + assignOp.modulusAssign(a, b));
    }
}