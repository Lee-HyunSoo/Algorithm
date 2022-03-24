package class1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BOJ_10809 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++)
            map.putIfAbsent(input.charAt(i), i);

        for (char c = 'a'; c <= 'z'; c++)
            System.out.print(map.getOrDefault(c, -1) + " ");
    }
}
