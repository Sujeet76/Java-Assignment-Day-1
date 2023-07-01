public class Question_7 {
  public static void main(String[] args) {
    int n = 3;
    int[][] matrix = generateMatrix(n);
    System.out.println("Spiral Matrix:");
    printMatrix(matrix);
  }

  public static int[][] generateMatrix(int n) {
    int[][] matrix = new int[n][n];
    int left = 0, right = n - 1, top = 0, bottom = n - 1;
    int num = 1;

    while (num <= n * n) {
      // Fill top row
      for (int i = left; i <= right; i++) {
        matrix[top][i] = num++;
      }
      top++;

      // Fill rightmost column
      for (int i = top; i <= bottom; i++) {
        matrix[i][right] = num++;
      }
      right--;

      // Fill bottom row
      for (int i = right; i >= left; i--) {
        matrix[bottom][i] = num++;
      }
      bottom--;

      // Fill leftmost column
      for (int i = bottom; i >= top; i--) {
        matrix[i][left] = num++;
      }
      left++;
    }

    return matrix;
  }

  public static void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
      for (int num : row) {
        System.out.print(num + " ");
      }
      System.out.println();
    }
  }
}
