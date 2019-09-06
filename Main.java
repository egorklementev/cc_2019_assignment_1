import java.io.*;

public class Main {

    private static FileReader fr;
    private static RubyParser rp;
    private static String rubyCode;
    private static int i = 0; // Substring can be done instead

    public static void main(String[] args) throws IOException {

        rubyCode = "";

        fr = new FileReader("input.txt");

        rp = new RubyParser();

        while (true) {
            int c = fr.read();
            if (c == -1) {
                break;
            }
            rubyCode += (char)c + "";
        }

        while(true) {
            Token token = getNextToken();
            if (token != null) {
                System.out.println(token.getInfo());
            } else {
                break;
            }
        }
    }

    /**Used to retrieve the next token from the code file
     * @return Next token from the code file */
    private static Token getNextToken()  {

        String remembered = "";

        while(true) {

            if (i >= rubyCode.length()) {
                return null;
            } else {
                char nextChar = rubyCode.charAt(i++);

                if (nextChar == ' ' || nextChar == '\n' || nextChar == '\r') {
                    if (remembered.length() > 0) {
                        return identify(remembered);
                    } else {
                        return getNextToken();
                    }
                } else if (rp.isDelimiter(nextChar + "")) {
                    if(remembered.length() > 0) {
                        i--;
                        return identify(remembered);
                    }
                    return new TokenDelimiter(nextChar + "");
                } else if (rp.isOperator(nextChar + "")) {

                    if (remembered.length() > 0) {
                        i--;
                        return identify(remembered);
                    }

                    // Assume that i < code.length - 3
                    String next3 = (nextChar + "") + (rubyCode.charAt(i) + "") + (rubyCode.charAt(i + 1) + "");
                    String next2 = (nextChar + "") + (rubyCode.charAt(i) + "");

                    if (rp.isOperator(next3)) {
                        i+=2;
                        return new TokenOperator(next3);
                    } else if (rp.isOperator(next2)) {
                        i++;
                        return new TokenOperator(next2);
                    } else {
                        return new TokenOperator(nextChar + "");
                    }
                } else {
                    remembered += nextChar;
                }
            }
        }
    }

    private static Token identify(String remembered) {
        if (rp.isOperator(remembered)) {
            return new TokenOperator(remembered);
        } else if (rp.isKeyword(remembered)) {
            return new TokenKeyword(remembered);
        } else if (rp.isSimpleLiteral(remembered)) {
            return new TokenLiteral(remembered);
        } else {
            return new TokenIdentifier(remembered);
        }
    }

}
