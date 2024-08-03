import java.util.Scanner;

public class Main {
    static double calculateFuelConsumption(double length, double litter) {
        return  length/litter;
    }

    public static void main(String[] args) {

        /*
        1. เจ้าของรถคันหนึ่งสังเกตว่าเขาขับรถของเขาไปได้ไกล 300 กิโลเมตร โดยใช้น้ำมัน 20 ลิตร เขาอยากทราบรถของเขากินน้ำมันกี่กิโลลิตร
        ให้เติมคำสั่งที่มีการคำนวณลงไปในช่องว่างของ โปรแกรม calculateFuelConsumption เพื่อคำนวณอัตราการใช้น้ำมันรถคันนั้น
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance traveled (in kilometers): ");
        double distance = sc.nextDouble();

        System.out.print("Enter the amount of fuel used (in liters): ");
        double fuel = sc.nextDouble();

        double kmPerLiter = calculateFuelConsumption(distance, fuel);
        System.out.println("The fuel consumption rate of your car is: " + kmPerLiter + " kilometers per liter");

    }

}