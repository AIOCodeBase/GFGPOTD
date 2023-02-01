class Solution:
    def maxDistance (self, arr, n) : 
        max1=max2=-float("inf")
        min1=min2=float("inf")
        for i in range(n):
            max1=max(max1,arr[i]+(i+1))
            min1=min(min1,arr[i]+(i+1))
            max2=max(max2,arr[i]-(i+1))
            min2=min(min2,arr[i]-(i+1))
        return max(max1-min1,max2-min2)

#{ 
 # Driver Code Starts
#Initial Template for Python 3


for _ in range(0,int(input())):
    n = int(input())
    arr = list(map(int, input().strip().split()))
    ans = Solution().maxDistance(arr, n)
    print(ans)

# } Driver Code Ends