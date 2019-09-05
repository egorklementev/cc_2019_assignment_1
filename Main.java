import java.io.*;

public class Main {

    private static FileReader fr;
    private static RubyParser rp;

    public static void main(String[] args) throws IOException {

        fr = new FileReader("input.txt");

        rp = new RubyParser();

        Token token = getNextToken();

        System.out.println(token.getInfo());

    }

    /**Used to retrieve the next token from the code file
     * @return Next token from the code file */
    private static Token getNextToken()  {

        Token nextToken;

        while(true) {

            char nextChar = 0;

            try {
                nextChar = (char)fr.read();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println(nextChar);

            break;

        }

        return new TokenDelimiter("[");
    }

}
