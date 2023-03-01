# **Update Queries**

## **Medium**

You are given an array of n elements, initially all a[i] = 0. Q queries need to be performed. Each query contains three integers l, r, and x  and you need to change all a[i] to (a[i] | x) for all l ≤ i ≤ r.

Return the array after executing Q queries.

**Example 1:**

```
Input:
N=3, Q=2
U=[[1, 3, 1],
   [1, 3, 2]]

Output:
a[]={3,3,3}

Explanation: 
Initially, all elements of the array are 0. After execution of the
first query, all elements become 1 and after execution of the 
second query all elements become 3.
```

**Example 2:**

```
Input:
N=3, Q=2
U=[[1, 2, 1],
   [3, 3, 2]]

Output:
a[]={1,1,2}

Explanantion:
[0,0,0] => [1,1,0] => [1,1,2]
```

**Your Task:**  

You don't need to read input or print anything. Your task is to complete the function updateQuery() which takes the integer N,Q, and U a QX3 matrix containing the Q queries where U[i][0] is li, U[i][1] is ri andU[i][2] is xi.and it returns the final array a.

**Expected Time Complexity:** O(N)  
**Expected Space Complexity:** O(N)    

**Constraints:**

1<=N<=10^5  
1<=Q<=10^5  
1<=U[i][0] <= U[i][1]<=N  
1<= U[i][2] <=10^5      

> ### **Problem URL: [Update Queries](https://practice.geeksforgeeks.org/problems/a6528c893d4ab645ec6e0690c7982748385099c8/1)**
