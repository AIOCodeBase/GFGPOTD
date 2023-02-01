#User function Template for python3


def numOfWays(m,n):
    
    x_off = [-2,-2,-1, 1, 2, 2, 1, -1]
    y_off = [-1, 1, 2, 2, 1,-1, -2, -2]
    MOD = 1000000007

    ret = 0

    for i in range(m):
        for j in range(n):
            for k in range(8):
                
                x = i + x_off[k]
                y = j + y_off[k]
                
                if x>=0 and x<m and y>=0 and y<n :
                    ret+=1 
    
    total = ((m*n)*(m*n-1))%MOD 
    return (total +MOD - ret)%MOD 

#{ 
 # Driver Code Starts
#Initial Template for Python 3

import atexit
import io
import sys

# Contributed by : Nagendra Jha

if __name__ == '__main__':
    test_cases = int(input())
    for cases in range(test_cases):
        m,n = map(int,input().strip().split())
        print(numOfWays(m,n))

# } Driver Code Ends