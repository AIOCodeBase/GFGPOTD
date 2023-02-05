# **Intersection Point in Y Shaped Linked Lists**

## **Medium**

Given two singly linked lists of size **N** and **M**, write a program to get the point where two linked lists intersect each other.

**Example 1:**

Input:
LinkList1 = 3->6->9->common  
LinkList2 = 10->common  
common = 15->30->NULL  
Output: 15  
Explanation:  
![img](https://contribute.geeksforgeeks.org/wp-content/uploads/linked.jpg)

**Example 2:**

```
Input: 
Linked List 1 = 4->1->common
Linked List 2 = 5->6->1->common
common = 8->4->5->NULL
Output: 8
Explanation: 

4              5
|              |
1              6
 \             /
  8   -----  1 
   |
   4
   |
  5
  |
  NULL       
```

**Your Task:**  
You don't need to read input or print anything. The task is to complete the function intersetPoint() which takes the pointer to the head of linklist1(head1) and linklist2(head2) as input parameters and returns data value of a node where two linked lists intersect. If linked list do not merge at any point, then it should return -1.
Challenge : Try to solve the problem without using any extra space.

**Expected Time Complexity:** O(N+M)  
**Expected Auxiliary Space:** O(1)

**Constraints:**  
1 ≤ N + M ≤ $2*10^5$  
-1000 ≤ value ≤ 1000  

> ### **Problem URL: [Intersection Point in Y Shaped Linked Lists](https://practice.geeksforgeeks.org/problems/eae1fbd0ac8f213a833d231e26ba4d829e79dd9c/1)**
