package array;

public class RemoveFromArray {
  public static void main(String[] args) {
    int[] arr = {3,2,4,7,10,6,5};
    int oddCount = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 != 0) {
        oddCount++;
      }
    }

    int[] oddArr = new int[oddCount];
    int index = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 != 0) {
        oddArr[index++] = arr[i];
      }
    }
  }
}
