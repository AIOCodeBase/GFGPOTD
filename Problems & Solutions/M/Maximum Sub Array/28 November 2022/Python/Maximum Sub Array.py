#User function Template for python3

class Solution:

	def findSubarray(self,a, n):
	    max_sum = -1
	    cur_sum = 0
	    max_range_left = -1
	    max_range_right = -1
	    cur_range_left = 0
	    cur_range_right = 0
	    while (cur_range_right < n):
	        if (a[cur_range_right] < 0):
	            cur_range_left = cur_range_right + 1
	            cur_sum = 0
	        else:
	            cur_sum += a[cur_range_right]
	            if (cur_sum > max_sum):
	                max_sum = cur_sum
	                max_range_left = cur_range_left
	                max_range_right = cur_range_right
	            elif (cur_sum == max_sum):
	                if (cur_range_right + 1 - cur_range_left >
	                    max_range_right + 1 - max_range_left):
	                    max_range_left = cur_range_left
	                    max_range_right = cur_range_right
	                
	            
	        
	        cur_range_right=cur_range_right+1;
	    
	    ans = [];
	    if (max_range_left == -1 or max_range_right == -1):
	        ans.append(-1);
	        return ans;
	    

	    for i in range(max_range_left, max_range_right+1):
	        ans.append(a[i]);
	    return ans;

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 

	tc=int(input())
	while tc > 0:
	    n=int(input())
	    a=list(map(int, input().strip().split()))
	    ob = Solution()
	    ans=ob.findSubarray(a, n)
	    for x in ans:
	        print(x, end=" ")
	    print()
	    tc=tc-1
# } Driver Code Ends