class Solution():
    def issafe(self, m, n, i, j):
     
      if (i < 0):
        return False
      if (j < 0):
        return False
      if (i >= m):
        return False
      if (j >= n):
        return False
     
      return True

    def endPoints(self, matrix, R, C):
      i = 0
      j = 0
      current_i = 0
      current_j = 0
      current_d = 'r'
     
      rcd = {'l':'u','u':'r','r':'d','d':'l'}
     
      while (self.issafe(R, C, i, j)):
        current_i = i
        current_j = j
     
        if (matrix[i][j] == 1):
     
          move_in = rcd.get(current_d)
          matrix[i][j] = 0
     
          if (move_in == 'u'):
            i -= 1
          elif(move_in == 'd'):
            i += 1
          elif(move_in == 'l'):
            j -= 1
          elif(move_in == 'r'):
            j += 1
     
          current_d = move_in
     
        else:
          if (current_d == 'u'):
            i -= 1
          elif(current_d == 'd'):
            i += 1
          elif(current_d == 'l'):
            j -= 1
          elif(current_d == 'r'):
            j += 1
     
      return [current_i, current_j]

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        r,c = map(int, input().strip().split())
        matrix = []
        for i in range(r):
            line = [int(x) for x in input().strip().split()]
            matrix.append(line)
        ob = Solution()
        ans = ob.endPoints(matrix,r,c)
        print('(',ans[0],', ',ans[1],')',sep ='')

# } Driver Code Ends