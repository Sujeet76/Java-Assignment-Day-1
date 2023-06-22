public class FindElement {
  public static void main(String[] args) {
    int arr[] = { 1, 3, 5, 6 };
    int target = 7;
    int result[] = binarySearch(arr, target);
    if(result[0] == 0){
      System.out.println("Element is found at "+ result[1]);
    }else{
      System.out.println("Element is not found but can be inserted at position : "+ result[1]);
    }

  }

  // function
  public static int[] binarySearch(int[] arr, int target) {
    int low = 0;
    int heigh = arr.length - 1;
    int mid = -1;
    int result[] = { -1, -1 };
    while (low <= heigh) {
      mid = low + (heigh - low) / 2;
      if (arr[mid] == target) {
        result[0] = 0;
        result[1] = mid;
        return result;
      } else if (arr[mid] < target) {
        low = mid + 1;
        result[1] = mid + 1;
      } else {
        heigh = mid - 1;
        result[1] = mid;
      }
    }
    return result;
  }
}
