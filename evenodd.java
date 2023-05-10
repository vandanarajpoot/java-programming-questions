import java.util.*;

public class EvenOdd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = 10;
    while (a != 0) {
      System.out.println("Enter number");
      a = sc.nextInt();
      if (a % 2 == 0) {
        System.out.println("number is even");
      } else {
        System.out.println("number is odd");
      }
    }
  }
}