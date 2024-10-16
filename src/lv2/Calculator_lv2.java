package lv2;


import java.util.ArrayList;
import java.util.List;

public class Calculator_lv2 {
    private int num1;
    private int num2;
    private char operator;
    List<Integer> result = new ArrayList();

    public Calculator_lv2() {
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public int calculator_lv2(int count) throws Exception {
        switch (this.operator) {
            case '*':
                this.result.add(this.num1 * this.num2);
                break;
            case '+':
                this.result.add(this.num1 + this.num2);
                break;
            case '-':
                this.result.add(this.num1 - this.num2);
                break;
            case '/':
                if (this.num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                } else {
                    this.result.add(this.num1 / this.num2);
                }
            default:
                break;
        }

        return (Integer)this.result.get(count);
    }

    public void removeResult() {
        this.result.removeFirst();
    }
}
