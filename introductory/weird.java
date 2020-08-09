package introductory;

import java.util.Scanner;

public class weird {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = Integer.parseInt(in.nextLine());

        while (true) {
            System.out.print(n + " ");
            if (n == 1)
                break;
            if (n % 2 == 0)
                n /= 2;
            else
                n = (n * 3) + 1;
        }
    }
}
