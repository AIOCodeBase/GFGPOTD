from sys import maxsize 
class Solution:

	def findRange(self,a, size): 

		max_so_far = -maxsize - 1
		max_ending_here = 0
		start = 0
		end = 0
		s = 0
		ans=[]
		allOne=True
		for x in a:
		    if x=='0':
		        allOne=False
		if allOne:
		    ans.append(-1)
		    return ans

		for i in range(0,size): 

			max_ending_here += -1 if (a[i]=='1') else 1

			if max_so_far < max_ending_here: 
				max_so_far = max_ending_here 
				start = s 
				end = i 

			if max_ending_here < 0: 
				max_ending_here = 0
				s = i+1
		ans.append(start+1)
		ans.append(end+1)
		return ans

#{ 
 # Driver Code Starts
if __name__ == '__main__': 


	tc=int(input())
	while tc > 0:
	    n=int(input())
	    s=input()
	    ob = Solution()
	    ans = ob.findRange(s, n)
	    if len(ans)==1:
	        print(ans[0])
	    else:
	        print(str(ans[0])+" "+str(ans[1]))
	    tc=tc-1
# } Driver Code Ends