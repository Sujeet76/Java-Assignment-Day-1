

public class Question_6 {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 4, 1, 2 };
    System.out.println(singleNumber(arr));

  }

  // function
  public static int singleNumber(int[] nums) {
    int ans = 0;
    for (int i = 0; i < nums.length; i++) {
      ans ^= nums[i];
    }
    return ans;
  }
}
