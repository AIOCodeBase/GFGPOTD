//{ Driver Code Starts
//Initial Template for Java
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
            Solution ob = new Solution();

            System.out.println(ob.isSumOfTwo(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String isSumOfTwo(int n){
        int flag =1;
       for(int i=0;i<=n;i++){
           if(prime(i)){
               if(prime(n-i)){
                  flag =1;
                  break;
               }else{
                flag =0;
               }
           }else{
             flag =0;
           }
       }
        return flag==1?"Yes":"No";
    }
   static boolean prime(int n ){
        if(n<=1) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        
        for(int i=3;i<=Math.sqrt(n);i=i+2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}