import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter the unit of measurement (C for Celsius, F for Fahrenheit): ");
        String unit = scanner.next().toUpperCase();
        double convertedTemperature;
        String convertedUnit;        
        if (unit.equals("C")) {            
            convertedTemperature = (temperature * 9 / 5) + 32;
            convertedUnit = "Fahrenheit";
        } else if (unit.equals("F")) {            
            convertedTemperature = (temperature - 32) * 5 / 9;
            convertedUnit = "Celsius";
        } else {
            System.out.println("Invalid unit entered. Please use 'C' for Celsius or 'F' for Fahrenheit.");
            scanner.close();
            return;
        }       
        System.out.printf("%.2f %s is equal to %.2f %s%n", 
            temperature, unit.equals("C") ? "Celsius" : "Fahrenheit", 
            convertedTemperature, convertedUnit);
        scanner.close();
    }
}