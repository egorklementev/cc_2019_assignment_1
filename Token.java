public class Token implements IToken {

    TokenType type;

    private String value;

    Token(String value) {
        this.value = value;
        type = null;
    }

    enum TokenType {
        DELIMITER,
        OPERATOR,
        KEYWORD,
        IDENTIFIER,
        LITERAL
    }

    @Override
    public String getInfo() {
        return "Token type: " + type.toString() + "\n" +
                "String representation: \"" + value + "\"\n";
    }

}
