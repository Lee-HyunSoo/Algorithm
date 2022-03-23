package class1;

import java.util.Scanner;

public class BOJ_2908 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");

        StringBuilder sb1 = new StringBuilder(input[0]);
        String a = sb1.reverse().toString();

        StringBuilder sb2 = new StringBuilder(input[1]);
        String b = sb2.reverse().toString();

        if (Integer.parseInt(a) > Integer.parseInt(b))
            System.out.println(a);
        else
            System.out.println(b);
    }
}
