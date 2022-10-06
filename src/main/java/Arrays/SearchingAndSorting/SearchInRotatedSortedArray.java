package Arrays.SearchingAndSorting;

/*
Aahad and Harshit always have fun by solving problems. Harshit took a sorted array consisting of distinct integers and rotated it clockwise by an unknown amount.
For example, he took a sorted array = [1, 2, 3, 4, 5] and if he rotates it by 2, then the array becomes: [4, 5, 1, 2, 3].

After rotating a sorted array, Aahad needs to answer Q queries asked by Harshit, each of them is described by one integer Q[i]. which Harshit wanted him to search in the array.
For each query, if he found it, he had to shout the index of the number, otherwise, he had to shout -1.

For each query, you have to complete the given method where 'key' denotes Q[i].
If the key exists in the array, return the index of the 'key', otherwise, return -1.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118820/offering/1381878

Solution link: https://www.youtube.com/watch?v=Le8bc8aHgBA
 */

public class SearchInRotatedSortedArray {

    public static int search(int arr[], int key) {

        //This solution used modified form of binary search
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low + (high-low)/2;
            if(arr[mid]==key)
                return mid;

            if(arr[low]<=arr[mid]){  //if first half is sorted
                // so we are checking in sorted array in first half
                if(key>=arr[low] && key<arr[mid]){
                    high=mid-1;
                }else{
                    low = mid+1;
                }

            }else{   //else go to second sorted half
                //so we are checking in sorted array in second half
                if(key>arr[mid] && key<=arr[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }

            }
        }

        return -1;
    }
}
