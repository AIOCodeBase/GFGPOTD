#User function Template for python3

class Solution:

    def caseSort(self,s,n):
        case = [1 if ele.isupper() else 0 for ele in s]
        s = sorted(list(s))
        upper = s[:sum(case)][::-1]
        lower = s[sum(case):][::-1]
        return ''.join([upper.pop() if x==1 else lower.pop() for x in case])
#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for tt in range(t):
        n=int(input())
        s=str(input())
        print(Solution().caseSort(s,n))
# } Driver Code Ends
