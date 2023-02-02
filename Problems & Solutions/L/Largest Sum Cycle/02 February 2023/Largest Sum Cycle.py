import sys
sys.setrecursionlimit(10**6)

class Solution():
    def dfs(self, node,p=-1):
        self.vis[node]=1
        self.par[node]=p
        self.tmp.append(node)
        for i in self.v[node]:
            if(self.vis[i]==0):
                z=self.dfs(i,node)
                if(z!=-1):
                    return z
                
            elif(self.vis[i]==1):
                sum=i
                while(node!=i):
                    sum+=node
                    node=self.par[node]
                
                if(node==i):
                    return sum
                return -1
            
        return -1

    def largestSumCycle(self, N, Edge):
        ans=-1
        self.vis=[0]*N
        self.v=[[] for i in range(N)]
        self.par = [0]*N
        self.tmp = []

        for i in range(N):
            if(Edge[i]!=-1):
                self.v[i].append(Edge[i])

        for i in range(N):
            if(~self.vis[i]):
                ans=max(ans,self.dfs(i))
                for j in self.tmp:
                    self.vis[j]=2
                
                self.tmp.clear()
        return ans

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == "__main__":
    for _ in range(int(input())):
        N = int(input())
        Edge=[int(i) for i in input().split()]
        print(Solution().largestSumCycle(N, Edge))
# } Driver Code Ends