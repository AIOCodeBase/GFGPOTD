//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

/* A binary tree node has data, pointer to left
child and a pointer to right child */
class Node
{
public:
    int data;
    Node *left, *right;
    Node(int data)
    {
        this->data = data;
        this->left = this->right = NULL;
    }
};

/* This function is to print the inorder of the tree  */
void inorder(Node *root)
{
    if (root == NULL)
        return;
    inorder(root->left);
    printf("%d ", root->data);
    inorder(root->right);
}



// } Driver Code Ends
//User function Template for C++

/*
class Node
{
public:
    int data;
    Node *left, *right;
    Node(int data)
    {
        this->data = data;
        this->left = this->right = NULL;
    }
};
*/


class Solution{
public:
    map<int, int> mapping;
    void mapOpenToClose(string str)
    {
        stack<int> s;
        for (int i = 0; i < str.length(); i++)
        {
            if (str[i] == '(')
            {
                s.push(i);
            }
            else if (str[i] == ')')
            {
                mapping[s.top()] = i;
                s.pop();
            }
        }
    }
    
    bool isDigit(char d)
    {
        return (d >= '0' && d <= '9');
    }
    
    Node *treeFromString(string str, int si, int ei)
    {
        // Base case
        if (si > ei)
            return NULL;

        int num = 0;
        while (si < str.length() && isDigit(str[si]))
        {
            num = num * 10 + (str[si] - '0');
            si++;
        }
        si--;
        // new root
        Node *root = new Node(num);
        int index = -1;

        // if next char is '(' find the index of
        // its complement ')'
        if (si + 1 <= ei && str[si + 1] == '(')
            index = mapping[si + 1];

        // if index found
        if (index != -1)
        {

            // call for left subtree
            root->left = treeFromString(str, si + 2, index - 1);

            // call for right subtree
            root->right = treeFromString(str, index + 2, ei - 1);
        }
        return root;
    }
    // function to construct tree from string
    Node *treeFromString(string str)
    {
       mapOpenToClose(str);
       return treeFromString(str, 0, str.length() - 1);
    }
};

//{ Driver Code Starts.

// Driver Code
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        string str;
        cin >> str;
        Solution obj;
        Node *root = obj.treeFromString(str);
        inorder(root);
        cout << "\n";
    }
    return 0;
}

// } Driver Code Ends