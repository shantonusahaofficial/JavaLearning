package Assignment1;

public class UnaryOperator {
    public int increment(int x) {
        return x++;
    }

    public int decrement(int x) {
        return x--;
    }

    public int preIncrement(int x) {
        return ++x;
    }

    public int preDecrement(int x) {
        return --x;
    }

    public static void main(String[] args) {
        UnaryOperator unaryOp = new UnaryOperator();
        int x = 5;
        System.out.println("Increment: " + unaryOp.increment(x));
        System.out.println("Decrement: " + unaryOp.decrement(x));
        System.out.println("Pre-increment: " + unaryOp.preIncrement(x));
        System.out.println("Pre-decrement: " + unaryOp.preDecrement(x));
    }
}
