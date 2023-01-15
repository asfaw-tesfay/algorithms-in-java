package rotate_matrix_nintey;

import java.util.concurrent.TimeUnit;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    int[][] matrix = {
      {1,2,3,4,5,6,7,8},
      {9,10,11,12,13,14,15,16},
      {17,18,19,20,21,22,23,24},
      {25,26,27,28,29,30,31,32},
      {33,34,35,36,37,38,39,40},
      {41,42,43,44,45,46,47,48},
      {49,50,51,52,53,54,55,56},
      {57,58,59,60,61,62,63,64}
    };

    // int[][] matrix = {
    //   {1,2,3,4},
    //   {5,6,7,8},
    //   {9,10,11,12},
    //   {13,14,15,16}
    // };

    long time1 = System.nanoTime();
    int[][] rotated = Matrix.rotateNinteyV1(matrix);
    long elapsed = System.nanoTime() - time1;
    for (int i = 0; i < matrix.length; i++)
      System.out.println(Arrays.toString(rotated[i]));
    displayExecutionTime(elapsed);
  }

  static void displayExecutionTime(long elapsed) {
    System.out.println("Execution time: " + elapsed + " ns(" +
              TimeUnit.MILLISECONDS.convert(elapsed, TimeUnit.NANOSECONDS) + " ms)");
  }
}
