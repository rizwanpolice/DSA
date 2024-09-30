package Arrays.MixedProblems;

import java.util.*;

/*

Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...]
determine if a person could attend all meetings

Problem link: https://prepfortech.io/leetcode-solutions/check-if-a-person-can-attend-all-meetings
 */
public class AttendAllMeetings {
    public static void main(String[] args) {

    }

    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] i1, int[] i2) {
                return i1[0] - i2[0];
            }
        });

        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i][1] > intervals[i + 1][0])
                return false;
        }
        return true;
    }
}
