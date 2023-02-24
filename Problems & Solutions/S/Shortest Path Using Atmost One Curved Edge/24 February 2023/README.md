# **Shortest Path Using Atmost One Curved Edge**

## **Hard**

Given an undirected connected graph of n vertices and list of m edges in a graph and for each pair of vertices that are connected by an edge. 

There are two edges between them, one curved edge and one straight edge i.e. the tuple (x, y, w1, w2) means that between vertices x and y, there is a straight edge with weight w1 and a curved edge with weight w2.

You are given two vertices a and b and you have to go from a to b through a series of edges such that in the entire path you can use at most 1 curved edge. Your task is to find the shortest path from a to b satisfying the above condition. If there is no path from a to b, return -1.
   
**Example 1:**

Input:  
n = 4, m = 4  
a = 2, b = 4  
edges = {{1, 2, 1, 4}, {1, 3, 2, 4},
         {1, 4, 3, 1}, {2, 4, 6, 5}}  
Output:  
2  
![SP](https://user-images.githubusercontent.com/97666287/221103243-51d90313-3704-4902-b2a5-efe6d5937dd6.png)  
Explanation:  
We can follow the path 2 -> 1 -> 4.  
This gives a distance of 1+3 = 4 if we follow  
all straight paths. But we can take the curved  
path  from 1 -> 4, which costs 1. This  
will result in a cost of 1+1 = 2

**Example 2:**

Input:  
n = 2, m = 1  
a = 1, b = 2  
edges = {{1, 2, 4, 1}}  
Output :  
1  
![SP1](https://user-images.githubusercontent.com/97666287/221103598-35a77505-10bc-4107-b61b-18d0fcaa1e33.png)  
Explanation:  
Take the curved path from 1 to 2 which costs 1. 

**Your Task:**  

You don't need to read input or print anything. Your task is to complete the function shortestPath() which takes 4 integers n, m, a, and b, and a list of lists named edges of size m as input and returns the cost of shortest path from a to b.

**Expected Time Complexity:** O((m+n)log(n))  
**Expected Space Complexity:** O(n+m)    

**Constraints:**

1 ≤ n,m ≤ $10^5$  
1 ≤ a,b ≤ n  
weight of edges ≤ $10^4$     

> ### **Problem URL: [Shortest Path Using Atmost One Curved Edge](https://practice.geeksforgeeks.org/problems/e7d81a082cda6bd1e959d943197aa3bc21b88bdb/1)**
