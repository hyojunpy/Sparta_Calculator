package lv3;

public class InputBox {

    public Double inputNum(String num) throws NumberFormatException { return Double.parseDouble(num); }

    public OperatorType inputOper(String oper) throws IllegalArgumentException {
        return OperatorType.setoperator(oper);
    }
}
