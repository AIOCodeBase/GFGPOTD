#User function Template for python3
class Solution:
	def addBinary(self, A, B):
        i = len(A)
        j = len(B)
        
        if i == 0:
            return B
        if j == 0:
            return A
        
        i -= 1
        j -= 1
        
        res = ""
        carry = '0'
        
        while (i >= 0 or j >= 0):
            if i >= 0:
                ch1 = A[i]
            else:
                ch1 = '0'
        
            if j >= 0:
                ch2 = B[j]
            else:
                ch2 = '0'
            
            temp = int(ch1)+int(ch2)+int(carry)
            if temp == 0:
                res += '0'
                carry = '0'
            
            elif temp == 1:
                res += '1'
                carry = '0'
            
            elif temp == 2:
                res += '0'
                carry = '1'
            
            else:
                res += '1'
                carry = '1'
            
            i -= 1 
            j -= 1
        
        if carry == '1':
            res += carry
        
        l = len(res)
        while l > 0 and res[l - 1] == '0':
            l -= 1
        
        if l == 0:
            return "0"
        
        res = list(res)
        
        for i in range(l//2):
            res[i], res[l - i - 1] = res[l - i - 1], res[i]
        
        res = "".join(res)
    
        return res[0:l]

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		a,b = input().split(" ")
		ob = Solution()
		answer = ob.addBinary(a,b)
		
		print(answer)


# } Driver Code Ends