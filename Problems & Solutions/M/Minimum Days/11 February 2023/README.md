# **Minimum Days**

## **Medium**

Given a string S of length N containing only lowercase alphabets. You are also given a permutation P of length N containing integers from 0 to N-1. In (i+1)'th day you can take the P[i] value of the permutation array and replace S[P[i]] with a '?'.

For example in day 1, we can choose index of permutation array is i=0 and replace S[P[0]] with '?'.  
Similarly in day 2, we can choose index of permutation array is i=1. You can replace S[P[1]] with '?'.  
Similarly in day 3,we can choose index of permutation array is i=2. You can replace S[P[2]] with '?'.  

You have to tell the minimum number of days required, such that after it for all index i (0<=i<N-1), if S[i]!='?', then S[i]!=S[i+1].

**Example 1:**

```
Input:
N = 4
S = "aabb"
P[] = {2, 1, 3, 0}
Output: 2
Explanation: In day 1, we replace S[P[0]] with '?'. 
After that String S = "aa?b". As we can see S 
still has character 'a' at index 0 and 1.
In day 2, we replace S[P[1]] with '?'. After 
that String S = "a??b". As we can see the String 
has for all index i (0<=i<N-1), if S[i]!='?', then S[i]!=S[i+1].
```

**Example 2:**

```
Input:
N = 4
S = "abca"
P[] = {3, 0, 2, 1}
Output: 0
Explanation: We can see that the initial string 
S = "abca" has for all index i (0<=i<N-1), if S[i]!='?', then S[i]!=S[i+1].
```

**Your Task:**  
You don't need to read input or print anything. Your task is to complete the function getMinimumDays() which takes the string S, array P[] and its size N as input parameters and returns the minimum number of days required such that string satisfies with the condition given earlier.

**Expected Time Complexity:** O(n)  
**Expected Auxiliary Space:** O(1)

**Constraints:**  
1 <= N <= $10^5$  
0 <= P[i] <= N-1  
S contains only lowercase alphabets.  

> ### **Problem URL: [Minimum Days](https://practice.geeksforgeeks.org/problems/f4d22b1f9d62e8bee0ff84e9fa51dc66eb5005ec/1)**
