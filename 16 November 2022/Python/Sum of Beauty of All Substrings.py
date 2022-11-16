#User function Template for python3

class Solution:
    def beautySum(self, s):
        result=0
        for i in range(len(s)):
            S={}
            for j in range(i,len(s)):
                if s[j] not in S:
                    S[s[j]]=1
                else:
                    S[s[j]]+=1
                mostFrequency,leastFrequency=max(S.values()),min(S.values())
                result+=(mostFrequency-leastFrequency)
        return result

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        s = input()
        ob = Solution()
        print(ob.beautySum(s))
# } Driver Code Ends