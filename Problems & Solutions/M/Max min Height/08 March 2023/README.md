# **Max min Height**

## **Hard**

You have a garden with n flowers lined up in a row. The height of ith flower is ai units. You will water them for k days. In one day you can water w continuous flowers (you can do this only once in a single day). Whenever you water a flower its height increases by 1 unit. You need to maximize the height of the smallest flower all the time.

**Example 1:**

```
Input:
n=6
k=2
w=3
a[]={2,2,2,2,1,1}
Output:
2
Explanation:
Water last three flowers for first day & 
first three flowers for second day.The 
new heights will be {3,3,3,3,2,2}
```

**Example 2:**

```
Input:
n=2
k=5
w=1
a[]={5,8}
Output:
9
Explanation:
For the first four days water the first flower then
water the last flower once.
```

**Your Task:**  

You don't need to read input or print anything. Your task is to complete the function maximizeMinHeight() which takes the array a[], its size N, integer K, and an integer W as input parameters and returns the maximum height possible for the smallest flower.

**Expected Time Complexity:** O(NLogN)  
**Expected Space Complexity:** O(1)    

**Constraints:**

1 <= n<= $10^5$  
1<=w<=n  
1<=k<= $10^5$  
1 <= a[i] <= $10^9$ 

> ### **Problem URL: [Max min Height](https://practice.geeksforgeeks.org/problems/899540d741547e2d75d1c5c03a4161ab53affd13/1)**
