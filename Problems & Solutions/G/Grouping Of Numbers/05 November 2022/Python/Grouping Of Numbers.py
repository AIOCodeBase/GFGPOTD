#User function Template for python3

class Solution:
    def maxGroupSize(self, arr, N, K):
        # code here 
        ns = [0]*K
        for e in arr:
            ns[e%K] += 1
        
        ans = ns[0] > 0
        
        for i in range(1, K//2+1):
            
            if i*2 == K:
                ans += ns[i] > 0
            else:
                ans += max(ns[i], ns[K-i])
        return ans

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        N,K=map(int,input().split())
        arr=list(map(int,input().split()))
        
        ob = Solution()
        print(ob.maxGroupSize(arr,N,K))
# } Driver Code Ends