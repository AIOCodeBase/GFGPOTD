#User function Template for python3
class Solution:


	def countSubarray(self,arr, n, k):
        dp = [0 for i in range(n)]
        for i in range(n):
            if(arr[i] > k):
                dp[i] = n-i
        tmp = 0
        for i in range(n-1, -1, -1):
            if(dp[i] != 0):
                tmp = dp[i]
                continue
            dp[i] = tmp
        return sum(dp)

#{ 
 # Driver Code Starts
#Initial Template for Python 3


# Driver code 
if __name__ == "__main__": 		
    tc=int(input())
    while tc > 0:
        n, k=map(int, input().strip().split())
        arr=list(map(int, input().strip().split()))
        ob = Solution()
        ans=ob.countSubarray(arr, n, k)
        print(ans)
        tc=tc-1
# } Driver Code Ends