package class1;

import java.util.Scanner;

public class BOJ_2475 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int answer = 0;
        for (int i = 0; i < 5; i++)
            answer += (int) Math.pow(scan.nextDouble(), 2);
        System.out.println(answer % 10);
    }
}
