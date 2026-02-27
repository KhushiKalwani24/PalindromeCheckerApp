import java.util.Scanner;

public class PalindromeCheckerApp {


    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

class UC11_ObjectOrientedPalindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        PalindromeCheckerApp checker = new PalindromeCheckerApp();

        boolean result = checker.checkPalindrome(input);

        System.out.println("input: " + input);
        System.out.println("is palindrome:" + result);

        scanner.close();
    }
}