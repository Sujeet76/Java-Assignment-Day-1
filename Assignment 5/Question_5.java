public class Question_5 {
  public static void main(String[] args) {
    int[] arr1 = { 4, 5, 8 };
    int[] arr2 = { 10, 9, 1, 8 };
    int d = 2;
    int distance = calculateDistanceValue(arr1, arr2, d);
    System.out.println(distance);
  }

  public static int calculateDistanceValue(int[] arr1, int[] arr2, int d) {
    int distance = 0;

    for (int num1 : arr1) {
      boolean isValid = true;

      for (int num2 : arr2) {
        if (Math.abs(num1 - num2) <= d) {
          isValid = false;
          break;
        }
      }

      if (isValid) {
        distance++;
      }
    }

    return distance;
  }
}
