package class1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BOJ_1546 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        List<Integer> score = new ArrayList<>();
        for (int i = 0; i < N; i++)
            score.add(scan.nextInt());

        double answer = 0;
        for (Integer i : score)
            answer += (double) i / Collections.max(score) * 100;
        System.out.println(answer / N);
    }
}
