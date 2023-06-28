package Utils;
import java.util.Scanner;

public class UtilityMethods {
  public static void print(int[] arr, int length){
    for(int i = 0; i < length; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  
  @SuppressWarnings("unchecked")
  public static <T> void input(T[] arr, int length) {
    Scanner sc = new Scanner(System.in);
    for(int i = 0; i < length; i++){
      arr[i] = (T) sc.next();
    }
    System.out.println();
    sc.close();
  }
}
