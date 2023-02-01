#User function Template for python3
class Solution:
	def minDifference(self, arr, n):
        s=sum(arr)
        dp=[0]*(s//2 +1)
        dp[0]=1
        for i in range(n):
            for j in range(s//2,arr[i]-1,-1):
                dp[j]=dp[j] or dp[j-arr[i]]
        for i in range(s//2,-1,-1):
            if dp[i]:return s-2*i;
        return 0

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		N = int(input())
		arr = [int(x) for x in input().split()]
		ob = Solution()
		ans = ob.minDifference(arr, N)
		print(ans)

# } Driver Code Ends