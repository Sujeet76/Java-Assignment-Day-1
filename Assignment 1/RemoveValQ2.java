public class RemoveValQ2 {
  public static void main(String[] args) {
    // 3,2,2,3
    int arr[] = { 3, 2, 2, 3 };
    int length = countElementExceptTarget(arr, 3);
    System.out.println("Number of element except target are : "+length);
    for (int i = 0; i < length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  // function
  public static int countElementExceptTarget(int[] arr, int target) {
    // int count = 0;
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      if (arr[i] == target) {
        for (int j = i; j < n - 1; j++) {
          int temp = arr[j + 1];
          arr[j + 1] = arr[j];
          arr[j] = temp;
        }
        n--;
      }
    }
    return n;
  }
}