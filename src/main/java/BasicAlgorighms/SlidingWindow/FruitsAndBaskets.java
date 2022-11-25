package BasicAlgorighms.SlidingWindow;

import java.util.HashMap;

/*
There are ‘n’ fruit trees that are planted along a road. The trees are numbered from 0 to n-1.
The type of fruit each tree bears is represented by an uppercase character of the English alphabet.
A Ninja is walking along that road. He has two baskets and wants to put the maximum number of fruits in them.
The restriction is that each basket can have only one type of fruit.

Ninja can start with any tree and end at any tree, but once he has started he cannot skip a tree i.e
 if he picks fruit from the tree ‘i’, then he has to pick fruit from tree ‘i+1’ before going to the tree ‘i+2’.
 He will pick one fruit from each tree until he cannot, i.e, he will stop when he has to pick a fruit of the
 third type because both the baskets can be filled by only two different fruits.

You are given a string ‘str’ consisting of the ‘n’ uppercase character of the English alphabet. The ‘i’th character in this string represents the type of fruit tree ‘i’ bears.
Return the maximum number of fruits ninja can put in both the baskets after satisfying all the given conditions.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118509/offering/1376582

Solution link: https://www.youtube.com/watch?v=za2YuucS0tw

 */
public class FruitsAndBaskets {

    public static int findMaxFruits(String str, int n) {

        HashMap<Character, Integer> map = new HashMap<>();
        int max=0;
        int i=0,j=0;
        while(j<str.length()){
            if(map.size()<=2){
                map.put(str.charAt(j),j);
                j++;
            }

            if(map.size()>2){
                int min = str.length()-1;
                for(int value:map.values()){
                    min = Math.min(min,value);
                }
                i=min+1;
                map.remove(str.charAt(min));
            }

            max = Math.max(max,j-i);
        }
        return max;
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n)
 */