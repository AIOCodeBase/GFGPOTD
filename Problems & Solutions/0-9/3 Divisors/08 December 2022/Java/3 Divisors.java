//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int q = sc.nextInt();
            ArrayList<Long> query = new ArrayList<>();
            for(int i=0;i<q;i++){
                query.add(sc.nextLong());
            }
            Solution ob = new Solution();
                
            ArrayList<Integer> ans = ob.threeDivisors(query,q);
            for(int cnt : ans) {
                System.out.println(cnt);
            }
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static boolean primeNum[];

    static ArrayList<Integer> primeArray;
    
    static void sieveOfEratosthenes(int N) {
        for (int i=2; i*i<=N; i++) {
    
            if (primeNum[i]) {
                for (int j=i*i; j<=N; j=j+i) {
                    primeNum[j] = false;
                }
            }
        }
    
        for (int i=2; i<=N; i++) {
    
            if (primeNum[i]) {
                primeArray.add(i);
            }
        }
    
    }
    static int solve(long n) {
        int counter=0;
    
        int index = 0;
        long currentNum = 1L * primeArray.get(index) * primeArray.get(index);
    
        while (currentNum <= n) {
            counter++;
            index++;
    
            if (index==primeArray.size()) {
                break;
            }
    
            currentNum = 1L * primeArray.get(index) * primeArray.get(index);
        }
        return counter;
    }
    
    static ArrayList<Integer> threeDivisors(ArrayList<Long> query, int q){
        primeNum=new boolean[1000001];
        primeArray=new ArrayList<>();
        
        Arrays.fill(primeNum,true);

        sieveOfEratosthenes(1000000);
        ArrayList<Integer> ans=new ArrayList<>();
        for (var n : query) {
            ans.add(solve(n));
        }

        return ans;
    }
}