package lv3;

public class InputBox {
    //입력 받은 String -> Double로 반환
    public Double inputNum(String num) throws NumberFormatException { return Double.parseDouble(num); }
    //입력 받은 String -> OperatorType 반환 / setopertator에서 연산자 설정
    public OperatorType inputOper(String oper) throws IllegalArgumentException { return OperatorType.setoperator(oper); }
}
