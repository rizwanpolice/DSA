package BasicAlgorighms.TwoPointerTechnique;

/*
Given a sequence of ‘N’ space-separated non-negative integers  A[1],A[2],A[3],......A[i]…...A[n]. Where
each number of the sequence represents the height  of the line drawn at point 'i'.
Hence on the cartesian plane, each line is drawn from coordinate ('i',0)
to coordinate ('i', 'A[i]'), here ‘i’ ranges from 1 to ‘N’. Find two lines, which,
 together with the x-axis forms a container, such that the container contains the most area of water.

1. You can not slant the container i.e. the height of the water is equal to the minimum height of the
two lines which define the container.

2. Do not print anything, you just need to return the area of the container with maximum water.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118509/offering/1376556?leftPanelTab=0

Solution link: https://www.youtube.com/watch?v=aO9eAw1wKvE

 */
public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int area=0,maxArea=0;
        while(start<end){
            int h= Math.min(height[start],height[end]);
            area = h*(end-start);
            if(area>maxArea)
                maxArea=area;

            if(height[start]<height[end])
                start++;
            else
                end--;
        }

        return maxArea;
    }
}

/*
Time complexity: O(n)
space complexity: O(1)
 */