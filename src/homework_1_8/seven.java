package homework_1_8;

import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int c;
        for (int i = 0; i < N; i++) {
            c = sc.nextInt();
            a[i] = c;
        }
        int[] b = new int[N];
        int temp = 0;
        int temp2 = N - 1;
        for (int i = N - 1; i >= 0; i--) {
            if (a[i] >= 0) {
                b[temp2] = a[i];
                temp2--;
            }
            if (a[N - i - 1] < 0) {
                b[temp] = a[N - i - 1];
                temp++;
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
