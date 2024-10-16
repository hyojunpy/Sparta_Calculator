package lv3;

public class inputbox {
    public inputbox() {
    }

    public Double inputNum(String num1) {
        return Double.parseDouble(num1);
    }

    public OperatorType inputOper(String oper) {
        return OperatorType.setoperator(oper);
    }
}
