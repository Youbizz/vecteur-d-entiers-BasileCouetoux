
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
