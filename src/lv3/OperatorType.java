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

    //연산용 함수형 인터페이스
    private final DoubleBinaryOperator op;
    //연산용 연산자 변수
    private final String operator;
    //연산자 설정용
    private static OperatorType setoper;

    OperatorType(String operator, DoubleBinaryOperator op) {
        this.operator = operator;
        this.op = op;
    }

    public String toString() {
        return this.operator;
    }

    //연산식
    public double apply(double num1, double num2) {
        return this.op.applyAsDouble(num1, num2);
    }

    //연산자 설정 및 초기화 null 예외 처리 완료
    public static OperatorType setoperator(String findoper) {
        setoper = null;
        for(OperatorType oper : OperatorType.values()) {
            if (oper.operator.equals(findoper)) {
                setoper = oper;
            }
        }
        return setoper;
    }
}
