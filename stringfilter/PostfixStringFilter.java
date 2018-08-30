package td1.stringfilter;

public class PostfixStringFilter implements StringFilter {

    private int length;

    public PostfixStringFilter(int length) {
        this.length = length;
    }

    public String filter(String string) {
        int length = Math.min(this.length, string.length());
        return string.subSequence(string.length()-length, string.length()).toString();
    }

}
