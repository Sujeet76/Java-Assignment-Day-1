public class Q2_ValidParenthesis {
  public static void main(String[] args) {
    String s = "()";
    boolean isValid = checkValidString(s);
    System.out.println("Is valid: " + isValid);
  }

  public static boolean checkValidString(String s) {
    return checkValidStringHelper(s, 0, 0);
  }
  private static boolean checkValidStringHelper(String s, int index, int balance) {
    if (index == s.length()) {
      return balance == 0;
    }
    char c = s.charAt(index);
    if (c == '(' || c == '*') {
      if (checkValidStringHelper(s, index + 1, balance + 1)) {
        return true;
      }
    }

    if (c == ')' || c == '*') {
      if (balance > 0 && checkValidStringHelper(s, index + 1, balance - 1)) {
        return true;
      }
    }

    if (checkValidStringHelper(s, index + 1, balance)) {
      return true;
    }

    return false;
  }
}
