#User function Template for python3

class Solution:
    def lcmTriplets(self,N):
        if N<3:
            return N
        if N%2==0:
            if N%3==0:
                return ((N-2)*(N-1)*(N-3))
            else:
                return ((N-3)*(N-1)*(N))
        return ((N-2)*(N-1)*(N))

#{ 
 # Driver Code Starts
#Initial Template for Python 3

import math
        
if __name__=='__main__':
    t=int(input())
    for _ in range(t):
        N = int(input())
        ob=Solution()
        print(ob.lcmTriplets(N))
# } Driver Code Ends