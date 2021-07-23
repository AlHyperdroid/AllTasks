package Xproject;

public class BFMain {

    public static void main(String[] args) {
        Command bf = new Compiler(System.in, System.out);
        bf.evaluate("++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++\n" +
                ".>+.+++++++..+++.>++.<<+++++++++++++++.>.+++.\n" +
                "------.--------.>+.>. ");
        bf.evaluate("++++++++++[>+++++++>++++++++++>\n" +
                "+++>+<<<<-]>++.>+.+++++++..+++.\n" +
                ">++.<<+++++++++++++++.>.+++.——.\n" +
                "——--.>+.>.");
        bf.evaluate("");
    }
}
