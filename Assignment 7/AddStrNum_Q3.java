public class AddStrNum_Q3 {
  public static void main(String[] args) {
    String num1 = "45";
    String num2 = "123";
    System.out.println(addStrings(num1, num2));
  }

  public static String addStrings(String num1, String num2) {
    StringBuilder result = new StringBuilder();
    int carry = 0;
    int i = num1.length() - 1;
    int j = num2.length() - 1;
    while (i >= 0 || j >= 0 || carry > 0) {
      int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
      int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;
      int sum = digit1 + digit2 + carry;
      result.append(sum % 10);
      carry = sum / 10;
      i--;
      j--;
    }
    return result.reverse().toString();
  }
}
