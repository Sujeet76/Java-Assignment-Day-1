public class Q3_MinStep {

    public static void main(String[] args) {
        String word1 = "sea";
        String word2 = "eat";

        int minSteps = minDistance(word1, word2);
        System.out.println("Minimum steps: " + minSteps);
    }

    public static int minDistance(String word1, String word2) {
        return minDistanceHelper(word1, word2, word1.length(), word2.length());
    }
    private static int minDistanceHelper(String word1, String word2, int m, int n) {
        // Base cases
        if (m == 0) {
            return n;
        }
        if (n == 0) {
            return m;
        }
        // If the last characters of both words match
        if (word1.charAt(m - 1) == word2.charAt(n - 1)) {
            return minDistanceHelper(word1, word2, m - 1, n - 1);
        }
        // If the last characters are different
        int deleteFromWord1 = minDistanceHelper(word1, word2, m - 1, n) + 1; // Delete character from word1
        int deleteFromWord2 = minDistanceHelper(word1, word2, m, n - 1) + 1; // Delete character from word2

        return Math.min(deleteFromWord1, deleteFromWord2);
    }
}
