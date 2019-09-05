/**For examples: 123, 1, 2, 3...*/
public class TokenLiteral extends Token {

    TokenLiteral(String value) {
        super(value);
        type = TokenType.LITERAL;
    }

}
