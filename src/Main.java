import java.util.Scanner;

public class Main {

    static int sumOfFirstNaturalNumber(int n) {
//        int sum = n;
//        for (int i = n - 1; i >= 1; i--) {
//            sum += i;
//        }
//        return sum;
        return n*(n+1)/2;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int sum = sumOfFirstNaturalNumber(n);
        System.out.println("sum = " + sum);

    }

}