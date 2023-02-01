def check(self, mid, array, n, K):
        count = 0
        sum = 0
        for i in range(n):
             
            # If individual element is greater
            # maximum possible sum
            if (array[i] > mid):
                return False
     
            # Increase sum of current sub - array
            sum += array[i]
     
            # If the sum is greater than
            # mid increase count
            if (sum > mid):
                count += 1
                sum = array[i]
        count += 1
     
        # Check condition
        if (count <= K):
            return True
        return False
        
    def splitArray(self, arr, N, K):
        
        start = max(arr)
        end = sum(arr)
     
        # Answer stores possible
        # maximum sub array sum
        answer = 0
        while (start <= end):
            mid = (start + end) // 2
     
            # If mid is possible solution
            # Put answer = mid;
            if (self.check(mid, arr, N, K)):
                answer = mid
                end = mid - 1
            else:
                start = mid + 1
     
        return answer