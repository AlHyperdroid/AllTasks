package Xproject;

import java.io.InputStream;
import java.io.PrintStream;


public class Compiler implements Command {

    private final InputStream input;
    private final PrintStream out;

    Compiler(InputStream input, PrintStream out) {
        this.input = input;
        this.out = out;
    }

    @Override
    public void evaluate(String sourceCode) {
        try {
            new Interpreter(Tokenizer.tokenize(sourceCode), input, out).evaluate();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}


