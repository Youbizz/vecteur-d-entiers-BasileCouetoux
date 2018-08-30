package td1.stringfilter;

public class PrefixStringFilter implements StringFilter {

    private int length;

    public PrefixStringFilter(int length) {
        this.length = length;
    }

    public String filter(String s) {
        int length = Math.min(this.length, s.length());
        return s.subSequence(0, length).toString();
    }

}
