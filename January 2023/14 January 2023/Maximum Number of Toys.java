//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 

        Integer nextInt(){
            return Integer.parseInt(next());
        }

        Long nextLong(){
            return Long.parseLong(next());
        }
    } 

    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();        
        PrintWriter out = new PrintWriter(System.out);
        int testcases = sc.nextInt();

        while (testcases-- > 0) {
            int N = sc.nextInt();
            int A[] = new int[N];
            for(int i = 0; i < N; i++) A[i] = sc.nextInt();
            int Q = sc.nextInt();
            ArrayList<Integer> Queries[] = new ArrayList[Q];
            for(int i = 0; i < Q; i++){
                Queries[i] = new ArrayList<>();
                int x = sc.nextInt(), y = sc.nextInt();
                Queries[i].add(x);
                Queries[i].add(y);
                for(int j = 0; j < Queries[i].get(1); j++){
                    x = sc.nextInt();
                    Queries[i].add(x);
                }
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.maximumToys(N, A, Q, Queries);
            for(int x : ans)
                out.print(x + " ");
            out.print("\n");
        }
        out.flush();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    ArrayList<Integer> maximumToys(int n, int cost[], int q, ArrayList<Integer> qrs[]){
        int[][] copy=new int[n][2];
        for (int i=0; i<n; i++) {
            copy[i][0]=cost[i];
            copy[i][1]=i+1;
        }
        Arrays.parallelSort(copy, (a,b)->a[0]-b[0]);
        ArrayList<Integer> res=new ArrayList<>();
        for (int j=0; j<qrs.length; j++) {
            int c=qrs[j].remove(0);
            if (qrs[j].size()>0) {
                qrs[j].remove(0);
            }
            Set<Integer> broken=new HashSet<>(qrs[j]);
            int count=0;
            for (int i=0; i<n && c>=copy[i][0]; i++) {
                if (!broken.contains(copy[i][1]) && c>=copy[i][0]) {
                    c-=copy[i][0];
                    count++;
                }
            }
            res.add(count);
        }
        return res;
        
    }
}
