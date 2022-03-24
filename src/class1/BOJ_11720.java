package class1;

import java.util.Scanner;

public class BOJ_11720 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        String input = scan.nextLine();

        int answer = 0;
        for (char c : input.toCharArray())
            answer += c - '0';
        System.out.println(answer);
    }
}
