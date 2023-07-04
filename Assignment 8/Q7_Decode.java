class Q7_Decode {
  // Driver code
  public static void main(String[] args) {
    String s = "3[a]2[bc]";
    System.out.println(decodeString(s));
  }


  // method
  private static String repeat(int f, String t) {
    String d = "";
    while (f-- > 0)
      d += t;
    return d;
  }

  public static boolean isNum(char s) {
    return (s >= '0' && s <= '9');
  }

  public static boolean isLetter(char s) {
    return (s >= 'a' && s <= 'z');
  }

  public static String decodeString(String s) {
    String d = "";
    int i = 0;
    while (i < s.length()) {
      while (i < s.length() && isLetter(s.charAt(i)))
        d += s.charAt(i++);
      String f = "";
      while (i < s.length() && isNum(s.charAt(i)))
        f += s.charAt(i++);

      if (f.isEmpty())
        f += "1";

      String t = "";
      if (i < s.length() && s.charAt(i) == '[') {

        int open = 0;
        int closing = -1;

        for (int j = i; j < s.length(); j++) {
          if (s.charAt(j) == '[')
            open++;
          else if (s.charAt(j) == ']')
            open--;
          if (open == 0) {
            closing = j;
            break;
          }
        }
        for (int j = i + 1; j < closing; j++)
          t += s.charAt(j);
        i = closing + 1;
      }
      d += repeat(Integer.valueOf(f), decodeString(t));
    }
    return d;
  }
}