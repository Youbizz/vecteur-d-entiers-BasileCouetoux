
package td1.formules;

public class AbsoluteValue implements Formula {

    private Formula formula;

    public AbsoluteValue(Formula formula) {
        this.formula = formula;
    }

    public String asString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("|");
        stringBuilder.append(formula.asString());
        stringBuilder.append("|");
        return stringBuilder.toString();
    }

    public double asValue() {
        double formulaValue = formula.asValue();
        return Math.abs(formulaValue);
    }

}
package td1.formules;

public interface Formula {

    public String asString();
    public double asValue();

}
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

package td1.formules;

public class Maximum implements Formula {

    private Formula[] formulas;

    public Maximum(Formula... formulas) {
        this.formulas = formulas;
    }

    public String asString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("max(");
        for (int index = 0; index < formulas.length; index++) {
        	if (index > 0) stringBuilder.append(",");
            stringBuilder.append(formulas[index].asString());
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public double asValue() {
        double maximumValue = Double.MIN_VALUE;
        for (int i = 0; i < formulas.length; i++) {
            double formulaValue = formulas[i].asValue();
            if (formulaValue > maximumValue) maximumValue = formulaValue;
        }
        return maximumValue;
    }

}

package td1.formules;

public class Minimum implements Formula {

    private Formula[] formulas;

    public Minimum(Formula... formulas) {
        this.formulas = formulas;
    }

    public String asString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("min(");
        for (int index = 0; index < formulas.length; index++) {
        	if (index > 0) stringBuilder.append(",");
            stringBuilder.append(formulas[index].asString());
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public double asValue() {
        double minimumValue = Double.MAX_VALUE;
        for (int index = 0; index < formulas.length; index++) {
            double formulaValue = formulas[index].asValue();
            if (formulaValue < minimumValue) minimumValue = formulaValue;
        }
        return minimumValue;
    }

}

package td1.formules;

public class Power implements Formula {

    private Formula formula;
    private double exponent;

    public Power(Formula formula, double exponent) {
        this.formula = formula;
        this.exponent = exponent;
    }

    public String asString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(formula.asString());
        stringBuilder.append("^");
        stringBuilder.append(exponent);
        return stringBuilder.toString();
    }

    public double asValue() {
        double formulaValue = formula.asValue();
        return Math.pow(formulaValue, exponent);
    }

}

package td1.formules;

public class Product implements Formula {

    private Formula[] formulas;

    public Product(Formula... formulas) {
        this.formulas = formulas;
    }

    public String asString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");
        for (int index = 0; index < formulas.length; index++) {
        	if (index > 0) stringBuilder.append("*");
            stringBuilder.append(formulas[index].asString());
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public double asValue() {
        double productValue = 1;
        for (int index = 0; index < formulas.length; index++)
            productValue*=formulas[index].asValue();
        return productValue;
    }

}

package td1.formules;

public class Square implements Formula {

    private Formula formula;

    public Square(Formula formula) {
        this.formula = formula;
    }

    public String asString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(formula.asString());
        stringBuilder.append("^2");
        return stringBuilder.toString();
    }

    public double asValue() {
        double formulaValue = formula.asValue();
        return formulaValue*formulaValue;
    }

}

package td1.formules;

public class SquareRoot implements Formula {

    private Formula formula;

    public SquareRoot(Formula formula) {
        this.formula = formula;
    }

    public String asString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("sqrt(");
        stringBuilder.append(formula.asString());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public double asValue() {
        double formulaValue = formula.asValue();
        return Math.sqrt(formulaValue);
    }

}

package td1.formules;

public class Sum implements Formula {

    private Formula[] formulas;

    public Sum(Formula... formulas) {
        this.formulas = formulas;
    }

    public String asString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");
        for (int index = 0; index < formulas.length; index++) {
            if (index > 0) stringBuilder.append("+");
            stringBuilder.append(formulas[index].asString());
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public double asValue() {
        double sumValue = 0;
        for (int index = 0; index < formulas.length; index++)
            sumValue+=formulas[index].asValue();
        return sumValue;
    }

}

package td1.formules;

public class Variable implements Formula {

    private String name;
    private double value;

    public Variable(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String asString() {
        return name;
    }

    public double asValue() {
        return value;
    }

    public void set(double value) {
        this.value = value;
    }

}
