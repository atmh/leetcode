import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
  public int[][] merge(int[][] intervals) {
    if (intervals.length == 1) return intervals;
    
    Arrays.sort(intervals, (x, y) -> x[0] - y[0]);

    List<int[]> res = new ArrayList<>();
    int[] newInterval = intervals[0];
    res.add(newInterval);
    for (int[] i : intervals) {
      if (i[0] <= newInterval[1]) {
        newInterval[1] = Math.max(i[1], newInterval[1]);
      } else {
        newInterval = i;
        res.add(newInterval);
      }
    }
    return res.toArray(new int[res.size()][2]);
  }
}