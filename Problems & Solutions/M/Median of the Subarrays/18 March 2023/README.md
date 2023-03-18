# **Median of the Subarrays**

## **Hard**

Given an array A[] of N integers and an integer M. The task is to count the number of subarrays which have median M.
Median of an array is defined as below:

1. If N is odd, the median value is the number that is in the middle after sorting the array.
2. if N is even, the median value is the left of the two middle numbers after sorting the array. 

**Example 1:**

```
Input:
N = 5, M = 2
A[] = {2, 1, 3, 5, 4}
Output: 
3
Explanation: 
The subarrays which has median equal to M
are [2], [2,1,3] and [2,1,3,5]
```

**Example 2:**

```
Input:
N = 1, M = 1
A[] = {1}
Output: 
1
Explanation: 
The subarrays which has median equal to M
is [1].
```

**Your Task:**  

You don't need to read input or print anything. Complete the function countSubarray( ) which takes the integer N , the array A[], and the integer M as input parameters and returns the number of subarays. 

**Expected Time Complexity:** O(N)  
**Expected Space Complexity:** O(N)    

**Constraints:**

1 ≤ N ≤ $10^5$  
1 ≤ A[] ≤ N  
1 ≤ M ≤ N  

> ### **Problem URL: [Median of the Subarrays](https://practice.geeksforgeeks.org/problems/6f08220ca3b871be594f50f7f56a9ef2799cb485/1)**
