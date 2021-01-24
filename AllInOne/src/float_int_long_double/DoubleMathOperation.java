package float_int_long_double;

public class DoubleMathOperation extends Operation {
    /**
     * TODO: 1. simple java types
     *     //TODO: 2. Classes
     * TODO: 3. OOP
     *          3.1 Inheritance
     *          3.2 Polymorphism
     */

    public Number sum(Number a, Number b){
        System.err.println("This is " + getClass());
            return a.doubleValue()+ b.doubleValue();
    }

    public Number multiplication(Number a, Number b){
        System.err.println("This is " + getClass());
        return a.doubleValue() * b.doubleValue();
    }

    public Number divide(Number a, Number b){
        System.err.println("This is " + getClass());
        String message = "You can't divide by zero";
        Double ZERO_NUMBER = 0d;
        Double result = ZERO_NUMBER;
        if(b.doubleValue() == ZERO_NUMBER.intValue()){
            System.out.println(message);
            return result;
//            throw new ArithmeticException(message);
        }
        result = a.doubleValue()/b.doubleValue();
        return result;
    }

    public Number difference(Number a, Number b){
        System.err.println("This is " + getClass());
        return a.doubleValue() - b.doubleValue();
    }
}