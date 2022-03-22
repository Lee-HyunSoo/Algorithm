package class1;

import java.util.Scanner;

public class BOJ_1152 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] temp = input.trim().split(" ");
        if (temp[0].equals(""))
            System.out.println(0);
        else
            System.out.println(temp.length);
    }
}
