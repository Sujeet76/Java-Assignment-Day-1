import java.util.ArrayList;
import java.util.List;

public class Question_7 {
  public static void main(String[] args) {
    int[] nums = { 0, 1, 3, 50, 75 };
    int lower = 0;
    int upper = 99;
    List<String> missingRanges = findMissingRanges(nums, lower, upper);
    for (String range : missingRanges) {
      System.out.println(range);
    }
  }

  public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
    List<String> ranges = new ArrayList<>();
    int next = lower;
    for (int num : nums) {
      if (num > next) {
        ranges.add(getRange(next, num - 1));
      }
      next = num + 1;
    }
    if (next <= upper) {
      ranges.add(getRange(next, upper));
    }
    return ranges;
  }
  private static String getRange(int start, int end) {
    return (start == end) ? String.valueOf(start) : start + "->" + end;
  }
}
