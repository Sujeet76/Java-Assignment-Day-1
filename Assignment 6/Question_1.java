import java.util.Arrays;

public class Question_1 {
  public static void main(String[] args) {
    String str = "IDID";
    int[] prem = reconstructArr(str);
    System.out.println(Arrays.toString(prem));
  }

  // method
  public static int[] reconstructArr(String str) {
    int result[] = new int[str.length() + 1];
    int low = 0;
    int high = str.length();
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'I') {
        result[i] = low;
        low++;
      } else {
        result[i] = high;
        high--;
      }
    }
    result[str.length()] = low;
    return result;
  }
}
