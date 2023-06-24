// import java.util.Arrays;

public class Question_7 {
  public static void main(String[] args) {
    // 1 2 3 4
    // 4 3 2 1
    int arr[] = { 1,2,3,4,5,-1};
    System.out.println(isMonotonicInc_Dec(arr));
  }

  // method
  public static boolean isMonotonicInc_Dec(int[] arr) {
    // Arrays.sort(arr);
    boolean bol = false;
    // checking for monotonic increasing
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] <= arr[i + 1])
        bol = true;
      else {
        bol =  false;
        break;
      }
    }
    // checking for monotonic decreasing
    if (!bol) {
      for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] >= arr[i + 1])
          bol = true;
        else {
          bol = false;
          break;
        }
      }
    }
    return bol;
  }
}
