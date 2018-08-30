
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
