package td1.stringfilter;


public class AsciiStringFilter implements StringFilter {

    public String filter(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = 0; index < string.length(); index++) {
            char character = string.charAt(index);
            if (isAsciiChar(character)) stringBuilder.append(character);
        }
        return stringBuilder.toString();
    }
    
    private boolean isAsciiChar(char character) {
    	return character<=127;
    }

}
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
package td1.stringfilter;

public class LowerCaseStringFilter implements StringFilter {

    public String filter(String string) {
        return string.toLowerCase();
    }

}
package td1.stringfilter;

public class Main {

    public static void main(String arg[]) {
        String string = "aaééé!!!!!";
        PostfixStringFilter postfix = new PostfixStringFilter(6);
        System.out.println(postfix.filter(string));
    }

}
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
package td1.stringfilter;


public interface StringFilter {

    public String filter(String string);

}
package td1.stringfilter;

public class UpperCaseStringFilter implements StringFilter {

    public String filter(String string) {
        return string.toUpperCase();
    }

}
