package homework_1_8;

import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        float result = 0;
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (a[i] % 2 != 0) {
                result += a[i];
                count++;
            }
        }
        if (count == 0) {
            System.out.println("NO");
        } else {
            System.out.printf("%.2f", Math.round(result / count * 100) / 100.0);

        }
    }
}
