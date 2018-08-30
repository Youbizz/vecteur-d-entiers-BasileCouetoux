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
