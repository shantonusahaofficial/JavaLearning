package Assignment1;

public class LogicalOperator {
    public boolean andOperator(boolean a, boolean b) {
        return a && b;
    }

    public boolean orOperator(boolean a, boolean b) {
        return a || b;
    }

    public static void main(String[] args) {
        LogicalOperator logOp = new LogicalOperator();
        System.out.println("AND: " + logOp.andOperator(true, false));
        System.out.println("OR: " + logOp.orOperator(true, false));
    }
}
