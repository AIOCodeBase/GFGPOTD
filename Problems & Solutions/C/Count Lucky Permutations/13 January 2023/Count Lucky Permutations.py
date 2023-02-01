class Solution: 
    def luckyPermutations(self, N, M, arr, graph):
        
        dp = [[0 for j in range(1<<N)] for j in range(N)]
        
        
        for i in range(N):
            dp[i][1<<i]=1
        
        adj = [[0 for j in range(N)]for j in range(N)]
        for edge in graph:
            adj[edge[0]-1][edge[1]-1]=1
            adj[edge[1]-1][edge[0]-1]=1
        
        for bitmask in range(1, 1<<N):
            for i in range(N):
                if((1&(bitmask>>i))):
                    for j in range(N):
                        if(j!=i and arr[j]!=arr[i] and (1&(bitmask>>j)) and adj[arr[i]-1][arr[j]-1]):
                            dp[i][bitmask]+=dp[j][bitmask^(1<<i)]
                        
        ans = 0
        for i in range(N):
            ans+=dp[i][(1<<N)-1]
        
        return ans

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    
    T = int(input())
    while T > 0:
        N, M=[int(i) for i in input().split()]
        arr = [int(i) for i in input().split()]
        graph = []
        for i in range(M):
            graph.append([int(i) for i in input().split()])
        ob = Solution()
        print(ob.luckyPermutations(N, M, arr,graph))
        
        T -= 1
# } Driver Code Ends