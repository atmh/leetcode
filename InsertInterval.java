/*

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        
        int start = newInterval[0];
        int end = newInterval[1];
        int i = 0;
        
        while (i < intervals.length && intervals[i][1] < start) {
            result.add(intervals[i++]);
        }
        
        while (i < intervals.length && intervals[i][0] <= end) {
            start = Math.min(start, intervals[i][0]);
            end = Math.max(end, intervals[i++][1]);
        }
        int[] temp = {start, end};
        result.add(temp);

        while (i < intervals.length) {
            result.add(intervals[i++]);
        }
        
        int[][] res = new int[result.size()][2];
        
        for (int j = 0; j < result.size(); j++) {
            res[j] = result.get(j);
        }
        
        return res;
    }
}

*/