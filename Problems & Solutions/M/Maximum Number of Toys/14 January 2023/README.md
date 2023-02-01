# **Maximum Number of Toys**

## **Hard**

You are given N toys in a shop .
The cost of each toy is represented by an array A[]. You are given Q queries, For ith query, You have a C amount of money which you can use to purchase the toys. Also there are K broken toys and you won't purchase them. The task is to calculate the maximum number of toys you can purchase using the C amount of money.

Note: 1 based indexing is used. Each query is treated independently.
Query definition: The first element represents an integer C where C=Queries[i][0].
The second element represents an integer K, where K = Queries[i][1].
The next K integers represent the indices of broken toys which are Queries[i][j] ,j>1

**Example 1:**

```
Input:
N = 5
A[] = {8, 6, 9, 2, 5}
Q = 2
Query[][] = {{12,2,3,4},{30,0}}
Output:
2 5
Explanation:
Query 1: C = 12, K = 2 , 
Indices of Broken toys is {3,4}
Indices of Available toys are {1,2,5}
If we purchase the toys 2 and 5 , 
then cost = A[2]+A[5]= 6+5 = 11,
Therefore,We purchase the 2 toys 
using 11 amount of money.
Query 2: C = 30, K = 0
There is no broken toy. 
We can purchase all toys,
cost = A[1]+A[2]+A[3]+A[4]+A[5]= 30
Therefore,We purchase the 5 toys
using 30 amount of money.
```

**Example 2:**

```
Input:
Input:
N = 2
A[] = {3,3}
Q = 1
Query[][] = {{1,0}}
Output:
0
Explanation:
Query 1: C = 1, K = 0 , 
There is no broken toy. 
We have not enough amount to purchase 
any toy.
```

**Your Task:**  
You don't need to read input or print anything. Your task is to complete the function maximumToys() which takes the integer N and array A[ ],  integer Q and 2D array Queries[][] as input parameters and returns the array of answers of each query.

**Expected Time Complexity:** O(NLogMx + Q*K*LogMx + Q*(LogMx)2)  
**Expected Auxiliary Space:** O(Mx)

**Constraints:**  
1 ≤ N ≤ 105
1 ≤ A[i] ≤ 106
1 ≤ Q ≤ 104
1 ≤ C ≤ 109
0 ≤ K ≤ 10
1 ≤ Queries[i][j] ≤ N, j>1

> ### **Problem URL: [Maximum number of toys](https://practice.geeksforgeeks.org/problems/maximum-number-of-toys/1)**
