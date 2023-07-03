public class Question_8 {
  public static void main(String[] args) {
    // [1,2],[2,3],[3,4],[4,5],[5,6],[6,7]
    // [1,1],[2,2],[3,4],[4,5],[5,6],[7,7]
    // [[0,0],[0,1],[0,-1]]
    int c[][] = {
        { 0, 0 },
        { 0, 1 },
        { 0, -1 }
    };
    System.out.println(isStraightLine(c));
  }

  // function 
  public static boolean isStraightLine(int[][] coordinates) {
    int x1, y1, x2, y2;
    x1 = coordinates[0][0];
    y1 = coordinates[0][1];
    x2 = coordinates[1][0];
    y2 = coordinates[1][1];
    /*
     * using straight line formula 
     * y – y1 = m(x – x1 )
     */
    for (int i = 2; i < coordinates.length; i++)
    {
      int x3 = coordinates[i][0]; 
      int y3 = coordinates[i][1];
      if (((y2 - y1) * (x3 - x2)) != ((y3 - y2) * (x2 - x1)))
        return false;
    }
    return true;
  }
}
