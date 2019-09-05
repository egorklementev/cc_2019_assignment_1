public class RubyParser {

    public boolean isKeyword(String a){
        switch (a){
            case "BEGIN":
            case "END":
            case "alias":
            case "and":
            case "begin":
            case "break":
            case "case":
            case "class":
            case "def":
            case "defined?":
            case "do":
            case "else":
            case "elsif":
            case "end":
            case "ensure":
            case "false":
            case "for":
            case "if":
            case "in":
            case "module":
            case "next":
            case "nil":
            case "not":
            case "or":
            case "redo":
            case "rescue":
            case "retry":
            case "return":
            case "self":
            case "super":
            case "then":
            case "true":
            case "undef":
            case "unless":
            case "until":
            case "when":
            case "while":
            case "yield":
            case "":
                return true;
            default:
                return false;
        }
    }
    public boolean isDelimiter(String a){
        switch (a){
            case "(":
            case ")":
            case "[":
            case "]":
            case "{":
            case "}":
            case ",":
            case ";":
            case "'":
            case "\"":
                return true;
            default:
                return false;
        }
    }
    public boolean isOperator(String a){
        switch (a){
            case "!":
            case "+":
            case "-":
            case "~":
            case "*":
            case "**":
            case "/":
            case "%":
            case "<<":
            case ">>":
            case "&":
            case "|":
            case "^":
            case "==":
            case "===":
            case "!=":
            case "<=>":
            case ">=":
            case ">":
            case "<":
            case "<=":
            case "=":
            case "%=":
            case "/=":
            case "-=":
            case "+=":
            case "*=":
            case "**=":
            case "..":
            case "...":
            case "not":
            case "and":
            case "or":
            case "?:":
            case "&&":
            case "||":
                return true;
            default:
                return false;

        }
    }
    public boolean isSimpleLiteral(String a) {
        if (a == null || a.isEmpty()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (!Character.isDigit(a.charAt(i))) return false;
        }
        return true;
    }
}
