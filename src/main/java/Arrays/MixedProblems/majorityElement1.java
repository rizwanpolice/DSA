package Arrays.MixedProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
You are given an array/list 'ARR' of integers of length ‘N’.
You are supposed to find all the elements that occur strictly more than floor(N/3) times in the given array/list.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118820/offering/1381893?leftPanelTab=1
 */

public class majorityElement1 {

    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr)
    {

        // This solution follows adding the frequencies of each element occurence and
        // then finding which frequency is greater than majority number
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int a,majority=arr.size()/3;
        for(int i=0;i<arr.size();i++){
            a=arr.get(i);
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }else{
                map.put(a,1);
            }
        }

        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()>majority){
                ans.add(e.getKey());
            }
        }

        return ans;
    }
}
