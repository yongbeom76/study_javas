package baekjoon_1000;

import java.util.Scanner;

// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
// 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
// 첫째 줄에 A+B를 출력한다.

public class BJ1000 {
    public static void main(String[] args) {
        addMain();
    }

    public static void addMain() {
        // - 입력
        Scanner scanner = new Scanner(System.in);
        int input_first = scanner.nextInt();
        int input_second = scanner.nextInt();
        scanner.close();

        // - 처리
        int output_plus = plus(input_first, input_second);

        // - 출력
        System.out.println(output_plus);
    }

    // 두 정수 구함
    public static int plus(int input_first, int input_second) {
        int output_plus = input_first + input_second;
        return output_plus;
    }
}
