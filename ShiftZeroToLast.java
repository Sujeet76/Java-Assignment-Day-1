public class ShiftZeroToLast {
  public static void main(String[] args) {
    int[] arr = { 0, 1, 0, 3, 12 };
    shiftZero(arr);
    System.out.println("output");
    UtilityClass.print(arr, arr.length);
  }

  // function
  public static void shiftZero(int[] arr) {
    int length = arr.length;
    for (int i = 0; i < length; i++) {
      if (arr[i] == 0) {
        int j = i;
        while (j < length - 1) {
          arr[j] = arr[j + 1];
          j++;
        }
        arr[j] = 0;
        length--;
      }
    }
  }
}
