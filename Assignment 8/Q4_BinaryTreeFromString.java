class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int val) {
    this.val = val;
  }
}

public class Q4_BinaryTreeFromString {
  public static void main(String[] args) {
    String s = "4(2(3)(1))(6(5))";
    TreeNode root = str2tree(s);

    System.out.print("In-order traversal: ");
    inOrderTraversal(root);
  }

  private static int index;

  public static TreeNode str2tree(String s) {
    index = 0;
    return constructTree(s);
  }

  private static TreeNode constructTree(String s) {
    if (index >= s.length()) {
      return null;
    }
    int start = index;
    while (index < s.length() && (Character.isDigit(s.charAt(index)) || s.charAt(index) == '-')) {
      index++;
    }
    int value = Integer.parseInt(s.substring(start, index));
    TreeNode node = new TreeNode(value);
    if (index < s.length() && s.charAt(index) == '(') {
      index++;
      node.left = constructTree(s);
      index++;
    }
    if (index < s.length() && s.charAt(index) == '(') {
      index++; // Move past the opening parenthesis
      node.right = constructTree(s);
      index++; // Move past the closing parenthesis
    }
    return node;
  }

  public static void inOrderTraversal(TreeNode root) {
    if (root == null) {
      return;
    }
    inOrderTraversal(root.left);
    System.out.print(root.val + " ");
    inOrderTraversal(root.right);
  }
}
