# **Shortest Prime Path**

## **Medium**

You are given two four digit prime numbers **Num1** and **Num2.** Find the distance of the shortest path from Num1 to Num2 that can be attained by altering only one single digit at a time. Every number obtained after changing a digit should be a four digit prime number with no leading zeros.

  
**Example 1:**

```
Input:
Num1 = 1033 
Num2 = 8179
Output: 6
Explanation:
1033 -> 1733 -> 3733 -> 3739 -> 3779
                 -> 8779 -> 8179.
There are only 6 steps required to reach
Num2 from Num1, and all the intermediate
numbers are 4 digit prime numbers.
```

**Example 2:**

```
Input:
Num1 = 1033 
Num2 = 1033
Output:
0
```

  
**Your Task:**   
You don't need to read input or print anything. Your task is to 

1. Complete the **constructor of the class Solution** to precompute a list of prime numbers. 
2. Complete function **shortestPath**() which takes two integers Num1 and Num2 as input parameters and returns the distance of the shortest path from Num1 to Num2. If it is unreachable then return -1.

  
**Expected Time Complexity:** O(NlogN)  
**Expected Auxiliary Space:** O(N)

  
**Constraints:**  
1000  ≤ Num1,Num2  ≤ 9999  
Num1 and Num2 are prime numbers.

> ### **Problem URL: [Shortest Prime Path](https://practice.geeksforgeeks.org/problems/1646a9b5169d7571cf672f2a31533af083d1f479/1)**