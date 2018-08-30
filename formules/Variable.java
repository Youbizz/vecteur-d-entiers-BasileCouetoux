
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
