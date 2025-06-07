import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        public static void main(String[] args){
            String name;
            String studentId;

            ArrayList<Double> grades = new ArrayList<>();

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter student name: ");
            name = sc.nextLine();

            System.out.print("Enter student id: ");
            studentId = sc.nextLine();

            while (true) {
                System.out.print("Enter grade (or 'done' to finish): ");
                String input = sc.nextLine();
                if (input.equals("done")) break;

                try {
                    double score = Double.parseDouble(input);
                    if (score < 0 || score > 100) {
                        System.out.println("Error: Grade must be between 0 and 100. Please try again.");
                    } else {
                        grades.add(score);
                    }

                } catch (NumberFormatException e) {
                    System.out.print("Error: Please enter a valid number.");
                    sc.next();
                }

            }

            System.out.println("=======================");
            System.out.println("Student: " + name + " (ID: " + studentId + ")");
            System.out.println("All grades: " + grades);

            if (!grades.isEmpty()) {
                double sum = 0;
                double average;
                for (double score : grades) {
                    sum = sum + score;
                }
                average = sum/grades.toArray().length;
                String letterGrade;
                if (average >= 90) {
                    letterGrade = "A";
                } else if (average >= 80) {
                    letterGrade = "B";
                } else if (average >= 70) {
                    letterGrade = "C";
                } else if (average >= 60) {
                    letterGrade = "D";
                } else {
                    letterGrade = "F";
                }
                System.out.println("Average Grades: " + average);
                System.out.println("Letter Grade: " + letterGrade);
            } else {
                System.out.println("No grades entered.");
            }
        }
}
