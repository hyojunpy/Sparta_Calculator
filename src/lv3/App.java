package lv3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    public App() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator<Double> arithmeticCalculator = new ArithmeticCalculator();
        ArithmeticCalculator<Double> arithmeticCalculator1 = new ArithmeticCalculator<>();
        inputbox inputbox = new inputbox();

        for (; ; ) {
            System.out.print("첫번째 정수를 입력하세요 : ");
            double num1 = inputbox.inputNum(sc.nextLine());
            System.out.print("두번째 정수를 입력하세요 : ");
            double num2 = inputbox.inputNum(sc.nextLine());
            System.out.print("연산자를 입력하세요 : ");
            OperatorType oper = inputbox.inputOper(sc.nextLine());

            System.out.println(arithmeticCalculator.calculate(num1, num2, oper));

            System.out.println("더 계산하시겠습니까? (exit입력 시 종료 / 진행시 Enter 키 입력)");
            System.out.println("가장 먼저 저장된 데이터를 삭제하시겠습니까? (remove 입력 시 삭제 / 진행시 Enter 키 입력)");
            System.out.println("입력한 값보다 큰 결과들을 출력 하시려면 정수를 입력하세요 (진행시 Enter 키 입력)");
            String etc = sc.nextLine();
            if (etc.equals("exit")) break;
            if (etc.equals("remove")) arithmeticCalculator.removeResult();

        }
    }
}