package homework_1_8;

import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int result = 0;
        boolean found = false;
        for (int i = 0; i < N; i++) {
            if (a[i] % 2 == 0) {
                result += a[i];
                found = true;
            }
        }
        if (!found) {
            System.out.println("NO");
        } else {
            System.out.println(result);
        }
    }

}
