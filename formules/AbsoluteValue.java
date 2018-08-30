
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
