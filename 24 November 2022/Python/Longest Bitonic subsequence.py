#User function Template for python3

class Solution:
	def LongestBitonicSequence(self, nums):
		n = len(nums)
		lis = [1]*n
		for i in range(n):
			for j in range(i):
				if(nums[i] > nums[j] and lis[i] < lis[j] + 1):
					lis[i] = lis[j] + 1
		
		lds = [1]*n
		for i in range(n-2,-1,-1):
			for j in range(n-1,i,-1):
				if(nums[i] > nums[j] and lds[i] < lds[j] + 1):
					lds[i] = lds[j] + 1
		ans = lis[0] + lds[0] - 1
		for i in range(1,n):
			ans = max(ans, lis[i] + lds[i] - 1)
		return ans

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		n = int(input())
		nums = list(map(int, input().split()))
		ob = Solution()
		ans = ob.LongestBitonicSequence(nums)
		print(ans)
# } Driver Code Ends