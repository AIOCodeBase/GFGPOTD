# **Length of the longest subarray with positive product**

## **Medium**

Given an array **arr[]** consisting of **n** integers, find the length of the longest subarray with **positive (non zero) product**. 

**Example 1:**

```
Input:
arr[] ={0, 1, -2, -3, -4} 
Output:
3
Explanation: 
The longest subarray with positive product is: 
{1, -2, -3}.Therefore, the required length is 3.
```

**Example 2:**

```
Input:
arr[]={-1, -2, 0, 1, 2}
Output:
2
Explanation:
The longest subarray with positive products 
are: {-1, -2}, {1, 2}. Therefore, the required 
length is 2.
```

**Your Task:**  
This is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function **maxLength()** that takes array **arr[]**, and an integer **n** as parameters and return the length of the longest subarray where the product of all of its element is positive. 

**Expected Time Complexity:** O(N)  
**Expected Auxiliary Space:** O(1)

**Constraints:**  
 1<=n<=$10^5$  
$-10^9$<=arr[i]<=$10^9$   

> ### **Problem URL: [Length of the longest subarray with positive product](https://practice.geeksforgeeks.org/problems/4dfa8ba14d4c94f4d7637b6b5246782412f3aeb8/1)**