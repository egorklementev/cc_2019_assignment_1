/**For example: for, def, while...*/
public class TokenKeyword extends Token {

    TokenKeyword(String value) {
        super(value);
        type = TokenType.KEYWORD;
    }

}
