package class1;

import java.util.Scanner;

public class BOJ_2884 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int m = scan.nextInt();

        if (m >= 45)
            m -= 45;
        else {
            m = 15 + m;
            if (h == 0)
                h = 23;
            else
                h -= 1;
        }
        System.out.println(h + " " + m);
    }
}
