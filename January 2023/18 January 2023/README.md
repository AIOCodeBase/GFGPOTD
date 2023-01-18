# **Find the first node of loop in linked list**

## **Easy**

Given a singly linked list of N nodes. Find the first node of the loop if the linked list has a loop. If a loop is present return the node data of the first node of the loop else return -1.

**Example 1:**


Input:  
![alt text](https://media.geeksforgeeks.org/wp-content/uploads/20211123204900/lloop-300x105.jpg)  
Output: 3  
Explanation:  
We can see that there exists a loop   
in the given linked list and the first  
node of the loop is 3.


**Example 2:**


Input:  
![alt text](https://media.geeksforgeeks.org/wp-content/uploads/20211123223611/lloop2-300x87.jpg)    
Output: -1  
Explanation: No loop exists in the above  
linked list.So the output is -1.

  
**Your Task:**   
The task is to complete the function findFirstNode() which contains reference to the head as only argument. This function should return the value of the first node of the loop if the linked list contains a loop, else return -1.

**Expected Time Complexity:** O(N)   
**Expected Auxiliary Space:** O(1)

  
**Constraints:**    
1 <= N <= 10^5  
1 <= Data on Node <= 10^6   
0 <= pos <= N

> ### **Problem URL: [Find the first node of loop in linked list](https://practice.geeksforgeeks.org/problems/44bb5287b98797782162ffe3d2201621f6343a4b/1)**
