public class FindErrorNumber {
  public static void main(String[] args) {
    int arr[] = { 1, 1, 3, 4 };
    System.out.println("output");
    UtilityClass.print(findError(arr), 2);
  }

  // function
  public static int[] findError(int[] arr) {
    int res[] = { -1, -1 };
    int sum = 0;
    int length = arr.length;
    for (int i = 0; i < length - 1; i++) {
      sum += arr[i];
      if (arr[i] == arr[i + 1]) {
        res[0] = arr[i];
      }
    }
    sum += arr[length - 1];
    if (res[0] != -1) {
      int missingNumber = res[0] + ((length * (length + 1)) / 2 - sum);
      res[1] = missingNumber;
    }
    return res;
  }
}
