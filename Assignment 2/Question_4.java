public class Question_4 {
  public static void main(String[] args) {
    int flowerbed[] = { 1, 0, 0, 0, 1, 0, 0 };
    int n = 2;
    System.out.println(canPlaceFlower(flowerbed, n));
  }

  // function
  public static boolean canPlaceFlower(int[] flowerbed, int n) {
    int length = flowerbed.length;
    if(n == 0) return true;
    // first select the position where we want to plant the flower if it is empty then
    // check its right and left space (adjacent space) is empty if it is the plant the flower 
    for (int i = 0; i < length; i++) {
      if (flowerbed[i] == 0) {
        // check left is empty or right is empty
        if ((i == 0 || flowerbed[i - 1] == 0) && (i == length - 1 || flowerbed[i + 1] == 0)) {
          flowerbed[i] = 1;
          n--;
        }
      }
      if (n == 0)
        return true;
    }
    return false;
  }
}
