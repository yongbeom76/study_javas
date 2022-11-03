import java.util.Scanner;

public class AddABMultipleTimes {
    // 문제파악
    // 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
    // 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
    // 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

    // 유추파악
    // 주어진 숫자만큼 a,b 쌍를 입력받아서 덧셈 결과를 출력해준다.

    // 주요단어 영문 이름 선정
    // numOfTestCases
    // lineInput: String[]
    // numbers[]: String[] - 두 숫자를 nextLine()으로 받아서 split()해서 배열에 넣는다.
    // a,b 입력값, sum 합계
    // notValidInput: 입력값이 정상 범위를 벗어나면 true

    // 테스트 케이스
    // 5
    // 1 1
    // 2 3
    // 3 4
    // 9 8
    // 5 2

    // 프로그래밍 순서
    // numOfTestCases 숫자를 입력받는다 - done
    // 이 숫자만큼 loop돌면서 a, b값을 입력받는다 - done
    // 출력한다. done

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력갯수를 입력해주세요");
        int numOfTestCases = scanner.nextInt();
        scanner.nextLine();
        int a, b, sum;
        String[] lineInput = new String[numOfTestCases];
        // 숫자입력
        System.out.println("0과10사이의 정수를 두개 입력해주세요");
        for (int i = 0; i < numOfTestCases; i++) {
            boolean notValidInput = true;
            while (notValidInput) {
                lineInput[i] = scanner.nextLine();
                String[] numbers = lineInput[i].split(" ");
                a = Integer.parseInt(numbers[0]);
                b = Integer.parseInt(numbers[1]);
                if ((a > 0 && a < 10) && (b > 0 && b < 10)) {
                    notValidInput = false;
                } else {
                    System.out.println("0과10사이의 정수를 입력해주세요");
                }
            }
        }
        // 결과값 출력
        for (int i = 0; i < numOfTestCases; i++) {
            String[] numbers = lineInput[i].split(" ");
            a = Integer.parseInt(numbers[0]);
            b = Integer.parseInt(numbers[1]);
            sum = a + b;
            System.out.println(sum);
        }
    }
}
