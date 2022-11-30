# **Reorder List**

## **Hard**

Given a singly linked list*: A*0→*A*1→...→*A\*\*n*-2→*A*n-1, reorder it to: *A*0→*A\*\*n-1*→*A*1→*A\*\*n*-2→*A*2→*A\*\*n*-3→...  
For example: Given 1-&gt;2-&gt;3-&gt;4-&gt;5 its reorder is 1-&gt;5-&gt;2-&gt;4-&gt;3.

**Note: It is recommended do this in-place without altering the node's values.**

**Example 1:**

```
Input:
LinkedList: 1->2->3
Output: 1 3 2
Explanation:
Here n=3, so the correct
order is A0→A2→A1
```

**Example 2:**

```
Input:
Explanation: 1->7->3->4
Output: 1 4 7 3
Explanation:
Here n=4, so the correct
order is A0→A3→A1→A2
```

**Your Task:**  
The task is to complete the function **reorderList**() which should reorder the list as required. The reorder list is automatically printed by the driver's code.

**Note**: Try to solve without using any auxilliary space.

**Expected Time Complexity:** O(N)  
**Expected Auxiliary Space:** O(1)

**Constraints:**

1 &lt;= N &lt;= 5\*10^5  
1 &lt;= A\[ i \] &lt;= 10^5

> ### **Problem URL: [Reorder List](https://practice.geeksforgeeks.org/problems/reorder-list/1)**
