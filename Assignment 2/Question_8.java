public class Question_8 {
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
    int k = 4;
    System.out.println("Min score : "+minScoreAfterOperation(arr, k));
  }

  // METHOD
  public static int minScoreAfterOperation(int[] nums,int k) {
    int max, min;
    max = min = nums[0];
    // calculate min and max for given array
    for (int i = 0; i < nums.length; i++) {
      max = Math.max(max, nums[i]);
      min = Math.min(min, nums[i]);
    }
    int diff = (max - k) - (min + k);
    // if diff is greater then zero the return diff else return false
    return (diff > 0) ? diff : 0;
  }
}
