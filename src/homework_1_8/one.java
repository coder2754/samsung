package homework_1_8;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        int result = 0;
        for (int i = 0; i < N; i++) {
            if (a[i] == b) {
                result = i+1;
                break;
            }
        }
        if (result == 0) {
            System.out.println("NO");
        } else {
            System.out.println(result);
        }
    }
}
