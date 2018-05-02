package staticstuff;

class Y {
  static String sayHi() { return "static sayHi Y"; }
  String sayHi2() { return "say hi 2 Y"; }
}

class Z extends Y {
  static String sayHi() { return "static sayHi Z"; }
//  String sayHi() { return "static sayHi Z"; }
  @Override
  String sayHi2() { return "say hi 2 Z"; }
  String sayHi3() { return "say hi 3 Z"; }
}

class Z2 extends Y {
  @Override
  String sayHi2() { return "say hi 2 Z2"; }
}

public class Ex2 {
  public static void main(String[] args) {
    Y y = new Z();

    System.out.println("type of y thing is "
      + y.getClass().getName());
    // good style requires using the classname as the prefix for
    // invoking static methods, NOT a reference expression
    System.out.println("calling static Z.sayHi gives " + Z.sayHi());
    // static methods are invoked based on the TYPE OF THE REFERENCE (here, Y)
    System.out.println("calling static sayHi gives " + y.sayHi());
    // instance methods are invoked based on the the type of the object
    // that the reference refers to (here Z)
    System.out.println("calling sayHi2 gives " + y.sayHi2());

    System.out.println("----------------------");
    y = new Z2();
    System.out.println("calling sayHi2 gives " + y.sayHi2());
  }
}
