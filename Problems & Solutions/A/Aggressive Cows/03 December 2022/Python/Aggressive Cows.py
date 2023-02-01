#User function Template for python3

class Solution:
    def solve(self, n, k, stalls):
        stalls.sort()
        
        def count(d):
            ans, curr = 1, stalls[0]
            for i in range(1, n):
                if stalls[i] - curr >= d:
                    ans += 1
                    curr = stalls[i]
            return ans
        
        l, r = 0, stalls[-1] - stalls[0]
        while l < r:
            mid = r - (r - l) // 2
            if count(mid) >= k:
                l = mid
            else:
                r = mid - 1
        return l

#{ 
 # Driver Code Starts
#Initial Template for Python 3

def main():

    T = int(input())

    while(T > 0):
        n, k = list(map(int, input().split()))
        stalls = list(map(int, input().split()))
        ob = Solution()
        res = ob.solve(n, k, stalls)
        print(res)

        T -= 1


if __name__ == "__main__":
    main()
# } Driver Code Ends