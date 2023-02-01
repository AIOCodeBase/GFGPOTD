# **Select Nodes**

## **Hard**

Given **N** nodes of a tree and a list of edges. Find the minimum number of nodes to be selected to light up all the edges of the tree.
An edge lights up when at least one node at the end of the edge is selected.

**Example 1:**

```
Input:
N = 6
edges[] = {(1,2), (1,3), (2,4), (3,5), (3,6)}
Output: 2
Explanation: Selecting nodes 2 and 3 lights
up all the edges.
```

  
**Example 2:**

```
Input:
N = 3
arr[] = {(1,2), (1,3)}
Output: 1
Explanation: Selecting Node 1 
lights up all the edges.
```

  
**Your Task:**   
You don't need to read input or print anything. Your task is to complete the function **countVertex()** which takes the number of nodes N, and the list of edges as input parameters and returns the minimum number of nodes selected.



**Expected Time Complexity:** O(N)   
**Expected Auxiliary Space:** O(N)  

  
**Constraints:**  
1 ≤ N ≤ 10^5  
1 ≤ edges ≤ N  
Given graph is a valid tree.

> ### **Problem URL: [Select Nodes](https://practice.geeksforgeeks.org/problems/f7bfa137576243795abb0595962d61b632bbad21/1)**
