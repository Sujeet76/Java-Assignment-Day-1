import java.util.Arrays;

public class Question_5 {
  // driver code
  public static void main(String[] args) {
    // example :- 1 2 3 4 5
    int arr[] = { -100, -98, -1, 2, 3, 4 };
    System.out.println("max " + LargestSumProblem(arr));
  }

  // method
  public static int LargestSumProblem(int[] nums) {
    // sort the array to get the largest element in order
    Arrays.sort(nums);
    int length = nums.length;
    // get product of last three element of array
    int max1 = nums[length - 1] * nums[length - 2] * nums[length - 3];
    // In case nums also contains negative element then take two element from binging and last element from last
    int max2 = nums[length - 1] * nums[0] * nums[1];
    // return max element
    return Math.max(max1, max2);
  }
}
