class Solution:

    def buildLowestNumber(self, num,k):
        stack = []
        for n in num:
            while(stack and int(stack[-1])>int(n) and k):
                k-=1
                stack.pop()
            stack.append(n)
        while(k):
            stack.pop()
            k-=1
        if len(stack)==0:
            return "0"
        s=''
        for i in range(len(stack)):
            s+=stack[i]
        return str(int(s))

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':

    t = int(input())

    for _ in range(t):
        N = int(input())
        S = input()

        solObj = Solution()

        print(solObj.buildLowestNumber(S,N))
# } Driver Code Ends