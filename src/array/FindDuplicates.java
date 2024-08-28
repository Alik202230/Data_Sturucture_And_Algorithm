package array;

public class FindDuplicates {
  public static void main(String[] args) {
    int[] numbers = {5, 4, 7, 4, 5, 8, 1, 4, 4, 4, 4, 4, 5, 5, 8};
    int[] temp = new int[numbers.length];
    int idx = 0;
    int count = 0;

    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[i] == numbers[j]) {
          boolean isExist = false;
          for (int x : temp) {
            if (x == numbers[i]) {
              isExist = true;
              break;
            }
          }
          if (!isExist) {
            count++;
            temp[idx++] = numbers[i];
            break;
          }
        }
      }
    }
    System.out.println(count);
  }
}
