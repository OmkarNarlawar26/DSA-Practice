import java.util.Scanner;

public class Codechief {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int x = sc.nextInt();
            int discount = 0;

            if (x > 5000) {
                discount = 500;
            } else if (x > 1000) {
                discount = 100;
            } else if (x > 100) {
                discount = 25;
            }

            System.out.println(x - discount);
        }

        sc.close();
    }
}
