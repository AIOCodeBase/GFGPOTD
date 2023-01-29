class Solution:
  def solve(self, a : int, b : int) -> int:
        ans = a & b
        count =0
        
        while( a!= b):
            x= a
            a = a & ans
            if( a==b):
                count+=1
                return count
            if( x!=a): # if appliying and operation does change it 
                count+=1
            
            
            y=b
            b = b & ans
            if( a==b ):
                count+=1
                return count
                
            if( y !=b):# if appliying and operation does change it
                count+=1
                
        return count
 
#{ 
 # Driver Code Starts
if __name__=="__main__":
    t = int(input())
    for _ in range(t):
        
        a = int(input())
        
        
        b = int(input())
        
        obj = Solution()
        res = obj.solve(a, b)
        
        print(res)
        

# } Driver Code Ends
