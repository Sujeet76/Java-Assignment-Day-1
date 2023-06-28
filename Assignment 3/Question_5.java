import Utils.UtilityMethods;

public class Question_5 {
  public static void main(String[] args) {
    int arr[] = {};
    // [9,8,7,6,5,4,3,2,1,0]

    int result[] = incrementByOne(arr);
    UtilityMethods.print(result, result.length);
  }

  // function
  public static int[] incrementByOne(int[] arr) {
    arr[arr.length - 1] += 1;
    if (arr[arr.length - 1] >= 10) {
      for (int i = arr.length - 1; i >= 1; i--) {
        if (arr[i] >= 10) {
          arr[i] = 0;
          arr[i - 1]++;
        } else
          break;
      }
    }
    if (arr[0] >= 10) {
      int newArray[] = new int[arr.length + 1];
      System.arraycopy(arr, 0, newArray, 1, arr.length);
      newArray[0] = 1;
      newArray[1] = 0;
      return newArray;
    } else {
      return arr;
    }
  }
}