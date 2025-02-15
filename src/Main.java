import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        int result = calculatePolynomial(n);

        System.out.printf("Total is = %d%n", result);

        scanner.close();
    }

    /**
     * คำนวณสมการพหุนาม: 4x³ + 3x² + 2x + 1
     * @param x ค่าที่ต้องการคำนวณ
     * @return ผลลัพธ์ที่ได้จากการคำนวณ
     */
    private static int calculatePolynomial(int x) {
        return 4 * x * x * x + 3 * x * x + 2 * x + 1;
    }
}
