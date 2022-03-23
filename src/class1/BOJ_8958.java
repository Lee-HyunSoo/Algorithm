package class1;

import java.util.Scanner;

public class BOJ_8958 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();

        while(n > 0) {
            String input = scan.nextLine();

            int answer = 0;
            int cnt = 1;
            char prev;
            for (char c : input.toCharArray()) {
                prev = c;
                if (prev == 'O') {
                    answer += cnt;
                    cnt++;
                } else if (prev == 'X')
                    cnt = 1;
            }
            System.out.println(answer);
            n--;
        }
    }
}
