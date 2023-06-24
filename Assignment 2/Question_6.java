public class Question_6 {
  public static void main(String[] args) {
    int nums[] = { -1, 0, 3, 5, 9, 12 };
    int target = 9;
    System.out.println(FindNumber(nums, target, 0, nums.length));
  }

  // function
  // function to find target whose time complexity is log(n) for given sorted array
  public static int FindNumber(int nums[], int target, int low, int high) {
    if (low > high) {
      return -1;
    }

    int mid = low + (high - low) / 2;

    if (nums[mid] == target) {
      return mid;
    } else if (nums[mid] > target) {
      return FindNumber(nums, target, low, mid - 1);
    } else {
      return FindNumber(nums, target, mid + 1, high);
    }
  }
}
