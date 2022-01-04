package generated;

public class MyToken {

    final Enum token;

    final String text;

    final int startIndex;

    final int stopIndex;

    private final boolean skip;

    protected MyToken(Enum token, String text, int startIndex, boolean skip) {
        this.token = token;
        this.text = text;
        this.startIndex = startIndex;
        this.stopIndex = startIndex + text.length();
        this.skip = skip;
    }


    public int getTokenLen() {
        return stopIndex - startIndex;
    }

    boolean isSkip() {
        return skip;
    }
}