import java.util.HashSet;
import java.util.Set;

public class Question_2 {
  public static void main(String[] args) {
    int[] nums1 = { 1, 2, 3 };
    int[] nums2 = { 2, 4, 6 };
    int[][] result = findDistinctIntegers(nums1, nums2);
    for (int[] arr : result) {
      System.out.print("[");
      for (int num : arr) {
        System.out.print(num + " ");
      }
      System.out.print("]");
    }
  }

  public static int[][] findDistinctIntegers(int[] nums1, int[] nums2) {
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();

    for (int num : nums1) {
      set1.add(num);
    }

    for (int num : nums2) {
      set2.add(num);
    }

    Set<Integer> uniqueInNums1 = new HashSet<>(set1);
    uniqueInNums1.removeAll(set2);

    Set<Integer> uniqueInNums2 = new HashSet<>(set2);
    uniqueInNums2.removeAll(set1);

    int[][] result = new int[2][];
    result[0] = toArray(uniqueInNums1);
    result[1] = toArray(uniqueInNums2);

    return result;
  }

  public static int[] toArray(Set<Integer> set) {
    int[] arr = new int[set.size()];
    int i = 0;

    for (int num : set) {
      arr[i] = num;
      i++;
    }

    return arr;
  }
}
