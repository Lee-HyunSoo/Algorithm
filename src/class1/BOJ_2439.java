package class1;

import java.util.Scanner;

public class BOJ_2439 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        for (int i = N; i > 0; i--) {
            for (int j = i - 1; j > 0; j--)
                System.out.print(" ");
            for (int j = i - 1; j < N; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
