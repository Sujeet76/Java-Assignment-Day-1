import java.util.HashMap;
import java.util.Map;

public class Question_4 {
    public static void main(String[] args) {
        int[] nums = {0, 1};
        int maxLength = findMaxLength(nums);
        System.out.println("Maximum length of contiguous subarray: " + maxLength);
    }

    public static int findMaxLength(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, -1);

        int count = 0;
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            count += nums[i] == 1 ? 1 : -1;

            if (countMap.containsKey(count)) {
                int prevIndex = countMap.get(count);
                int currLength = i - prevIndex;
                maxLength = Math.max(maxLength, currLength);
            } else {
                countMap.put(count, i);
            }
        }

        return maxLength;
    }
}
