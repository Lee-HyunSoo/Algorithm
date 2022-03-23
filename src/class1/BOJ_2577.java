package class1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_2577 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt() * scan.nextInt() * scan.nextInt();
        String s = Integer.toString(num);

        List<Integer> answer = new ArrayList<>();
        for (char c = '0'; c <= '9'; c++) {
            int cnt = 0;
            for (char ch : s.toCharArray()) {
                if (ch == c)
                    cnt++;
            }
            answer.add(cnt);
        }

        for (Integer integer : answer)
            System.out.println(integer);
    }
}
