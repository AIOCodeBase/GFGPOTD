# **Check if it is possible to convert one string into another with given constraints**

## **Easy**

Given two strings S and T, which contains three characters i.e **'A', 'B'** and **'#'** only. Check whether it is possible to convert the first string into another string by performing following operations on string first.  
1- A can move towards Left only  
2- B can move towards Right only  
3- Neither A nor B should cross each other  
**Note:** Moving i'th character towards Left one step means swap i'th with (i-1)'th charecter \[ i-1&gt;=0 \]. Moving i'th character towards Right one step means swap i'th with (i+1)'th charecter \[ i+1&lt; string's length \].

**Example 1:**

```
Input:
S=#A#B#B#
T=A###B#B
Output:
1
Explanation:
A in S is right to the A in T
so A of S can move easily towards
the left because there is no B on
its left positions and for first B
in S is left to the B in T so B
of T can move easily towards the
right because there is no A on its
right positions and it is same for
next B so S can be easily converted
into T.
```

**Example 2:**

```
Input:
S=#A#B#
T=#B#A#
Output:
0
Explanation:
Here first A in S is left to the
A in T and according to the condition,
A cant move towards right,so S cant
be converted into T.
```

**Your Task:**  
You don't need to read input or print anything. Your task is to complete the function **isItPossible()** which takes the two strings S, T and their respective lengths M and N as input parameters and returns 1 if S can be converted into T. Otherwise, it returns 0.

**Expected Time Complexity:** O(M+N) where M is size of string S and N is size of string T.  
**Expected Auxillary Space:** O(1)

**Constraints:**  
1&lt;=M,N&lt;=100000

> ### **Problem URL: [Check if it is possible to convert one string into another with given constraints](https://practice.geeksforgeeks.org/problems/check-if-it-is-possible-to-convert-one-string-into-another-with-given-constraints4116/1)**
