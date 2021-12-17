class Solution {
  public int longestCommonSubsequence(String text1, String text2) {
    int n = text1.length(), m = text2.length();
    int[][] matrix = new int[n+1][m+1];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (text1.charAt(i) == text2.charAt(j)) {
          matrix[i+1][j+1] = matrix[i][j] + 1;
        } else {
          matrix[i+1][j+1] = Math.max(matrix[i+1][j], matrix[i][j+1]);
        }
      }
    }
    return matrix[n][m];
  }
}