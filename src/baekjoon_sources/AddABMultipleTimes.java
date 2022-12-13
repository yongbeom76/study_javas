package baekjoon_sources;

import java.util.Scanner;

// 문제파악
// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
// 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
// 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

// 유추파악
// 주어진 숫자만큼 a,b 쌍를 입력받아서 덧셈 결과를 출력해준다.

// 주요단어 영문 이름 선정
// T 테스트 케이스 숫자 입력
// x,y 두 숫자

// 테스트 케이스
// 5
// 1 1
// 2 3
// 3 4
// 9 8
// 5 2

// 프로그래밍 순서
// T 숫자를 입력받는다 - done
// 이 숫자만큼 loop돌면서 x, y값을 입력받는다 - done
// 출력한다. done

public class AddABMultipleTimes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T;
        // T 숫자를 입력받는다
        T = sc.nextInt();
        int x[] = new int[T];
        int y[] = new int[T];

        // T 숫자만큼 loop돌면서 x, y값을 입력받는다
        for (int i = 0; i < T; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        // 출력한다.
        for (int i = 0; i < T; i++) {
            System.out.println(x[i] + y[i]);
        }

        sc.close();
    }
}
