public class Q1_SumAscii {
  public static void main(String[] args) {
    String s1 = "sea";
    String s2 = "eat";
    int result = minimumDeleteSum(s1, s2);
    System.out.println("Lowest ASCII sum of deleted characters: " + result);
  }

  // method
  public static int minimumDeleteSum(String s1, String s2) {
    return minimumDeleteSumHelper(s1, s2, 0, 0);
  }

  private static int minimumDeleteSumHelper(String s1, String s2, int i, int j) {
    if (i == s1.length() && j == s2.length())
      return 0;

    if (i == s1.length()) {
      int sum = 0;
      for (; j < s2.length(); j++)
        sum += s2.charAt(j);
      return sum;
    }

    if (j == s2.length()) {
      int sum = 0;
      for (; i < s1.length(); i++)
        sum += s1.charAt(i);
      return sum;
    }

    if (s1.charAt(i) == s2.charAt(j)) {
      return minimumDeleteSumHelper(s1, s2, i + 1, j + 1);
    } else {
      int option1 = s1.charAt(i) + minimumDeleteSumHelper(s1, s2, i + 1, j);
      int option2 = s2.charAt(j) + minimumDeleteSumHelper(s1, s2, i, j + 1);
      return Math.min(option1, option2);
    }
  }
}
