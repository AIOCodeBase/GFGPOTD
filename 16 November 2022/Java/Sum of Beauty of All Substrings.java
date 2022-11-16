//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            //br.readLine();
            String s;
            s = br.readLine();
            
            Solution obj = new Solution();
            int res = obj.beautySum(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int beautySum(String s) {
        int ans = 0;
        int len = s.length();
        
        for(int start = 0; start < len; start++){
            int[] arr = new int[26];
            for(int end = start; end < len; end++){
                arr[s.charAt(end) - 'a']++;
                
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                
                for(int k = 0; k < 26; k++){
                    max = Math.max(max, arr[k]);
                    if(arr[k] != 0){
                        min = Math.min(min, arr[k]);
                    }
                }
                ans += max - min;
            }
        }
        
        return ans;
    }
}
        
