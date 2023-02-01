# **Maximum Profit By Choosing A Subset Of Intervals**

## **Medium**

Given a list **intervals** of **n** intervals, the **ith** element **\[s, e, p\]** denotes the starting point **s**, ending point **e**, and the profit **p** earned by choosing the **ith** interval. Find the maximum profit one can achieve by choosing a subset of non-overlapping intervals.

Two intervals **\[s1, e1, p1\]** and **\[s2, e2, p2\]** are said to be non-overlapping if **\[e1 &lt;= s2\]** and **\[s1 &lt; s2\]**.

**Example 1:**

```
Input:
n = 3
intervals = {
{1, 2, 4},
{1, 5, 7},
{2, 4, 4}
}
Output:
8
Explanation:
One can choose intervals [1, 2, 4] and [2, 4, 4] for a 
profit of 8.
```

**Example 2:**

```
Input:
n = 3
intervals = {
{1, 4, 4},
{2, 3, 7},
{2, 3, 4}
}
Output:
7
Explanation:
One can choose interval [2, 3, 7] for a profit of 7.
```

**Your Task:**

You don't need to print or output anything. Complete the function **maximum\_profit()** which takes an integer **n** and a 2D integer array **intervals** and returns an integer, denoting the maximum profit which one can get by choosing the non-overlapping intervals.

**Constraints:**

- 1 &lt;= n and n &lt;= 10^4
- 1 &lt;= starting point of **ith** interval &lt; ending point of **ith** interval &lt;= 10^5
- 1 &lt;= profit earned by choosing **ith** interval &lt;= 10^5

> ### **Problem URL: [Maximum Profit By Choosing A Subset Of Intervals](https://practice.geeksforgeeks.org/problems/649205908e04ac00f303626fa845261318adfa8f/1)**