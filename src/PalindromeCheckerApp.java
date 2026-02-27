import java.util.*;

public class PalindromeCheckerApp {


    public static boolean iterativePalindrome(String input) {
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


    public static boolean recursivePalindrome(String input, int start, int end) {
        if (start >= end)
            return true;

        if (input.charAt(start) != input.charAt(end))
            return false;

        return recursivePalindrome(input, start + 1, end - 1);
    }


    public static boolean stackPalindrome(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : input.toCharArray()) {
            if (ch != stack.pop())
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        long startTime = System.nanoTime();

        boolean result = iterativePalindrome(input);

        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        System.out.println("input: " + input);
        System.out.println("is palindrome:" + result);
        System.out.println("execution time: " + executionTime + " ns");

        scanner.close();
    }
}