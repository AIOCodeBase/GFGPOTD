//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;


class GFG{
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

    public static void main(String[] args) throws IOException
    {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while(t-- > 0){
            int N = sc.nextInt();
            int Edge[] = new int[N];
            for(int i = 0; i < N; i++)
                Edge[i] = sc.nextInt();
            Solution ob = new Solution();
            long ans = ob.largesSumCycle(N, Edge);
            out.println(ans);            
        }
        out.flush();
    }
}
// } Driver Code Ends

class Solution{
 	public long largesSumCycle(int n, int edge[]) {
		long ret = -1;
		boolean[] visited = new boolean[edge.length]; 
		for (int i = 0; i < edge.length; i++) {
			if (visited[i] == true) {
				continue;
			}
			Map<Integer, Integer> tempVisited = new HashMap<Integer, Integer>(); 
			for (int index = i, dist = 0; index != -1; index = edge[index]) {
				if (tempVisited.containsKey(index)) {
					ret = Math.max(ret, dist - tempVisited.get(index));
					break;
				}
				if (visited[index] == true) {
					break;
				}
				visited[index] = true;
				tempVisited.put(index, dist);
				dist += index;
			}
		}
		return ret;
	}
}
