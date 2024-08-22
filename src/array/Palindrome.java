package array;

public class Palindrome {
  public static void main(String[] args) {
    String input = "anna";
    boolean isPalindrome = isPalindrome(input);
    if (isPalindrome) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not a palindrome");
    }
  }

  private static boolean isPalindrome(String str) {
    int firs = 0;
    int second = str.length() - 1;

    while (firs < second) {
      if (str.charAt(firs) == str.charAt(second)) {
        firs++;
        second--;
      } else {
        return false;
      }
    }
    return true;
  }

}
