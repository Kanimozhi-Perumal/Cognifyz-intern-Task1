import java.security.SecureRandom;
import java.util.Scanner;
public class RandomPasswordGenerator {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Enter desired password length: ");
        int length = scanner.nextInt();
        scanner.nextLine();        
        System.out.print("Include numbers? (y/n): ");
        boolean includeNumbers = scanner.nextLine().trim().toLowerCase().startsWith("y");        
        System.out.print("Include lowercase letters? (y/n): ");
        boolean includeLowercase = scanner.nextLine().trim().toLowerCase().startsWith("y");        
        System.out.print("Include uppercase letters? (y/n): ");
        boolean includeUppercase = scanner.nextLine().trim().toLowerCase().startsWith("y");        
        System.out.print("Include special characters? (y/n): ");
        boolean includeSpecial = scanner.nextLine().trim().toLowerCase().startsWith("y");               
        if (length <= 0) {
            System.out.println("Password length must be positive!");
            scanner.close();
            return;
        }        
        if (!includeNumbers && !includeLowercase && !includeUppercase && !includeSpecial) {
            System.out.println("At least one character type must be selected!");
            scanner.close();
            return;
        }                
        String password = generatePassword(length, includeNumbers, includeLowercase,  includeUppercase, includeSpecial);
        System.out.println("Generated Password: " + password);        
        scanner.close();
    }    
    private static String generatePassword(int length, boolean includeNumbers, boolean includeLowercase, boolean includeUppercase, 
                                        boolean includeSpecial) {
        String numbers = "0123456789";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special = "!@#$%^&*()-_=+[{]}|;:,<.>?";        
        StringBuilder charPool = new StringBuilder();
        if (includeNumbers) charPool.append(numbers);
        if (includeLowercase) charPool.append(lowercase);
        if (includeUppercase) charPool.append(uppercase);
        if (includeSpecial) charPool.append(special);      
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();        
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(charPool.length());
            password.append(charPool.charAt(randomIndex));
        }        
        return password.toString();
    }
} 