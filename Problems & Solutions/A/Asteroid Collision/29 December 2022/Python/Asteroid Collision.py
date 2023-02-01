from collections import deque
class Solution:
    def asteroidCollision(self, n, a):
        st = deque()
        
        for val in a:
            if val > 0:
                st.append(val)
            else:
                while st and st[-1] > 0 and st[-1] < -val:
                    st.pop()
                if st and st[-1] == -val:
                    st.pop()
                elif not st or st[-1] < -val:
                    st.append(val)
            
        return st

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int(input())
    for _ in range(t):
        N = int(input())
        asteroids = list(map(int, input().split()))
        ob = Solution()
        res = ob.asteroidCollision(N, asteroids)
        for val in res:
            print(val, end = ' ')
        print()
# } Driver Code Ends