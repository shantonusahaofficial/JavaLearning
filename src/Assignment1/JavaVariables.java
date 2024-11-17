package Assignment1;

public class JavaVariables {
    int instanceVariable = 10; // Instance variable
    static int staticVariable = 20; // Static variable

    public void demonstrateLocalVariable() {
        int localVariable = 30; // Local variable
        System.out.println("Local Variable: " + localVariable);
    }

    public static void main(String[] args) {
        JavaVariables variables = new JavaVariables();
        System.out.println("Instance Variable: " + variables.instanceVariable);
        System.out.println("Static Variable: " + JavaVariables.staticVariable);
        variables.demonstrateLocalVariable();
    }
}
