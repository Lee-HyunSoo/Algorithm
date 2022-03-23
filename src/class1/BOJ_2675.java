package class1;

import java.util.Scanner;

public class BOJ_2675 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        while(T > 0) {
            String[] input = scan.nextLine().split(" ");
            for (char c : input[1].toCharArray()) {
                for (int i = 0; i < Integer.parseInt(input[0]); i++)
                    System.out.print(c);
            }
            System.out.println();
            T--;
        }
    }
}
