import java.util.HashSet;

public class Question_6 {
    public static void main(String[] args) {
        int[] changed = {1, 3, 4, 2, 6, 8};
        int[] original = recoverOriginalArray(changed);
        System.out.println("Original Array:");
        for (int num : original) {
            System.out.print(num + " ");
        }
    }

    public static int[] recoverOriginalArray(int[] changed) {
        HashSet<Integer> originalSet = new HashSet<>();

        for (int num : changed) {
            if (originalSet.contains(num / 2)) {
                originalSet.remove(num / 2);
            } else {
                originalSet.add(num);
            }
        }

        int[] original = new int[originalSet.size()];
        int index = 0;
        for (int num : originalSet) {
            original[index++] = num;
        }

        return original;
    }
}
