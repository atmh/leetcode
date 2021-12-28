import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    int[] res = new int[2];
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.get(complement) != null) {
        res[1] = i;
        res[0] = map.get(complement);
      }
      map.put(nums[i], i);
    }
    return res;
  }
}