public class Question_3 {
    public static void main(String[] args) {
        int[] arr = {0, 3, 2, 1};
        boolean isValidMountain = validMountainArray(arr);
        System.out.println("Is valid mountain array? " + isValidMountain);
    }

    public static boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 3) {
            return false;
        }

        int left = 0;
        int right = n - 1;

        while (left < n - 1 && arr[left] < arr[left + 1]) {
            left++;
        }

        while (right > 0 && arr[right] < arr[right - 1]) {
            right--;
        }

        return left > 0 && right < n - 1 && left == right;
    }
}
