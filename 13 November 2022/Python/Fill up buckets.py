#User function Template for python3

class Solution:
	def totalWays(self, n, capacity):
        capacity.sort()
        ans, MOD = 1, 1000000007
        
        for i, cap in enumerate(capacity):
            ans = (ans * (cap - i)) % MOD
        return ans

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		n= int(input())
		capacity = list(map(int,input().split()))
		ob = Solution()
		ans = ob.totalWays(n,capacity)
		print(ans)

# } Driver Code Ends