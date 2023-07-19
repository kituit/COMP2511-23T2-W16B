package calculator;

public class Calculator {
    public static void calculate(Expression expression) {
        System.out.println(expression.compute());
    }

    public static void main(String[] args) {
        Expression expression = 
            new MultiplyExpression(
                new Number(4),
                new AddExpression(
                    new Number(1),
                    new Number(3)
                )
            );

        Expression expression2 = 
            ExpressionFactory.Multiply(
                ExpressionFactory.Number(4),
                ExpressionFactory.Add(
                    ExpressionFactory.Number(1),
                    ExpressionFactory.Number(3)
                )
            );

        calculate(expression);
    }
}
