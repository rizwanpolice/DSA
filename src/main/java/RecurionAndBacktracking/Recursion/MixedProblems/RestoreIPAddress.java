package RecurionAndBacktracking.Recursion.MixedProblems;

import java.util.ArrayList;
import java.util.List;

/*
You are given a string 'S' containing only digits.
Your task is to find all possible IP addresses that can be obtained from string 'S' in lexicographical order.

A valid IP address consists of exactly four integers, each integer
is between 0 and 255 separated by single dots, and cannot have leading zeros except in the case of zero itself.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118522/offering/1380931
Solution link: https://www.youtube.com/watch?v=wwK4lKPa0lY
 */
public class RestoreIPAddress {
    public static List<String> generateIPAddress(String s) {
        List<String> ans = new ArrayList<>();
        ArrayList<String> temp = new ArrayList<>();
        solveIP(s,temp,ans,0);

        return ans;

    }

    public static void solveIP(String s, ArrayList<String> temp,List<String> ans,int index){

        if(index==s.length() && temp.size()==4){
            String ip = "";
            for(int j=0;j<temp.size();j++){
                ip+= temp.get(j) + '.';
            }

            ip = ip.substring(0,ip.length()-1);
            ans.add(ip);
            return;
        }

        String tempStr = "";


        for(int i=index;i<s.length() && temp.size()<4;i++){
            tempStr += s.charAt(i);
            int tempInt = Integer.parseInt(tempStr);

            if(tempInt>=0 && tempInt<=255){
                temp.add(tempStr);
                solveIP(s,temp,ans,i+1);
                temp.remove(temp.size()-1);
            }

            if(tempInt<=0 || tempInt>255){
                break;
            }

        }

    }
}
