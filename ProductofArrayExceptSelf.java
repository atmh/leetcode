class Solution {
  public int[] productExceptSelf(int[] nums) {
    int[] result = new int[nums.length];

    for (int i = 0, left = 1; i < nums.length; i++) {
      result[i] = left;
      left *= nums[i];
    }

    for (int i = nums.length-1, right = 1; i >= 0; i--) {
      result[i] *= right;
      right *= nums[i];
    }

    return result;
  }
}