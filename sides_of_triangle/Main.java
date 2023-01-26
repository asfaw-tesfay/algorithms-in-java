package sides_of_triangle;

class Main {
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);

    if (valid_triangleV2(a, b, c))
      System.out.println("It is a valid triangle.");
    else
      System.out.println("Not a valid tirangle.");
  }

  static boolean valid_triangleV1 (int a, int b, int c) {
    return !(a >= (b + c) || b >= (a + c) || c >= (a + b));
  }

  static boolean valid_triangleV2 (int a, int b, int c) {
    if (a >= b && a >= c) return a < b + c;
    if (b >= a && b >= c) return b < a + c;
    return c < a + b;
  }
}
