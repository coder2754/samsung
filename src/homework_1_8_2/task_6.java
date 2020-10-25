package homework_1_8_2;

import java.util.Scanner;

public class task_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int result =a[0];
        for (int i = 1; i < N; i ++) {
            if(a[i] >result) {
                result = a[i];
            }
        }
        System.out.print(result);
    }
}
