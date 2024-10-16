package lv1;

import java.util.Scanner;

public class Calculator_lv1 {
    public Calculator_lv1() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("첫번째 정수를 입력하세요 : ");
            int num1 = sc.nextInt();
            System.out.print("두번째 정수를 입력하세요 : ");
            int num2 = sc.nextInt();
            sc.nextLine();
            System.out.print("연산자를 입력하세요 : ");
            char operator = sc.nextLine().charAt(0);
            switch (operator) {
                case '*':
                    System.out.println(num1 * num2);
                    break;
                case '+':
                    System.out.println(num1 + num2);
                    break;
                case '-':
                    System.out.println(num1 - num2);
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    } else {
                        System.out.println(num1 / num2);
                    }
                default:
                    break;
            }

            System.out.println("더 계산하시겠습니까? (exit입력 시 종료 / 진행시 Enter 키 입력)");
        } while(!sc.nextLine().equals("exit"));

    }
}