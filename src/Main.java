import java.util.Scanner;
public class Main {

        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = scanner.nextInt();

        System.out.println("\nMultiplication Table for " + base + ":");
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%d * %d = %d\n", base, i, base * i);
        }

   }

}
