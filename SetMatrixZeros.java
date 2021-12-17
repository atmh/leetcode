/*

class Solution {
  public void setZeroes(int[][] matrix) {
    int r = matrix.length;
    int c = matrix[0].length;
    boolean first = false;

    // scan first row for zeros
    for (int i = 0; i < c; i++) { 
      if (matrix[0][i] == 0) {
        first = true;
        break;
      }
    }

    // use first row and column as marker
    for (int i = 1; i < r; i++) {
      for (int j = 0; j < c; j++) {
        if (matrix[i][j] == 0) {
          matrix[0][j] = matrix[i][0] = 0;
        }
      }
    }

    for (int i = r-1; i > 0; i--) {
      for (int j = c-1; j >= 0; j--) {
        if (matrix[0][j] == 0 || matrix[i][0] == 0) {
          matrix[i][j] = 0;
        }
      }
    }

    if (first) Arrays.fill(matrix[0], 0);
  }
}

*/