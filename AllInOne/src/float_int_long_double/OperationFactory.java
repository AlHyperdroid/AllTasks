package float_int_long_double;

public class OperationFactory {

    private static Operation operation;

    public static Operation getOperation(Number a, Number b) {
        if (a instanceof Integer && b instanceof Integer) {
            operation = new IntegerMathOperation();
        }
        if (a instanceof Double || b instanceof Double) {
            operation = new DoubleMathOperation();
        }
        if (a instanceof Float || b instanceof Float) {
            operation = new FloatMathOperation();
        }
        if (a instanceof Long || b instanceof Long) {
            operation = new LongMathOperation();
        }
        return operation;
    }
}