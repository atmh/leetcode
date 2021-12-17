class Solution {
  public boolean isRobotBounded(String instructions) {
    int i = 0;
    int[] pos = new int[2];
    int d[][] = {{0,1}, {1,0}, {0,-1}, {-1,0}};
    for (int j = 0; j < instructions.length(); j++) {
      if (instructions.charAt(j) == 'R') {
        i = (i + 1) % 4;
      } else if (instructions.charAt(j) == 'L') {
        i = (i + 3) % 4;
      } else {
        pos[0] += d[i][0];
        pos[1] += d[i][1];
      }
    }
    return (pos[0] == 0 && pos[1] == 0) || i > 0;
  }
}