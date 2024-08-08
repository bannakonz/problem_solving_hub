import java.util.Scanner;
public class Main {
    private static int toMinutes(int hour, int minute) {
        return hour * 60 + minute;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hour : ");
        int hour = sc.nextInt();
        System.out.print("Enter minute : ");
        int minute = sc.nextInt();
        int totalMinutes = toMinutes(hour,minute);
        System.out.println(hour + " hour(s) " +  minute  + " minute(s) = " + totalMinutes + " minute(s)");
    }
}