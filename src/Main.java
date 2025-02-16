import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("X");
            }
            System.out.println();
        }

        sc.close();
    }
}

// Enter number: 5
// XXXXX
// XXXX
// XXX
// XX
// X

