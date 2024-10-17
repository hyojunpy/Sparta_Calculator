package lv3;


import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    public App() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator<Double> arithmeticCalculator = new ArithmeticCalculator();
        InputBox inputbox = new InputBox();

        for (; ; ) {
            //정수가 아닌 다른 값이 들어갈때 예외 처리
            try {
                System.out.print("첫번째 정수를 입력하세요 : ");
                double num1 = inputbox.inputNum(sc.nextLine());
                System.out.print("두번째 정수를 입력하세요 : ");
                double num2 = inputbox.inputNum(sc.nextLine());
                //연산자가 아닌 다른 값이 들어갈때 예외 처리
                try {
                    System.out.print("연산자를 입력하세요 : ");
                    OperatorType oper = inputbox.inputOper(sc.nextLine());
                    System.out.println(arithmeticCalculator.calculate(num1, num2, oper));
                } catch (IllegalArgumentException | NullPointerException e) {
                    System.out.println("올바른 연산자가 아닙니다.");
                }
            } catch (NumberFormatException e) {
                System.out.println("올바른 정수가 아닙니다.");
            }

            //기능 구현
            System.out.println("더 계산하시겠습니까? (exit입력 시 종료 / 진행시 Enter 키 입력)");
            System.out.println("가장 먼저 저장된 데이터를 삭제하시겠습니까? (remove 입력 시 삭제 / 진행시 Enter 키 입력)");
            System.out.println("입력한 값보다 큰 결과들을 출력 하시려면 정수를 입력하세요 (진행시 Enter 키 입력)");
            String etc = sc.nextLine();
            if (etc.equals("exit")) break;
            if (etc.equals("remove")) arithmeticCalculator.removeResult();
            //개행문자 들어갈 시에 예외처리
            try {
                if (etc.matches("^[0-9]*$")) {
                    double Inputnum = inputbox.inputNum(etc);
                    List<Double> betterresult = arithmeticCalculator.getResult().stream().filter(result -> result > Inputnum).collect(Collectors.toList());
                    for (double outputnum : betterresult) {
                        System.out.println(outputnum);
                    }
                }
            } catch (NumberFormatException e) {
            } finally {
                continue;
            }
        }
    }
}