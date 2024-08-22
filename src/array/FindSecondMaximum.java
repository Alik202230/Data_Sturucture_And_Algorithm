package array;

public class FindSecondMaximum {
  public static void main(String[] args) {
    int[] numbers = {12, 34, 2, 34, 33, 1};
    findSecondMaximum(numbers);
  }

  private static void findSecondMaximum(int[] nums) {
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        secondMax = max;
        max = nums[i];
      } else if (nums[i] > secondMax && nums[i] != max) {
        secondMax = nums[i];
      }
    }
    System.out.println(secondMax);
  }

}
