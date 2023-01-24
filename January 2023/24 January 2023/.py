#User function Template for python3
import numpy as np
class Solution:
	def convert(self,arr, n):
		indices = np.argsort(arr)
        for i in range(n): arr[indices[i]] = i
        #{
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        n = int(input())
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        ob.convert(arr, n)
        for x in arr:
            print(x, end=" ")
        print()
        tc -= 1

# } Driver Code Ends
