package lv3;


import java.util.function.DoubleBinaryOperator;

public enum OperatorType {
    Add("+", (num1, num2) -> {
        return num1 + num2;
    }),
    Subtract("-", (num1, num2) -> {
        return num1 - num2;
    }),
    Multiply("*", (num1, num2) -> {
        return num1 * num2;
    }),
    Divide("/", (num1, num2) -> {
        return num1 / num2;
    });

    private final DoubleBinaryOperator op;
    private final String operator;
    private static OperatorType setoper;

    private OperatorType(String operator, DoubleBinaryOperator op) {
        this.operator = operator;
        this.op = op;
    }

    public String toString() {
        return this.operator;
    }

    public double apply(double num1, double num2) {
        return this.op.applyAsDouble(num1, num2);
    }

    public static OperatorType setoperator(String findoper) {
        OperatorType[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            OperatorType oper = var1[var3];
            if (oper.operator.equals(findoper)) {
                setoper = oper;
            }
        }

        return setoper;
    }
}
