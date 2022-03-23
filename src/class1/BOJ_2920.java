package class1;

import java.util.Scanner;

public class BOJ_2920 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = "12345678";
        String[] input = scan.nextLine().split(" ");

        StringBuilder sb = new StringBuilder();
        for (String s1 : input)
            sb.append(s1);

        if (s.equals(sb.toString()))
            System.out.println("ascending");
        else if (s.equals(sb.reverse().toString()))
            System.out.println("descending");
        else
            System.out.println("mixed");
    }
}
