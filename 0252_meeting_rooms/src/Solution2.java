import java.util.Arrays;

public class Solution2 {
    public static int minMeetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return 0;

        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int s = 0, e = 0;
        for (; s < intervals.length; s++) {
            if (end[e] <= start[s])
                e++;
        }
        return s - e;
    }
}
