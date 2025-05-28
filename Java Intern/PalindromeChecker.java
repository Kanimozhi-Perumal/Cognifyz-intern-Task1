import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word or phrase to check if it's a palindrome:");
        String input = scanner.nextLine();        
        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome!");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }        
        scanner.close();
    }    
    public static boolean isPalindrome(String str) {
        String cleanedStr = str.toLowerCase().replaceAll("[^a-z0-9]", "");   
        int left = 0;
        int right = cleanedStr.length() - 1;        
        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }        
        return true;
    }
}