import sys
sys.setrecursionlimit(10**6)
class Solution:
    def dfs(self,arr,u,par,l,d,vis,ap,time):
        d[u] = l[u] = time;
        time+=1
        ch = 0;
        vis[u] = 1;
        for v in arr[u]:
            if(vis[v]==0):
                ch+=1;
                self.dfs(arr, v, u, l, d, vis, ap,time);
                l[u] = min(l[u], l[v]);
                if(par == -1 and ch > 1):
                    ap.add(u);
                elif(par != -1 and l[v] >= d[u]):
                    ap.add(u);
            elif(par != v and u != v):
                l[u] = min(l[u], d[v]);
          
    def articulationPoints(self,V,arr):
        vis=[0]*V;
        ap=set();
        l=[0]*V; d=[0]*V;
        time=0
        for i in range(V):
            if(vis[i]==0):
                self.dfs(arr, i, -1, l, d, vis, ap,time);
        vec=list(ap)
        if(len(vec)==0):
            vec.append(-1);
        return sorted(vec);

#{ 
 # Driver Code Starts
if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		V, E = map(int, input().split())
		adj = [[] for i in range(V)]
		for _ in range(E):
			u, v = map(int, input().split())
			adj[u].append(v)
			adj[v].append(u)
		ob = Solution()
		ans = ob.articulationPoints(V, adj)
		for i in range(len(ans)):
		    print(ans[i], end = " ")
		print()
        

# } Driver Code Ends