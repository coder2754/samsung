package homework_2_1_2;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toOctalString(a));
        System.out.println(Integer.toHexString(a));
        if (a == (byte) a) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        if (a == (short) a) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
