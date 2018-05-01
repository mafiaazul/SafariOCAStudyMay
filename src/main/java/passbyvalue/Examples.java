package passbyvalue;

public class Examples {
  public static void q12A(StringBuilder x) {
    x.append(" world");
  }
  public static void q14A(Integer x) {
    x = x + 1;
  }
  public static void q13A(int[] x) {
    x[0] = x[0] + 1;
  }

  public static void main(String[] args) {
    StringBuilder x = new StringBuilder("Hello");
    q12A(x);
    System.out.println("StringBuilder after call " + x);

    Integer x1 = 99;
    q14A(x1);
    System.out.println("Integer after call " + x1);

    int x2[] = {99};
    q13A(x2);
    System.out.println("array element after call " + x2[0]);
  }
}
