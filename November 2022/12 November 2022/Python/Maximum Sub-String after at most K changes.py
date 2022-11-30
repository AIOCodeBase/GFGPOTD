#User function Template for python3

class Solution:
	def characterReplacement(self, s, k):
        # Code here
        has={}
        maxi=0
        let=""
        left=0
        right=0
        res=0
        while right<len(s):
            if s[right] not in has:
                has[s[right]]=1
            else:
                has[s[right]]+=1
            maxi=max(maxi,has[s[right]])
            if right-left+1-maxi>k:
                has[s[left]]-=1
                left+=1
            else:
                res=max(res,right-left+1)
            right+=1
        return res

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		s = input()
		k = int(input())
		ob = Solution()
		ans = ob.characterReplacement(s, k)
		print(ans)

# } Driver Code Ends