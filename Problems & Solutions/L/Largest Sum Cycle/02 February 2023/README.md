# **Largest Sum Cycle**

## **Hard**

Given a maze with **N** cells. Each cell may have multiple entry points but not more than one exit(i.e entry/exit points are unidirectional doors like valves).
You are given an array **Edge[]** of **N** integers, where Edge[i] contains the cell number that can be reached from of cell i in one step. Edge[i] is -1 if the ith cell doesn't have an exit. 
The task is to find the largest sum of a cycle in the maze(Sum of a cycle is the sum of the cell indexes of all cells present in that cycle).

Note:The cells are named with an integer value from 0 to N-1. **If there is no cycle in the graph then return -1**.

**Example 1:**

```
Input:
N = 4
Edge[] = {1, 2, 0, -1}
Output: 3
Explanation: 
There is only one cycle in the graph.
(i.e 0->1->2->0)
Sum of the cell index in that cycle 
= 0 + 1 + 2 = 3.
```

  
**Example 2:**

```
Input:
N = 4 
Edge[] = {2, 0, -1, 2}
Output: -1
Explanation:
1 -> 0 -> 2 <- 3
There is no cycle in the graph.
```

  
**Your Task:**   
You dont need to read input or print anything. Your task is to complete the function **largestSumCycle()** which takes the integer N denoting the number of cells and the array Edge[] as input parameters and returns the sum of the largest sum cycle in the maze.

**Expected Time Complexity:** O(N)   
**Expected Auxiliary Space:** O(N)  

  
**Constraints:**  
1 ≤ N ≤ 10^5  
-1 < Edge[i] < N  
Edge[i] != i  

> ### **Problem URL: [Largest Sum Cycle](https://practice.geeksforgeeks.org/problems/51afa710a708c0681748445b509696dd588d5c40/1)**
