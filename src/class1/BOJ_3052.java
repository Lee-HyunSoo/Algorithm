package class1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BOJ_3052 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            int n = scan.nextInt();
            map.putIfAbsent(n % 42, i + 1);
        }
        System.out.println(map.size());
    }
}
