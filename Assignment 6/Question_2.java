public class Question_2 {
  public static void main(String[] args) {
    int[][] mat = {
        { 1, 3, 5, 7 },
        { 10, 11, 16, 20 },
        { 23, 30, 34, 60 }
    };
    System.out.println(searchInMatrix(mat, 66));
  }

  // method
  public static boolean searchInMatrix(int[][] matrix, int target) {
    // int[] helperArray = new int[matrix.length + matrix[0].length];
    // // copy matrix in helper array
    // for (int i = 0; i < matrix.length; i++) {
    // for (int j = 0; j < matrix[0].length; j++) {
    // helperArray[i] = matrix[i][j];
    // }
    // }

    // // binary search
    // int low = 0;
    // int high = helperArray.length - 1;
    // while (low < high) {
    // int mid = low + (high - low) / 2;
    // if (helperArray[mid] == target)
    // return helperArray[mid];
    // if (helperArray[mid] < target)
    // high = mid - 1;
    // else
    // low = mid + 1;
    int low = 0;
    int high = matrix.length * matrix[0].length;
    // int length =
    int row, col;
    while (low < high) {
      int mid = low + (high - low) / 2;
      row = mid % matrix.length;
      col = mid / matrix[0].length;
      if (matrix[row][col] == target)
        return true;
      if (matrix[row][col] < target)
        high = mid - 1;
      else
        low = mid + 1;
    }
    return false;
  }
}
