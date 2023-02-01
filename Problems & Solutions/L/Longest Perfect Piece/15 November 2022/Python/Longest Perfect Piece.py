#User function Template for python3

class Solution:
    def longestPerfectPiece(self, arr, N):
        i,j,ans = 0, 0, 1
        for k in range(1, N):
            if abs(arr[k] - arr[j]) == 1:
                if i == j or arr[k] != arr[j-1]:
                    i = j
                j = k
            elif arr[k] != arr[j]:
                i = j = k
            ans = max(ans, k-i+1)
        return ans

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        N=int(input())
        arr=list(map(int,input().split()))
        
        ob = Solution()
        print(ob.longestPerfectPiece(arr,N))
# } Driver Code Ends