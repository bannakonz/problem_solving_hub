import java.util.Scanner;

public class Main {
    static double exponentCalculate(double base, double exponent) {
        double result = 1;

        if (exponent < 0) {
            base = 1 / base;
            exponent = -exponent;
        }

        while (exponent > 0) {
            result*=base;
            exponent--;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base Number : ");
        double base = sc.nextDouble();
        System.out.print("Enter Exponent Number : ");
        double exp = sc.nextDouble();
        double result = exponentCalculate(base,exp);
        System.out.printf("Result = %.3f\n", result);
    }

}