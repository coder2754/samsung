package homework_1_8_2;

import java.util.Scanner;

public class task_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int result =1;
        for (int i = 1; i < N; i ++) {
            if(a[i] != a[i-1]) {
                result++;
            }
        }
        System.out.print(result);
    }
}
