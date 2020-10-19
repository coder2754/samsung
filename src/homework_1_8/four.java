package homework_1_8;

import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int cur = 4;
        for (int i = 0; i < N; i++) {
            a[i] = cur;
            cur += 3;

        }
        for (int i = 0; i < N; i++) {
            System.out.print(a[i] + " ");

        }
    }
}
