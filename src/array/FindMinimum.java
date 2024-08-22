package array;

public class FindMinimum {
  public static void main(String[] args) {
    int[] numbers = {5, 9, 3, 15, 1, 2};
    findMin(numbers);
  }

  private static void findMin(int[] numbers) {
    int min = numbers[0];
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] < min) {
        min = numbers[i];
      }
    }
    System.out.println(min);
  }

}
