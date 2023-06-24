
/**
 * Question 3
 * We define a harmonious array as an array where the difference between its maximum value
 * and its minimum value is exactly 1.
 * Given an integer array nums, return the length of its longest harmonious subsequence
 * among all its possible subsequences.
 * A subsequence of an array is a sequence that can be derived from the array by  deleting some or no elements without changing the order of the remaining elements.
 */

import java.util.HashMap;

public class Question_3 {

  public static void main(String[] args) {
    int nums[] = { 1, 3, 2, 2, 5, 2, 3, 7 };
    System.out.println(LHSCount(nums));
  }

  // function
  // need to find the max length of har
  public static int LHSCount(int[] nums) {
    int result = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    // CALCULATING THE FREQUENCY OF EACH ELEMENT IN THE GIVEN ARRAY
    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    // now checking the difference ( = 1 ) 
    // by using the strategy if we have key then there must a element in HashMap exactly greater the key+1 when means its difference is one(1)
    // if key +1 element exits then we add the frequency of both element and sort it into result
    for (int key : map.keySet()) {
      if (map.containsKey(key + 1)) {
        result = Math.max(result, map.get(key) + map.get(key + 1));
      }
    }
    return result;
  }
}
