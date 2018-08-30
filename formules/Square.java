
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
