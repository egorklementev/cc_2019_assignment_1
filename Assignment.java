import com.sun.jdi.connect.spi.TransportService;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;
public class Assignment {
    public static void main(String[] args) throws IOException {
        Assignment sample = new Assignment();
        Locale.setDefault(Locale.US);
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");
        String a = "";
        Scanner in = new Scanner(inputFile);
        while(in.hasNext()){
            String object = in.next();
            if (sample.isDelimiter(object))
                System.out.println("It is delimiter!");
            else if (sample.isKeyword(object))
                System.out.println("It is keyword!");
            else if (sample.isOperator(object))
                System.out.println("It is operator!");
            else if (sample.isSimpleliteral(object))
                System.out.println("It is simple literal!");
            else
                System.out.println("It is identifier!");
        }
/*
        String object = "begin";

        if (sample.isDelimiter(object))
            System.out.println("It is delimiter!");
        else if (sample.isKeyword(object))
            System.out.println("It is keyword!");
        else if (sample.isOperator(object))
            System.out.println("It is operator!");
        else if (sample.isSimpleliteral(object))
            System.out.println("It is simple literal!");
        else
            System.out.println("It is identifier!");
*/


        FileWriter fileWriter = new FileWriter(outputFile);
        PrintWriter out = new PrintWriter(fileWriter);
       // System.out.println(in.toString());
    }
    public boolean isKeyword(String a){
        switch (a){
            case "BEGIN":
                return true;
            case "END":
                return true;
            case "alias":
                return true;
            case "and":
                return true;
            case "begin":
                return true;
            case "break":
                return true;
            case "case":
                return true;
            case "class":
                return true;
            case "def":
                return true;
            case "defined?":
                return true;
            case "do":
                return true;
            case "else":
                return true;
            case "elsif":
                return true;
            case "end":
                return true;
            case "ensure":
                return true;
            case "false":
                return true;
            case "for":
                return true;
            case "if":
                return true;
            case "in":
                return true;
            case "module":
                return true;
            case "next":
                return true;
            case "nil":
                return true;
            case "not":
                return true;
            case "or":
                return true;
            case "redo":
                return true;
            case "rescue":
                return true;
            case "retry":
                return true;
            case "return":
                return true;
            case "self":
                return true;
            case "super":
                return true;
            case "then":
                return true;
            case "true":
                return true;
            case "undef":
                return true;
            case "unless":
                return true;
            case "until":
                return true;
            case "when":
                return true;
            case "while":
                return true;
            case "yield":
                return true;
            case "":
                return true;
            default:
                return false;
        }
    }
    public boolean isDelimiter(String a){
        switch (a){
            case "(":
                return true;
            case ")":
                return true;
            case "[":
                return true;
            case "]":
                return true;
            case "{":
                return true;
            case "}":
                return true;
            case ",":
                return true;
            case ";":
                return true;
            case "'":
                return true;
            case "\"":
                return true;
            default:
                return false;
        }
    }
    public boolean isOperator(String a){
        switch (a){
            case "!":
                return true;
            case "+":
                return true;
            case "-":
                return true;
            case "~":
                return true;
            case "*":
                return true;
            case "**":
                return true;
            case "/":
                return true;
            case "%":
                return true;
            case "<<":
                return true;
            case ">>":
                return true;
            case "&":
                return true;
            case "|":
                return true;
            case "^":
                return true;
            case "==":
                return true;
            case "===":
                return true;
            case "!=":
                return true;
            case "<=>":
                return true;
            case ">=":
                return true;
            case ">":
                return true;
            case "<":
                return true;
            case "<=":
                return true;
            case "=":
                return true;
            case "%=":
                return true;
            case "/=":
                return true;
            case "-=":
                return true;
            case "+=":
                return true;
            case "*=":
                return true;
            case "**=":
                return true;
            case "..":
                return true;
            case "...":
                return true;
            case "not":
                return true;
            case "and":
                return true;
            case "or":
                return true;
            case "?:":
                return true;
            case "&&":
                return true;
            case "||":
                return true;
            default:
                return false;

        }
    }
    public boolean isSimpleliteral(String a) {
        if (a == null || a.isEmpty()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (!Character.isDigit(a.charAt(i))) return false;
        }
        return true;
    }
}
