package Arrays.MixedProblems;
import java.util.*;

/*

You have been given two arrays, 'AT' and 'DT', representing the arrival and departure times of all trains that reach a railway station.
Your task is to find the minimum number of platforms required for the railway station so that no train needs to wait.

1. Every train will depart on the same day and the departure time will always be greater than the arrival time. For example, A train with arrival time 2240 and departure time 1930 is not possible.

2. Time will be given in 24H format and colons will be omitted for convenience. For example, 9:05AM will be given as "905", or 9:10PM will be given as "2110".

3. Also, there will be no leading zeroes in the given times. For example, 12:10AM will be given as “10” and not as “0010”.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118820/offering/1381892?leftPanelTab=1

Solution link: https://www.youtube.com/watch?v=dxVcMDI7vyI
 */
public class MinimumNumberOfPlatforms {

    public static int calculateMinPatforms(int at[], int dt[], int n) {

        //In this problem, we are using two pointer approach
        Arrays.sort(at);
        Arrays.sort(dt);

        int i=1,j=0, platforms = 1, max =1;

        while (i<n && j<n){
            if(at[i]<=dt[j]){
                platforms++;
                i++;
            }else if(at[i]>dt[j]){
                platforms--;
                j++;
            }

            if(max<platforms){
                max=platforms;
            }
        }

        return max;
    }
}
