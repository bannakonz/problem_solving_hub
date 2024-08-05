import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        final double PI = 3.41;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius : ");
        double r = sc.nextDouble();
        double areaOfCircle = PI * (r * r);
        System.out.println("Area of Circle = " + areaOfCircle);
    }

}