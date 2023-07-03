public class Shift_Q6 {
    public static void main(String[] args){
        String s = "abcde", goal = "cdeab";
        System.out.println(canShift(s,goal));
    }

    public static boolean canShift(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        
        String doubleS = s + s;
        
        return doubleS.contains(goal);
    }
}
