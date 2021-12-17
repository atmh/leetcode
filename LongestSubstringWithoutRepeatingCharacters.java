import java.util.HashSet;
import java.util.Set;

class Solution {
  public int lengthOfLongestSubstring(String s) {
    int i = 0, j = 0, max = 0;
    Set<Character> substr = new HashSet<>();
    while (j < s.length()) {
      if (!substr.contains(s.charAt(j))) {
        substr.add(s.charAt(j++));
        max = Math.max(max, substr.size());
      } else {
        substr.remove(s.charAt(i++));
      }
    }
    return max;
  }
}