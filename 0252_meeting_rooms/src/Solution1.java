import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution1 {
    public static int minMeetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return 0;

        Arrays.sort(intervals, (int[] a, int[] b) -> (a[0] - b[0]));

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(intervals[0][1]);

        for (int i = 1; i < intervals.length; i++ ) {
            if (pq.peek() <= intervals[i][0]) {
                pq.poll();
            }
            pq.offer(intervals[i][1]);
        }

        return pq.size();
    }
}
