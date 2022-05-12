package lab11_4;

public interface IExpression {

    static boolean isOperator(String item) {
        return switch (item) {
            case "+", "-", "*", "%", "/" -> true;
            default -> false;
        };


    }

    static double evaluate(String expression) {
        Stack stack = new Stack(expression.length());
        String[] items = expression.split(" ");
        for (String lepegeto : items) {
            if (isOperator(lepegeto)) {
                double result = 0;
                double num2 = (double) stack.pop();
                double num1 = (double) stack.pop();
                switch (lepegeto) {
                    case "+": result = num1 + num2;
                }
                stack.push(result);
            }
            return 0;
        }
        return 0;
    }
}