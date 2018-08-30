package td1.stringfilter;

public class LowerCaseStringFilter implements StringFilter {

    public String filter(String string) {
        return string.toLowerCase();
    }

}
