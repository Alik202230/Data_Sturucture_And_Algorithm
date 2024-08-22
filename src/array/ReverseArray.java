package array;

public class ReverseArray {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    reverseArray(numbers, 0, numbers.length - 1);
    printArray(numbers);
  }

  private static void printArray(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
  }

  private static void reverseArray(int[] arr, int start, int end) {
    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

}
