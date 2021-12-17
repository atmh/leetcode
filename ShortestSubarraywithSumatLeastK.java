import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
  public int shortestSubarray(int[] nums, int k) {
    int n = nums.length;
    int res = n + 1;
    long[] p = new long[n+1];
    for (int i = 0; i < n; i++) p[i+1] = nums[i] + p[i];
    Deque<Integer> d = new ArrayDeque<>();
    for (int i = 0; i < n + 1; i++) {
      while (d.size() > 0 && p[i] - p[d.getFirst()] >= k)
        res = Math.min(res, i - d.pollFirst());
      while (d.size() > 0 && p[i] <= p[d.getLast()])
        d.pollLast();
      d.add(i);
    }
    return res > n ? -1 : res;
  }
}