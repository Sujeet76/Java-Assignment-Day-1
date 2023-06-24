import java.util.Arrays;

public class Question_1 {
  public static void main(String[] args) {
    int arr[] = {6,2,6,5,1,2};
    System.out.println(findMaxPairElement(arr));
  }

  // methods
  public static int findMaxPairElement(int[] nums) {
    // sorting the element
    // it reduces the difference min
    Arrays.sort(nums);
    int max = 0;
    // selecting the adjacent element
    for (int i = 0; i < nums.length; i+=2) {
      max+=Math.min(nums[i], nums[i+1]);
    }
    return max;
  }
}