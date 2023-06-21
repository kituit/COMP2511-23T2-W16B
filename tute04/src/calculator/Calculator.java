package calculator;

public class Calculator {
    
    /**
     * 
     * @precondition Doubles a and b are non null
     * @postcodnition Return a + b
     */
    public static Double add(Double a, Double b) {
        return a + b;
    }

    public static Double subtract(Double a, Double b) {
        return a - b;
    }

    /**
     * 
     * @param a
     * @param b
     * @return
     */
    public static Double multiply(Double a, Double b) {
        return a * b;
    }

    public static Double divide(Double a, Double b) throws CalculatorException {
        if (a == null || b == null) {
            throw new CalculatorException();
        }
        
        if (b == 0) {
            throw new CalculatorException();
        }
        return a / b;
    }

    public static Double sin(Double angle) {
        return Math.sin(angle);
    }

    public static Double cos(Double angle) {
        return Math.cos(angle);
    }


    public static Double tan(Double angle) {
        return Math.tan(angle);
    }

}