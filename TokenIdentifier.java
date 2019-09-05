/**Names of variables, functions, classes...*/
public class TokenIdentifier extends Token {

    TokenIdentifier(String value) {
        super(value);
        type = TokenType.IDENTIFIER;
    }

}
