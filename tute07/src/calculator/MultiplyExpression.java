package calculator;

public class MultiplyExpression implements Expression {

    private Expression left;
    private Expression right;

    public MultiplyExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double compute() {
        return left.compute() * right.compute();
    }
    
}
