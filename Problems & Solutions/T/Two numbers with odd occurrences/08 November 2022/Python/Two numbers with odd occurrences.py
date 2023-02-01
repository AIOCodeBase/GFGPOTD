#User function Template for python3
class Solution:
    def twoOddNum(self, Arr, N):
        dic = {}
        for i in range(len(Arr)):
            dic[Arr[i]] = dic[Arr[i]] + 1 if Arr[i] in dic else 1
        val = list(dic.values())
        ke = list(dic.keys())
        lst = []
        for j in range(len(val)):
            if val[j] %2 != 0:
                lst.append(ke[j])
        lst.sort()
        lst = lst[::-1]
        return lst


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range (t):
        N = int(input())
        Arr = input().split()
        for itr in range(N):
            Arr[itr] = int(Arr[itr])
        ob = Solution();
        ans = ob.twoOddNum(Arr,N)
        for i in range(len(ans)):
        	print(ans[i], end = " ")
        print()
# } Driver Code Ends