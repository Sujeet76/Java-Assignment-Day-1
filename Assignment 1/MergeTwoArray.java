public class MergeTwoArray {
  public static void main(String[] args) {
    // UtilityClass cls = new UtilityClass();
    int num1[] = {1,2,3,0,0,0};
    int num2[] = {2,5,6};
    int m = 3;
    int n = 3;
    merge(num1, num2, m, n);
    System.out.println("output");
    UtilityClass.print(num1, m+n);
  }

  // merge array function
  public static void merge(int[] num1, int[] num2, int m, int n) {
    int copyNumOnly[] = new int[m];
    for (int i = 0; i < m; i++) {
      copyNumOnly[i] = num1[i];
    }
    int i = 0, j = 0, k = 0;
    while (i < m && j < n) {
      if (copyNumOnly[i] <= num2[j])
        num1[k] = copyNumOnly[i++];
      else
        num1[k] = num2[j++];
      k++;
    }
    while (i < m) {
      num1[k++] = copyNumOnly[i++];
    }
    while (j < n) {
      num1[k++] = num2[j++];
    }
  }
}
