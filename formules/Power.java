
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
