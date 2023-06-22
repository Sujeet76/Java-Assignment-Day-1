public class SumTarget{
  public static void main(String[] args) {
    int arr[] = {2,7,11,15};
    int target = 9;
    int[] ans = sumIndex(arr, target);
    for(int i =0; i< ans.length; i++){
      System.out.print(ans[i]+" ");
    }
    System.out.println();
  }

  // function
  public static int[] sumIndex(int[] arr, int target){
    int ans[] = {-1,-1};
    for(int i =0; i < arr.length; i++){
      for(int j = i+1; j < arr.length; j++){
        if(arr[i]+arr[j] == target) {
          ans[0] = i;
          ans[1] = j;
          return ans;
        }
      }
    }
    return ans;
  }
}