package lv2;

import java.util.Scanner;

public class App {
    public App() {
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Calculator_lv2 calculatorLv2 = new Calculator_lv2();
        int count = 0;

        while(true) {
            try {
                System.out.print("첫번째 정수를 입력하세요 : ");
                calculatorLv2.setNum1(sc.nextInt());
                System.out.print("두번째 정수를 입력하세요 : ");
                calculatorLv2.setNum2(sc.nextInt());
                sc.nextLine();
                System.out.print("연산자를 입력하세요 : ");
                calculatorLv2.setOperator(sc.nextLine().charAt(0));

                try {
                    System.out.println(calculatorLv2.calculator_lv2(count));
                } catch (Exception var5) {
                    System.out.println("올바른 연산자가 아닙니다.");
                }
            } catch (Exception var6) {
                System.out.println("올바른 정수가 아닙니다.");
            }

            System.out.println("더 계산하시겠습니까? (exit입력 시 종료 / 진행시 Enter 키 입력)");
            if (sc.nextLine().equals("exit")) {
                return;
            }

            System.out.println("가장 먼저 저장된 데이터를 삭제하시겠습니까? (remove 입력 시 삭제 / 진행시 Enter 키 입력)");
            if (sc.nextLine().equals("remove")) {
                calculatorLv2.removeResult();
            }

            ++count;
        }
    }
}
