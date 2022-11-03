#User function Template for python3


class Solution:

	def removals(self,arr, n, k):
        arr.sort()
        ans = float('inf')
        
        for i in range(len(arr)):
            lo, hi = 0, i+1
            while lo < hi:
                mi = lo+(hi-lo)//2
                if arr[i]-arr[mi] <= k:
                    hi = mi
                else:
                    lo = mi+1
            
            if lo > i:
                continue
            ans = min(ans, n-(i-lo+1))
           # print("i = ", i, "lo = ", lo, " ans = ", ans)
        return ans


#{ 
 # Driver Code Starts
#Initial Template for Python 3


if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        n, k = list(map(int, input().strip().split()))
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        ans = ob.removals(arr, n, k)
        print(ans)
        tc -= 1
# } Driver Code Ends