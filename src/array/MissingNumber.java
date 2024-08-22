package array;

import java.util.Arrays;

public class MissingNumber {
  public static void main(String[] args) {
    int[] numbers = {2, 4, 1, 8, 6, 3, 7};
    findMissingNumber(numbers);
  }

  private static void findMissingNumber(int[] nums) {
    int n = nums.length + 1;
    int sum = n * (n + 1) / 2;
    for (int num : nums) {
      sum -= num;
    }

    System.out.println("The missing number is: " + sum);
  }

}
