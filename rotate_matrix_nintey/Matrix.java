package rotate_matrix_nintey;

class Matrix {
  static int[][] rotateNinteyV1(int[][] matrix) {
    int n = matrix.length;
    if (matrix.length == 0 || matrix[0].length != n)
      return null;
    for (int i = 0; i < n/2; i++) {
      for (int j = i; j < n-1-i; j++) {
        int left = matrix[j][i];
        // bottom to left
        matrix[j][i] = matrix[n-1-i][j];
        // right to bottom
        matrix[n-1-i][j] = matrix[n-1-j][n-1-i];
        //top to right
        matrix[n-1-j][n-1-i] = matrix[i][n-1-j];
        //left to top
        matrix[i][n-1-j] = left;
      }
    }
    return matrix;
  }
}
