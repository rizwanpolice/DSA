package RecurionAndBacktracking.Recursion;

import java.util.ArrayList;

/*
You are given three rods (numbered 1 to 3), and ‘N’ disks initially placed on the first rod, one on top of each other in increasing order of size ( the largest disk is at the bottom). You are supposed to move
the ‘N’ disks to another rod(either rod 2 or rod 3) using the following rules and in less than 2 ^ (N) moves.

1. You can only move one disk in one move.
2. You can not place a larger disk on top of a smaller disk.
3. You can only move the disk at the top of any rod.
You may assume that initially, the size of the ‘i’th disk from the top of the stack is equal to ‘i’, i.e.
the disk at the bottom has size ‘N’, the disk above that has size ‘N - 1’, and so on. The disk at the top has size 1.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118522/offering/1380918?leftPanelTab=0

Solution link: https://www.youtube.com/watch?v=l45md3RYX7c
 */
public class TowerOfHanoi {
    // Use recursion tree to easily understand this solution, take N=3 and draw a recursion tree
    public static ArrayList <ArrayList<Integer>> towerOfHanoi(int n)
    {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int src=1,help=2,dest=3;
        solvetoh(n,src,dest,help,ans);
        return ans;
    }

    public static void solvetoh(int n, int src, int dest, int help, ArrayList<ArrayList<Integer>> ans){

        if(n==0)
            return;

        // The solution divides the problem into two sub problems,
        // First moving n-1 from source to helper
        // Move last coin from source to destination
        // Second moving n-1 from helper to destination
        solvetoh(n-1,src,help,dest,ans);
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(src);
        temp.add(dest);
        ans.add(temp);
        solvetoh(n-1,help,dest,src,ans);
    }
}
