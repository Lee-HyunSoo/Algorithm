package class1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BOJ_2562 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 9; i++)
            map.put(scan.nextInt(), i + 1);

        System.out.println(Collections.max(map.keySet()));
        System.out.println(map.get(Collections.max(map.keySet())));
    }
}
