import java.util.ArrayList;
import java.util.List;

public class Question_6 {
  public static void main(String[] args) {
    int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
    List<Integer> duplicates = findDuplicates(nums);
    System.out.println(duplicates);
  }

  public static List<Integer> findDuplicates(int[] nums) {
    List<Integer> result = new ArrayList<>();

    for (int num : nums) {
      int idx = Math.abs(num) - 1;
      if (nums[idx] > 0) {
        nums[idx] = -nums[idx];
      } else {
        result.add(idx + 1);
      }
    }

    return result;
  }
}
