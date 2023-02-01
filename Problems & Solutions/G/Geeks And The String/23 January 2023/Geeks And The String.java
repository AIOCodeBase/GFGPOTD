//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String s; 
            s = br.readLine();
            
            Solution obj = new Solution();
            String res = obj.removePair(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String removePair(String s) {
        
        Stack<Character>p= new Stack<>();
        char c;
        String ans = "";
        int n = s.length();

        for(int i=0; i<n; i++)
        {
           if(p.empty())
           {
               p.push(s.charAt(i));
           }

           else
           {
               if(p.peek() == s.charAt(i))
               {
                   p.pop();
               }
               else p.push(s.charAt(i));
           }
        }

        while(!p.empty())
        {
            c = p.peek();
            p.pop();
            ans += c;
        } 
        
        StringBuilder str = new StringBuilder(ans);
        StringBuilder reverseStr = str.reverse();
        String result = str.toString();

        if(ans.length() == 0)
        {
            return "-1";
        }

        return result;
    }
}
