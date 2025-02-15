import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();



//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//
//                 if (i == n - 1 || j == 0 || i == j || i > j) {
//                     System.out.print("X");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }




        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }


 /*
 Method 3
 ex.
 System.out.println("A".repeat(5));  // ผลลัพธ์: AAAAA
 System.out.println("Hi".repeat(3)); // ผลลัพธ์: HiHiHi

 */
//         for (int i = 1; i <= n; i++) {
//             System.out.println("X".repeat(i));
//         }


        sc.close();
    }
}
