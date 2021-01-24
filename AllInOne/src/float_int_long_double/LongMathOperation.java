package float_int_long_double;

public class LongMathOperation extends Operation {
    /**
     * TODO: 1. simple java types
     *     //TODO: 2. Classes
     * TODO: 3. OOP
     *          3.1 Inheritance
     *          3.2 Polymorphism
     */

    public Number sum(Number a, Number b){
        System.err.println("This is " + getClass());
        return a.longValue() + b.longValue();
    }

    public Number multiplication(Number a, Number b){
        System.err.println("This is " + getClass());
        return a.longValue() * b.longValue();
    }

    public Number divide(Number a, Number b){
        System.err.println("This is " + getClass());
        String message = "You can't divide by zero";
        Long ZERO_NUMBER = 0L;
        Long result = ZERO_NUMBER;
        if(b.floatValue() == ZERO_NUMBER.floatValue()){
            System.out.println(message);
            return result;
//            throw new ArithmeticException(message);
        }
        result = a.longValue()/b.longValue();
        return result;
    }

    public Number difference(Number a, Number b){
        System.err.println("This is " + getClass());
        return a.longValue() - b.longValue();
    }
}