import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question_8 {
  public static void main(String[] args) {
    int[] changed = { 1, 3, 4, 2, 6, 8 };
    int[] original = recoverArray(changed);
    if (original.length == 0) {
      System.out.println("Empty array");
    } else {
      for (int num : original) {
        System.out.print(num + " ");
      }
    }
  }

  public static int[] recoverArray(int[] changed) {
    Map<Integer, Integer> freqMap = new HashMap<>();
    for (int num : changed) {
      freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
    }
    for (int num : changed) {
      int freq = freqMap.get(num);
      if (freq % 2 != 0) {
        return new int[0];
      }
    }
    List<Integer> originalList = new ArrayList<>();
    for (int num : changed) {
      originalList.add(num / 2);
    }
    int[] original = new int[originalList.size()];
    for (int i = 0; i < originalList.size(); i++) {
      original[i] = originalList.get(i);
    }
    return original;
  }
}
