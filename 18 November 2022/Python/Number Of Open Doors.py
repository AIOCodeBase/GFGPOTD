#User function Template for python3

class Solution:
    def noOfOpenDoors(self, N):
        return int(math.sqrt(N))

#{ 
 # Driver Code Starts
#Initial Template for Python 3

import math

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        N=int(input())
        
        ob = Solution()
        print(ob.noOfOpenDoors(N))
# } Driver Code Ends