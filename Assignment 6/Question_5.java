import java.util.Arrays;

public class Question_5 {
    public static void main(String[] args) {
        int[] nums1 = {5, 3, 4, 2};
        int[] nums2 = {4, 2, 2, 5};
        int minProductSum = minimumProductSum(nums1, nums2);
        System.out.println("Minimum Product Sum: " + minProductSum);
    }

    public static int minimumProductSum(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int minProductSum = 0;
        int n = nums1.length;

        for (int i = 0; i < n; i++) {
            minProductSum += nums1[i] * nums2[n - 1 - i];
        }

        return minProductSum;
    }
}
