from typing import List

class Solution:
    def maxCoins(self, N : int, arr : List[int]) -> int:
        arr=[1]+arr
        arr.append(1)
        dp=[[0]*(len(arr)+1) for _ in range(len(arr))]
        for le in range(1,N+1):
            for left in range(1,N-le+2):
                right=left+le-1
                for k in range(left,right+1):
                    dp[left][right]=max(dp[left][right],arr[left-1]*arr[k]*arr[right+1]+dp[left][k-1]+dp[k+1][right])
        return dp[1][N]

#{ 
 # Driver Code Starts

class IntArray:
    def __init__(self) -> None:
        pass
    def Input(self,n):
        arr=[int(i) for i in input().strip().split()]#array input
        return arr
    def Print(self,arr):
        for i in arr:
            print(i,end=" ")
        print()


if __name__=="__main__":
    t = int(input())
    for _ in range(t):
        
        N = int(input())
        
        
        arr=IntArray().Input(N)
        
        obj = Solution()
        res = obj.maxCoins(N, arr)
        
        print(res)
        

# } Driver Code Ends