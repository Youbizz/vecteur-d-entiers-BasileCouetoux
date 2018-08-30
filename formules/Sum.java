
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
