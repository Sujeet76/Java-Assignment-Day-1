import java.util.ArrayList;
import java.util.Collections;

public class IncrementInteger {
  public static void main(String[] args) {
    int arr[] = { 8 };
    int result[] = incrementByOne(arr);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i]+" ");
    }
    System.out.println();
  }

  // function
  public static int[] incrementByOne(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i] * Math.pow(10, arr.length - i - 1);
    }
    sum+=1;
    ArrayList<Integer> result = new ArrayList<>();
    while(sum != 0){
      result.add(sum%10);
      sum = sum/10;
    }
    Collections.reverse(result);
    return result.stream().mapToInt(Integer::intValue).toArray();
  }
}
