/**For example: spaces, dots, brackets, braces...*/
class TokenDelimiter extends Token {

    TokenDelimiter(String value) {
        super(value);
        type = TokenType.DELIMITER;
    }

}
