import java.util.Scanner;

public class Main {
    static int exponentCalculate(int base, int exponent) {
        int count = exponent;
        int sum = 1;
        while (count > 0) {
            sum*=base;
            count--;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base Number : ");
        int base = sc.nextInt();
        System.out.print("Enter Exponent Number : ");
        int exp = sc.nextInt();
        int result = exponentCalculate(base,exp);
        System.out.println("Result = " + result);
    }

}