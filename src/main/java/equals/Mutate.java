package equals;

public class Mutate {
  public static void main(String[] args) {
    String s = new String("Hello");
    StringBuilder sb = new StringBuilder("Hello");
    /*s = */s.concat("World");
    sb.append("World");
    System.out.println("s = " + s);
    System.out.println("sb = " + sb);
    // A) Hello, Hello
    // B) HelloWorld, HelloWorld
    // C) Hello, HelloWorld
    // D) HelloWorld, Hello

  }
}
