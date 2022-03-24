package class1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BOJ_10818 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        scan.nextLine();
        String[] input = scan.nextLine().split(" ");
        List<Integer> lst = new ArrayList<>();
        for (String s : input)
            lst.add(Integer.parseInt(s));

        System.out.println(Collections.min(lst) + " " + Collections.max(lst));
    }
}
