
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
