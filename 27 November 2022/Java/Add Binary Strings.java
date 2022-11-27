//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String input[] = read.readLine().split(" ");
            String a = input[0];
            String b = input[1];
            Solution ob = new Solution();
            System.out.println(ob.addBinary(a,b));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String addBinary(String A, String B) {
        
        if(B.length() > A.length()) {
            String temp = A;
            A = B;
            B = temp;
        }
        
        int i = A.length()-1;
        int j = B.length()-1;
        int carry = 0;
        
        StringBuilder res = new StringBuilder();
        
        
        while(i>=0 && j>=0) {
            int sum = A.charAt(i)-'0' + B.charAt(j)-'0' + carry;
            carry = sum/2;
            res.append(sum%2);
            
            i--;
            j--;
        }
        
        while(i>=0) {
            int sum = A.charAt(i)-'0' + carry;
            carry = sum/2;
            res.append(sum%2);
            
            i--;
        }
        
        if(carry != 0) {
            res.append(carry);
        }
        
        int start = res.length()-1;
        
        while(start >=0 && res.charAt(start) == '0') {
            start--;
        }
        
        if(start != res.length()-1) {
            res.delete(start+1,res.length());
        }
        
        return res.reverse().toString();
        
    }
}