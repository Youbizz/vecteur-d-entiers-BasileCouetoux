package td1.formules;

public class Main {

    public static void generatePoints(Formula formula, Variable variable, double startValue, double endValue, double step) {
        for (double value = startValue; value <= endValue; value += step) {
            variable.set(value);
            System.out.println(value + " " + formula.asValue());
        }
    }

    public static void main(String arg[]) {
        Variable variable = new Variable("variable", 0);
        Formula formula = new Square(variable);
        generatePoints(formula, variable, -5, 10, 1.5);
    }
}
