package BasicAlgorighms.SlidingWindow;

import java.util.ArrayList;

/*

The equilibrium index of a sequence of integers is defined as the index such that the sum of all the elements
at lower indices is equal to the sum of elements at higher indices.

1. 'SEQUENCE' may contain more than one equilibrium indices.

2. If there are no equilibrium indices, return an empty sequence.

3. Consider the sum of elements lower than the first index and higher than the last index to be 0 (zero).

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118509/offering/1376577?leftPanelTab=1

Solution link: https://www.youtube.com/watch?v=c9imv2LvgWk

 */

public class EquilibriumIndexInArray {

    public static ArrayList<Integer> findEquilibriumIndices(int[] sequence) {
        // Write your code here.

        ArrayList<Integer> answer = new ArrayList<>();
        if(sequence.length==1){
            answer.add(0);
            return answer;
        }

        if(sequence.length==2)
            return answer;

        int[] arraySum = new int[sequence.length];
        int totalSum = sequence[0];
        arraySum[0]=sequence[0];

        for(int i=1;i<sequence.length;i++){
            arraySum[i] = arraySum[i-1] + sequence[i];
            totalSum +=sequence[i];
        }

        for(int i=0;i<sequence.length;i++){
            int leftSum = arraySum[i] - sequence[i];
            int rightSum = totalSum - arraySum[i];

            if(leftSum == rightSum)
                answer.add(i);
        }

        return answer;
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n)
 */