package homework_1_8;

import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int c;
        for (int i = 0; i < N; i++) {
            c = sc.nextInt();
            a[i] = c;
        }
        int num = 0;
        int max_count = 0;
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = i; j < N; j++) {
                if(a[i]== a[j]) {
                    count++;
                }
            }
            if (max_count < count) {
                max_count = count;
                num = i;
            }
        }
        System.out.println(a[num]);
    }
}
