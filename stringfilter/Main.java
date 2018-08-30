package td1.stringfilter;

public class Main {

    public static void main(String arg[]) {
        String string = "aaééé!!!!!";
        PostfixStringFilter postfix = new PostfixStringFilter(6);
        System.out.println(postfix.filter(string));
    }

}
