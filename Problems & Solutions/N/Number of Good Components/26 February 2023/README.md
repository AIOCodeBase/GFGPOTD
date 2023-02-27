# **Number of Good Components**

## **Medium**

Given an undirected graph with V vertices(numbered from 1 to V) and E edges. Find the number of good components in the graph.  
A component of the graph is good if and only if the component is a fully connected component.  
Note: A fully connected component is a subgraph of a given graph such that there's an edge between every pair of vertices in a component, the given graph can be a disconnected graph. Consider the adjacency list from index 1.

**Example 1:**

Input:

![SP](https://media.geeksforgeeks.org/img-practice/good_comp_1-1656905170.png)

Output: 1  
Explanation: We can see that there is only one   
component in the graph and in this component   
there is a edge between any two vertces.

**Example 2:**

Input:

![graph](https://user-images.githubusercontent.com/97666287/221418276-c0e3ccf4-77ff-4328-adbb-637db0505361.png)

Output: 2  
Explanation: We can see that there are 3 components  
in the graph. For 1-2-7 there is no edge between  
1 to 7, so it is not a fully connected component.  
Rest 2 are individually fully connected component.   

**Your Task:**  

You don't need to read input or print anything. Your task is to complete the function
findNumberOfGoodComponent() which takes an integer V and an adjacency list adj as input parameters and returns an integer denoting the number of good components.

**Expected Time Complexity:** O(V+E)  
**Expected Space Complexity:** O(depth of the graph)    

**Constraints:**

1 ≤ V, E ≤ $10^4$       

> ### **Problem URL: [Number of Good Components](https://practice.geeksforgeeks.org/problems/1a4b617b70f0142a5c2b454e6fbe1b9a69ce7861/1)**
