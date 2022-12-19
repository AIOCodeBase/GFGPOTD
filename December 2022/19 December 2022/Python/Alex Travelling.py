from heapq import *
from typing import List
class Solution:
    def minimumCost(self, flights: List[List[int]], n : int, k : int) -> int:
        graph = {i: [] for i in range(1, n + 1)}
        
        for flight in flights:
            source, target, time = flight
            graph[source].append((time, target))
        res = 0
        
        min_heap = [(0, k)]
        visited = set()
        
        while min_heap:
            min_time, node = heappop(min_heap)
            if node in visited:
                continue
            visited.add(node)
          
            res = min_time
            
            neighbors = graph[node]
            for neighbor in neighbors:
                n_time, n_node = neighbor
                if n_node not in visited:
                    heappush(min_heap, (n_time + min_time, n_node))
        
        return res if len(visited) == n else -1

#{ 
 # Driver Code Starts
#Initial Template for Python 3

    
if __name__=="__main__":
    T = int(input())
    for t in range(T):
        
        n = int(input())
        k = int(input())
        m = int(input())
        flights = []
        for i in range(m):
            u, v, wt = map(int, input().strip().split())
            flights.append([u, v, wt])
        obj = Solution()
        ans = obj.minimumCost(flights, n, k)
        print(ans)
            

# } Driver Code Ends