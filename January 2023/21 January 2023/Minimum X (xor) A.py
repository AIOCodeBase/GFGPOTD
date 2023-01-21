class Solution:
    def minVal(self, a, b):
        n = bin(b)[2:].count("1")
        arr = list(bin(a)[2:])
        ans = ""
        for i in arr:
            if i == "1" and n:
                n -= 1
                ans += "1"
            else:
                ans += "0"
        i = 1
        ans = list(ans)
        while n:
            if arr[-i] != "1":
                ans[-i] = "1"
                n -= 1
            i += 1
        ans = "".join(ans)
        return int(ans, 2)

    #{
 # Driver Code Starts
#Initial Template for Python 3

import atexit
import io
import sys

_INPUT_LINES = sys.stdin.read().splitlines()
input = iter(_INPUT_LINES).__next__
_OUTPUT_BUFFER = io.StringIO()
sys.stdout = _OUTPUT_BUFFER

@atexit.register

def write():
    sys.__stdout__.write(_OUTPUT_BUFFER.getvalue())

if __name__=='__main__':
    t = int(input())
    for i in range(t):
        a = int(input())
        b = int(input())

        ob= Solution()
        print(ob.minVal(a,b))
# } Driver Code Ends
