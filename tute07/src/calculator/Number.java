package calculator;

// Leaf nodes in binary tree
public class Number implements Expression {

    private double num;

    public Number(double num) {
        this.num = num;
    }

    @Override
    public double compute() {
        return num;
    }
    
}
