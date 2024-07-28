import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int input;
        int revert = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        input = sc.nextInt();
        int num = input;
        while (input > 0) {
            int digit = input % 10;
            revert = revert * 10 + digit;
            input = input / 10;
        }

        if (revert == num) {
            System.out.println(num + " IS PALINDROME NUMBER");;
        } else {
            System.out.println(num + " IS NOT PALINDROME NUMBER");
        }
    }
}