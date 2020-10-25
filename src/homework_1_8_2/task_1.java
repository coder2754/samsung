package homework_1_8_2;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt() - 1;
        int B = sc.nextInt() - 1;
        int C = sc.nextInt() - 1;
        int D = sc.nextInt() - 1;
        int[] a = new int[N];
        int[] b = new int[N];


        for (int i = 0; i < N; i++) {
            a[i] = i + 1;
            b[i] = i + 1;
        }

        for (int i = 0; i <= B-A; i++) {
            b[i+A] = a[B - i];
        }
        a = b.clone();
        for (int i = 0; i <= D-C; i++) {
            b[i+C] = a[D - i];
        }
        for (int i = 0; i < N; i++) {
            System.out.print(b[i] + " ");

        }
    }
}
