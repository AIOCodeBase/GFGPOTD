//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String s = read.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.minOperation(s);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int minOperation(String s) {
        
        int ans=s.length();
        
        for(int i=0; i<s.length()/2; i++) {
            
            boolean b = true;
            
            for(int j=0; j<=i && b; j++){
                if(s.charAt(j) != s.charAt(j+i+1)){
                    b = false;
                }
            }  
            
            if(b){
                ans = s.length() - i;
            } 
        }
        return ans;
    }
}
