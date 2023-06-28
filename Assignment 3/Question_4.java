public class Question_4 {
  public static void main(String[] args) {
    int arr[] = { 1, 3, 6,7 };
    System.out.println(findElementOrExp_pos(arr, 5));
  }

  // function
  public static int findElementOrExp_pos(int[] arr, int target) {
    int low = 0;
    int high = arr.length - 1;
    int res = -1;
    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (arr[mid] == target) {
        res = mid;
        return res;
      }

      if (arr[mid] < target) {
        res = mid + 1;
        low = mid + 1;
      } else {
        res = mid;
        high = mid - 1;
      }
    }
    return res;
  }
}
