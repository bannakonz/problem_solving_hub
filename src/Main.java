import java.util.Scanner;

public class Main {
    static double fahrenheitToCelsius(double fahrenheit) {
        return  (fahrenheit - 32 ) * 5.0/9.0;
    }

//  °F − 32) × 5/9 = °C

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Fahrenheit : ");
        double fahrenheit = sc.nextDouble();
        double celsius = fahrenheitToCelsius(fahrenheit);
//        System.out.println(fahrenheit + "°F = " + celsius + "°C");
        System.out.printf("%.2f°F = %.2f°C%n", fahrenheit, celsius);
    }

}