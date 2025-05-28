import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);           
        System.out.print("Enter the number of grades: ");
        int numGrades = scanner.nextInt();               
        while (numGrades <= 0) {
            System.out.print("Please enter a positive number of grades: ");
            numGrades = scanner.nextInt();
        }               
        double[] grades = new double[numGrades];
        double sum = 0.0;     
       
        for (int i = 0; i < numGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();           
            
            while (grades[i] < 0 || grades[i] > 100) {
                System.out.print("Grade must be between 0 and 100. Enter grade " + (i + 1) + ": ");
                grades[i] = scanner.nextDouble();
            }
            sum += grades[i];
        }       
        
        double average = sum / numGrades;
        System.out.printf("The average grade is: %.2f%n", average);
        
        scanner.close();
    }
} {
    
}
