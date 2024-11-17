package Assignment1;

public class RelationalOperator {
    public boolean isEqual(int a, int b) {
        return a == b;
    }

    public boolean isNotEqual(int a, int b) {
        return a != b;
    }

    public boolean isGreaterThan(int a, int b) {
        return a > b;
    }

    public boolean isLessThan(int a, int b) {
        return a < b;
    }

    public boolean isGreaterThanOrEqual(int a, int b) {
        return a >= b;
    }

    public boolean isLessThanOrEqual(int a, int b) {
        return a <= b;
    }

    public boolean isInstance(Object obj, Class<?> cls) {
        return cls.isInstance(obj);
    }

    public static void main(String[] args) {
        RelationalOperator relOp = new RelationalOperator();
        System.out.println("Equal: " + relOp.isEqual(10, 5));
        System.out.println("Not Equal: " + relOp.isNotEqual(10, 5));
        System.out.println("Greater than: " + relOp.isGreaterThan(10, 5));
        System.out.println("Less than: " + relOp.isLessThan(10, 5));
        System.out.println("Instance of String: " + relOp.isInstance("Hello", String.class));
    }
}
