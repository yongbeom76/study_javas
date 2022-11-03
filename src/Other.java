import java.util.Scanner;

public class Other {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        int x[] = new int[T];
        int y[] = new int[T];

        for (int i = 0; i < T; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        for (int i = 0; i < T; i++) {
            System.out.println(x[i] + y[i]);
        }

        sc.close();
    }
}