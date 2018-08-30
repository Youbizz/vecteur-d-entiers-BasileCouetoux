package td1.stringfilter;

public class CompositeStringFilter implements StringFilter {

    private StringFilter[] filters;

    public CompositeStringFilter(StringFilter[] filters) {
        this.filters = filters;
    }

    public String filter(String string) {
        for (int index = 0; index < filters.length; index++)
            string = filters[index].filter(string);
        return string;
    }

}
