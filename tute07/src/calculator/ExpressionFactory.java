package calculator;

public class ExpressionFactory {
    
    public static AddExpression Add(Expression expression1, Expression expression2) {
        return new AddExpression(expression1, expression2);
    }

    public static SubtractExpression Subtract(Expression expression1, Expression expression2) {
        return new SubtractExpression(expression1, expression2);
    }

    public static MultiplyExpression Multiply(Expression expression1, Expression expression2) {
        return new MultiplyExpression(expression1, expression2);
    }

    public static DivideExpression Divide(Expression expression1, Expression expression2) {
        return new DivideExpression(expression1, expression2);
    }

    public static Number Number(double num) {
        return new Number(num);
    }
}
