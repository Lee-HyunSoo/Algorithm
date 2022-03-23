package class1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BOJ_1157 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toUpperCase();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            map.putIfAbsent(input.charAt(i), 0);
            map.computeIfPresent(input.charAt(i), (k, v) -> v + 1);
        }

        char answer = 0;
        int cnt = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(Collections.max(map.values()))) {
                answer = entry.getKey();
                cnt++;
            }
        }
        if (cnt > 1)
            System.out.println("?");
        else
            System.out.println(answer);
    }
}