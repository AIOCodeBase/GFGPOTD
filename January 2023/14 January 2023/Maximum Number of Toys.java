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

class Pair<K,V>{

    private K key;
    private V val;
    public Pair(K key, V val){

        this.key = key;

        this.val = val;

    }
    public K getKey(){

        return this.key;

    }
    public V getVal(){

        return this.val;

    }
}

class Solution {

    ArrayList<Integer> maximumToys(int N, int A[], int Q, ArrayList<Integer> Queries[]){
        ArrayList<Pair<Integer,Integer>> arr = new ArrayList<>();
        for(int i=0; i<N; i++) arr.add(new Pair<Integer,Integer>(A[i],i));
        Collections.sort(arr, new Comparator<Pair<Integer,Integer>>(){
            public int compare(Pair<Integer,Integer> p1, Pair<Integer,Integer> p2){
                return p1.getKey()-p2.getKey();
            }
        });

        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0; i<N; i++){
            mp.put(arr.get(i).getVal(),i);
        }
        long[] prefix = new long[N+1];
        prefix[0] = 0;
        for(int i=1; i<=N; i++)
        {
            prefix[i] = prefix[i-1] + arr.get(i-1).getKey();
        }
        int[] res = new int[Q];
        for(int i=0; i<Q; i++){
            long c = Queries[i].get(0);
            int k = Queries[i].get(1);
            int l = 0;
            int r = N;
            int ans = 0;
            while(l<=r){
                int mid = l + (r-l)/2;
                if(prefix[mid]<=c){
                    ans = mid;
                    l = mid+1;
                }
                else r = mid-1;
            }

            if(ans <= 0){
                res[i] = 0;
                continue;
            }

            int idx = ans-1;
            long rem = c - prefix[ans];
            HashSet<Integer> notRemoved = new HashSet<>();
            for(int j = 0; j<k; j++){
                int qIdx = mp.get(Queries[i].get(j+2) - 1);
                if(qIdx<=idx){
                    ans--;
                    rem += arr.get(qIdx).getKey();
                }
                else notRemoved.add(qIdx);
            }

            int s = idx+1;
            while(s<N && arr.get(s).getKey()<=rem){
                if(!notRemoved.contains(s)) {
                    ans++;
                    rem-=arr.get(s).getKey();
                }
                s++;
            }
            res[i] = ans;
        }
        ArrayList<Integer> ret = new ArrayList<>();
        for(int i=0; i<Q; i++){
            ret.add(res[i]);
        }
        return ret;
    }
}
