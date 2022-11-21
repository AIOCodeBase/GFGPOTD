#User function Template for python3

class Solution:
	def countTriplets(self, nums):
        ans=0
        for i in range(len(nums)):
           left=0
           right=0
           for j in range(i-1,-1,-1):
               if nums[i]>nums[j]:
                   left+=1
           for j in range(i+1,len(nums)):
               if nums[i]<nums[j]:
                   right+=1
           ans+=left*right
        return ans

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		n = int(input())
		nums = list(map(int,input().split()))
		ob = Solution()
		ans = ob.countTriplets(nums)
		print(ans)

# } Driver Code Ends