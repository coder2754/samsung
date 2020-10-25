package homework_1_8_1;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = Integer.toString(a, 2);
        for (int i = b.length()-1; i >=0; i--) {
            System.out.print(b.charAt(i));
        }

    }
}
