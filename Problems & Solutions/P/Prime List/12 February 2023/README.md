# **Prime List**

## **Medium**

You are given the head of a linked list. You have to replace all the values of the nodes with the nearest **prime** number. If more than one prime number exists at an equal distance, choose the **smallest** one.

**Example 1:**

```
Input:
2 → 6 → 10
Output:
2 → 5 → 11
Explanation:
The nearest prime of 2 is 2 itself.
The nearest primes of 6 are 5 and 7,
since 5 is smaller so, 5 will be chosen.
The nearest prime of 10 is 11.
```

**Example 2:**

```
Input:
1 → 15 → 20
Output:
2 → 13 → 19
Explanation:
The nearest prime of 1 is 2.
The nearest primes of 15 are 13 and 17,
since 13 is smaller so, 13 will be chosen.
The nearest prime of 20 is 19.
```

**Your Task:**  
The task is to complete the function **primeList()** which contains a reference to the head as the only argument. This function should return the head of the modified linked list.

**Expected Time Complexity:** O(number of nodes * sqrt(value of node))  
**Expected Space Complexity:** O(1)  

**Constraints:**

1 ≤ Number of Nodes ≤ $10^4$  
1 ≤ Value on Node ≤ $10^4$  

> ### **Problem URL: [Prime List](https://practice.geeksforgeeks.org/problems/6cb0782855c0f11445b8d70e220f888e6ea8e22a/1)**
