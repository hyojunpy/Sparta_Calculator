package lv3;


import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator<T> {
    private T t;
    private List<Double> result = new ArrayList();

    public ArithmeticCalculator() {
    }

    public double calculate(T num1, T num2, OperatorType oper) {
        this.result.add(oper.apply((Double) num1, (Double)num2));
        return oper.apply((Double)num1, (Double)num2);
    }

    public void removeResult() {
        this.result.removeFirst();
    }
}
