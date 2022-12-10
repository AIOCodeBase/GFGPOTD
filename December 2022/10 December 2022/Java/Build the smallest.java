//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String str = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.buildLowestNumber(str,N));
        }
    }
}
// } Driver Code Ends

class Solution {
    static String buildLowestNumber(String str, int N) {
        int n = str.length();
        Stack<Character> mystack=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            while(!mystack.isEmpty() && N>0 && mystack.peek()>c)
            {   
                mystack.pop();
                N-=1;
            }
            
            if(!mystack.isEmpty() || c!='0')
                mystack.push(c);
        }
        while(!mystack.isEmpty() && N-->0)
            mystack.pop();
        if(mystack.isEmpty())
            return "0";
        
        StringBuilder sb=new StringBuilder();
        sb.append(str);
        while(!mystack.isEmpty())
        {
            sb.setCharAt(n-1,mystack.peek());
            mystack.pop();
            n-=1;
        }
        return sb.substring(n);
    }
}