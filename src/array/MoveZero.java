package array;

import java.util.Arrays;

public class MoveZero {
  public static void main(String[] args) {
    int[] numbers = {8, 1, 0, 2, 1, 0, 3};
    moveZeroes(numbers);
  }

  private static void moveZeroes(int[] nums) {
    int j = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0 && nums[j] == 0) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
      }
      if (nums[j] != 0) j++;
    }
    System.out.println(Arrays.toString(nums));
  }


}
