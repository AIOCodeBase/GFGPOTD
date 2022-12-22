class Solution:
     def findSubArrays(self,arr,n):
      
        c=0
        hashMap = {} 
        out = [] 
        sum1 = 0
        
        for i in range(n):
            sum1 += arr[i] 
            
            if sum1 == 0: 
                out.append((0, i))
                c+=1
            al = [] 
            
            if sum1 in hashMap: 
                  
                al = hashMap.get(sum1) 
                for it in range(len(al)): 
                    out.append((al[it] + 1, i))
                    c+=1
                    
            al.append(i) 
            hashMap[sum1] = al 
                
        return c

#{ 
 # Driver Code Starts
#Initial Template for Python 3

#contributed by RavinderSinghPB
        
if __name__=='__main__':
    t=int(input())
    for tc in range(t):
        
        N=int(input())
        A = [int(x) for x in input().strip().split(' ')]
        ob = Solution()
        print(ob.findSubArrays(A,N))
        
                
                
# } Driver Code Ends