import java.util.Arrays;

public class Question_8 {
  public static void main(String[] args) {
    int[][] intervals = { { 0, 30 }, { 5, 10 }, { 15, 20 } };
    boolean canAttendAllMeetings = canAttendMeetings(intervals);
    System.out.println(canAttendAllMeetings);
  }

  public static boolean canAttendMeetings(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
    for (int i = 1; i < intervals.length; i++) {
      if (intervals[i][0] < intervals[i - 1][1]) {
        return false;
      }
    }
    return true;
  }

}
