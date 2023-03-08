package Strings;
/*
You are given a string, you have to print the string with only reversing the vowels in the string
For eg:
input: Hello World
Output: Hollo Werld

Solution:
This can be simply solved by traversing through the string and storing vowels in an array list
The again traverse and replace vowels by getting values from reverse of the array list.

But the below approach follows two pointer technique where we are trying to traverse once
and then inside while loop will traverse from right side
 */
public class PrintVowelsInReverse {

    public static void main(String[] args) {
        String str = "Hello World i";
        StringBuilder sb = new StringBuilder();
        int j=str.length()-1;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);

            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                while(j>=0){
                    char end = str.charAt(j);
                    if(end=='a' || end=='e' || end=='i' || end=='o' || end=='u'){
                        sb.append(end);
                        j--;
                        break;
                    }else{
                        j--;
                    }

                }
            }else{
                sb.append(c);
            }
        }

        System.out.println(sb.toString());
    }
}

/*
Time complexity: O(n)
Space complexity: O(1)
 */