package Assignment1;

public class Identifiers {
    private String variableName; // Variable name

    // Constructor with the same name as the class
    public Identifiers(String variableName) {
        this.variableName = variableName;
    }

    // Method with camelCase name
    public String getVariableName() {
        return variableName;
    }

    public static void main(String[] args) {
        Identifiers identifier = new Identifiers("TestVariable");
        System.out.println("Variable Name: " + identifier.getVariableName());
    }
}
