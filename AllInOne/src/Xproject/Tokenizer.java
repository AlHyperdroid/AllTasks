package Xproject;

import java.util.ArrayList;
import java.util.List;


public class Tokenizer {

    public static List<Token> tokenize(String source) {
        List<Token> tokens = new ArrayList<>();
        for (int i = 0; i < source.length(); ++i) {
            Token token = switch (source.charAt(i)) {
                case '>' -> Token.NEXT_CELL;
                case '<' -> Token.PREV_CELL;
                case '+' -> Token.INC;
                case '-' -> Token.DEC;
                case '.' -> Token.PRINT;
                case '[' -> Token.OPEN_BRACKET;
                case ']' -> Token.CLOSE_BRACKET;
                default -> null;
            };
            if (token == null)
                continue;
            tokens.add(token);
        }
        return tokens;
    }

}

