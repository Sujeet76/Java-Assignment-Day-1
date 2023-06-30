import Utils.InputOutput;

public class Question_1 {
  public static void main(String[] args) {
    int[] original = { 1, 2, 3, 4 };
    int m = 2;
    int n = 2;
    int[][] result = construct2DArray(original, m, n);
    InputOutput.printMatrix(result);
  }

  // method
  public static int[][] construct2DArray(int[] original, int m, int n) {
    int len = original.length;
    if (len != m * n) {
      return new int[0][0];
    }
    int[][] result = new int[m][n];
    int row = 0;
    int col = 0;
    for (int num : original) {
      result[row][col] = num;
      col++;
      if (col == n) {
        col = 0;
        row++;
      }
    }
    return result;
  }
}
