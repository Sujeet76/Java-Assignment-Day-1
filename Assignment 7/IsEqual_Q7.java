public class IsEqual_Q7 {
  public static void main(String[] args) {
    String s1 = "y#fo##f";
    String s2 = "y#f#o##f";
    System.out.println(isEqual(s1, s2));
  }

  // function
  public static boolean isEqual(String s1, String s2) {
    // check string
    s1 = reStructureString(s1);
    s2 = reStructureString(s2);
    System.out.println(s1 + " " + s2);
    if (s1.equals(s2)) {
      return true;
    } else {
      return false;
    }

  }

  private static String reStructureString(String s1) {
    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(0) == '#') {
        s1 = s1.substring(1);
      } else if (s1.charAt(i) == '#' && i >= 1) {
        s1 = s1.substring(0, i - 1) + s1.substring(i + 1);
        i -= 2;
      }
    }
    return s1;
  }
}
