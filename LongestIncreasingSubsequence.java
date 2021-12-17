class Solution {
  public int lengthOfLIS(int[] nums) {
    int[] pile = new int[nums.length];
    int size = 0;
    for (int x : nums) {
      int i = 0;
      int j = size;
      while (i < j) {
        int mid = (i+j)/2;
        if (x > pile[mid]) {
          i = mid + 1;
        } else {
          j = mid;
        }
      }
      pile[i] = x;
      if (i==size) size++;
    }
    return size;
  }
}