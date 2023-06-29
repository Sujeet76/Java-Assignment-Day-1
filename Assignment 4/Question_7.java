public class Question_7 {
  public static void main(String[] args) {
    int m = 3;
    int n = 3;
    int[][] ops = { { 2, 2 }, { 5, 9 } };
    int maxCount = maxCount(m, n, ops);
    System.out.println(maxCount);
  }

  public static int maxCount(int m, int n, int[][] ops) {
    int minRow = m;
    int minCol = n;

    for (int[] op : ops) {
      minRow = Math.min(minRow, op[0]);
      minCol = Math.min(minCol, op[1]);
    }

    return minRow * minCol;
  }
}
