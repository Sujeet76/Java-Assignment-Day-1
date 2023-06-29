import Utils.UtilityFunction;

public class Question_3 {
  public static void main(String[] args) {
    int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int[][] transpose = transposeMatrix(matrix);
    UtilityFunction.printMatrix(transpose);
  }

  public static int[][] transposeMatrix(int[][] matrix) {
    int rows = matrix.length;
    int columns = matrix[0].length;
    int[][] transpose = new int[columns][rows];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        transpose[j][i] = matrix[i][j];
      }
    }
    return transpose;
  }
}
