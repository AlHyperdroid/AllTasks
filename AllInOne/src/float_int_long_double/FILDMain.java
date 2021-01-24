package float_int_long_double;

public class FILDMain {
    public static void main(String[] args) {
        double a = 75;
        int b = 3;
        Operation operation = OperationFactory.getOperation(a,b);
        System.out.println("Sum ==> "            + operation.sum(a,b));
        System.out.println("Multiplication ==> " + operation.multiplication(a,b));
        System.out.println("Divide ==> "         + operation.divide(a,b));
        System.out.println("Difference ==> "     + operation.difference(a,b));
    }
}