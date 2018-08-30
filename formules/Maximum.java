
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
