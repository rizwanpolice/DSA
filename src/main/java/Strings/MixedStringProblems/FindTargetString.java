package Strings.MixedStringProblems;

import java.util.ArrayList;

public class FindTargetString {
    public static void main(String[] args) {

        //String s = "ababcdfababababijkab" target = "ab"
        //output : [2,4,1]
        String s = "ababcdfababababijkab";
        String target = "ab";
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0,j=0;
        int k=0;
        int count=0;
        int flag = 0;
        while(i< s.length() && j<s.length()){
            if(s.charAt(j)==target.charAt(k)){
                j++;
                k++;
            }else{
                if(count!=0)
                    ans.add(count);
                j++;
                i=j;
                k=0;
                count=0;
                flag=1;

            }

            if(k==target.length()-1){
                count++;
                if(count > 1){
                    System.out.println("Index is:" + j);
                    System.out.println("count is:" + count);
                    // ans.add(ans.size()-1,count);
                }else{
                    System.out.println("Index is:" + j);
                    System.out.println("count is:" + count);
                    //ans.add(count);
                }

                if(j==s.length()-1)
                    ans.add(count);


                k=0;
                j++;
            }
        }



        for(int element:ans){
            System.out.println(element);
        }

    }
}
