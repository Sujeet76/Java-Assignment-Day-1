import java.util.HashSet;

public class Question_2 {
  // driver method
  public static void main(String[] args) {
    int arr[] = {1,1,2,3};
    System.out.println(typeOfCandy(arr));
  }

  // method
  public static int typeOfCandy(int[] nums){
    // finding total unique candy
    HashSet<Integer> set = new HashSet<>();
    for(int type : nums){
      set.add(type);
    }
    return Math.min(set.size(),nums.length/2);
  }
}
