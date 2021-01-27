package float_int_long_double;

public class FloatMathOperation extends Operation {
    /**
     * TODO: 1. simple java types
     *     //TODO: 2. Classes
     * TODO: 3. OOP
     *          3.1 Inheritance
     *          3.2 Polymorphism
     */

    public Number sum(Number a, Number b){
        System.err.println("This is " + getClass());
        return a.floatValue() + b.floatValue();
    }

    public Number multiplication(Number a, Number b){
        System.err.println("This is " + getClass());
        return a.floatValue() * b.floatValue();
    }

    public Number divide(Number a, Number b){
        System.err.println("This is " + getClass());
        String message = "You can't divide by zero";
        Float ZERO_NUMBER = 0f;
        Float result = ZERO_NUMBER;
        if(b.floatValue() == ZERO_NUMBER.floatValue()){
            System.out.println(message);
            return result;
//            throw new ArithmeticException(message);
        }
        return  a.floatValue()/b.floatValue();
    }

    public Number difference(Number a, Number b){
        System.err.println("This is " + getClass());
        return a.floatValue() - b.floatValue();
    }
}