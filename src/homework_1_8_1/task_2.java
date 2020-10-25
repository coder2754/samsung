package homework_1_8_1;

import java.util.Arrays;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N - 1; i++) {
            a[i] = sc.nextInt();
        }
        a[N - 1] = Integer.MAX_VALUE;
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if (a[i] != i + 1) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
