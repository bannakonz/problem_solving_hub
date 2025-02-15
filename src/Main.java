import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours worked : ");
        int hoursWorked = sc.nextInt();
        int totalSalary = calculateSalary(hoursWorked);
        System.out.printf("Total salary = %d", totalSalary);
        sc.close();
    }

    /**
     * คำนวณค่าจ้างรายสัปดาห์ตามเงื่อนไข:
     * - ชั่วโมงปกติ (<= 40): 100 บาท/ชั่วโมง
     * - ชั่วโมงล่วงเวลา (> 40): 150 บาท/ชั่วโมง
     *
     * @param hours จำนวนชั่วโมงที่ทำงาน
     * @return จำนวนเงินค่าจ้างทั้งหมด
     */
    private static int calculateSalary(int hours) {
        return (hours <= 40)
                ? hours * 100
                : (40 * 100) + ((hours - 40) * 150);
    }
}
