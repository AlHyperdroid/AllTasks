package Xproject;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;

public class Interpreter {
    private static final int MEMORY_SIZE = 30000;
    private final PrintStream out;

    private final List<Token> tokens;
    private int currTokenIndex;

    private final char[] memory;
    private int currCell;
    private int bracketsCount;

    Interpreter(List<Token> tokens, InputStream input, PrintStream out) {
        memory = new char[MEMORY_SIZE];
        this.out = out;
        this.tokens = tokens;
    }

    public void evaluate() throws IOException {
        for (currTokenIndex = 0; currTokenIndex < tokens.size(); ++currTokenIndex) {
            switch (tokens.get(currTokenIndex)) {
                case NEXT_CELL -> nextCell();
                case PREV_CELL -> previousCell();
                case INC -> increment();
                case DEC -> decrement();
                case PRINT -> output();
                case OPEN_BRACKET -> {
                    bracketsCount++;
                    if (memory[currCell] == (char) 0) {
                        moveUntilCloseBracket();
                    }
                }
                case CLOSE_BRACKET -> {
                    bracketsCount--;
                    if (memory[currCell] != (char) 0) {
                        moveToOpenBracket();
                    }
                }
            }
        }
    }

    private void nextCell() {
        currCell++;
    }

    private void previousCell() {
        currCell--;
    }

    private void increment() {
        memory[currCell]++;
    }

    private void decrement() {
        memory[currCell]--;
    }

    private void output() {
        out.print(memory[currCell]);
    }

    private void checkForBracket() {
        switch (tokens.get(currTokenIndex)) {
            case OPEN_BRACKET:
                bracketsCount++;
                break;
            case CLOSE_BRACKET:
                bracketsCount--;
                break;
            default:
                break;
        }
    }

    private void moveUntilCloseBracket() {
        int neededBrackets = bracketsCount - 1;
        while (bracketsCount != neededBrackets) {
            ++currTokenIndex;
            checkForBracket();
        }
    }

    private void moveToOpenBracket() {
        int neededBrackets = bracketsCount + 1;
        while (bracketsCount != neededBrackets) {
            --currTokenIndex;
            checkForBracket();
        }
    }
}


