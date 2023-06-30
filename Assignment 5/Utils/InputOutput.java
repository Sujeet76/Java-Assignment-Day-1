package Utils;

import java.util.Scanner;

public class InputOutput {
  // print element of array
  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  // print element of matrix
  public static void printMatrix(int[][] mat) {
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        System.out.print(mat[i][j] + " ");
      }
      System.out.println();
    }
  }

  // swap two element
  public static void swap(int num1, int num2) {
    int temp = num1;
    num2 = num1;
    num1 = temp;
  }

  // take input of in array
  @SuppressWarnings("unchecked")
  public static <T> void input(T[] arr, int length) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < length; i++) {
      arr[i] = (T) sc.next();
    }
    System.out.println();
    sc.close();
  }

  // take input in matrix
  @SuppressWarnings("unchecked")
  public static <T> void inputMatrix(T[][] mat) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        mat[i][j] = (T) sc.next();
      }
    }
    System.out.println();
    sc.close();
  }

}
