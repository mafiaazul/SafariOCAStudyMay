package equals;

public class Ex4 {
  public static void main(String[] args) {
    Object s1 = new StringBuilder("Hello");
    Object s2 = new StringBuilder("Hello");
    System.out.println("s1 == s2 " + (s1 == s2));
    System.out.println("s1.equals(s2) " + s1.equals(s2));
  }
}
