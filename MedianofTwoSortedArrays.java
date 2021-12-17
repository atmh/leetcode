class Solution {
  public double findMedianSortedArrays(int[] A, int[] B) {
    int m = A.length;
    int n = B.length;
    if (m > n) return findMedianSortedArrays(B, A);
    
    int imin = 0, imax = A.length;
    while (imin <= imax) {
      int i = (imin + imax)/2;
      int j = (m + n + 1)/2 - i;

      int A_left = i == 0 ? Integer.MIN_VALUE : A[i-1];
      int A_right = i == m ? Integer.MAX_VALUE : A[i];
      int B_left = j == 0 ? Integer.MIN_VALUE : B[j-1];
      int B_right = j == n ? Integer.MAX_VALUE : B[j];

      if (A_left > B_right) {
        imax = i - 1;
      } else if (B_left > A_right) {
        imin = i + 1;
      } else {
        int max_left = Math.max(A_left, B_left);
        int min_right = Math.min(A_right, B_right);
        if ((m + n) % 2 == 0)
          return (max_left + min_right) / 2.0;
        return max_left;
      }
    }
    return -1;
  }
}