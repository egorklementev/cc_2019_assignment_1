/**For example: +, -, *, /...*/
public class TokenOperator extends Token {

    TokenOperator(String value) {
        super(value);
        type = TokenType.OPERATOR;
    }

}
