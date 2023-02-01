//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Node
{
private:
    Node *links[26];
    bool flag = false;

public:
    bool containsKey(char ch)
    {
        return (links[ch - 'a'] != NULL);
    }

    void set(char ch, Node *node)
    {
        this->links[ch - 'a'] = node;
    }

    Node *get(char ch)
    {
        return links[ch - 'a'];
    }

    void setEnd()
    {
        flag = true;
    }

    bool isEnd()
    {
        return flag;
    }
};

class Trie
{
private:
    Node *root;

public:
    Trie() : root(new Node()){};
    void insert(string word)
    {
        Node *node = root;
        for (int i = 0; i < word.size(); i++)
        {
            if (!node->containsKey(word[i]))
            {
                node->set(word[i], new Node());
            }

            node = node->get(word[i]);
        }
        node->setEnd();
    }

    string bfs()
    {
        Node *node = root;
        queue<pair<Node *, string>> q;
        string ans;
        char pre;
        string temp = "";
        q.push(make_pair(node, ""));
        while (!q.empty())
        {
            int sz = q.size();

            for (int i = 0; i < sz; i++)
            {
                Node *cur = q.front().first;
                string s = q.front().second;
                q.pop();

                if (cur != root && !cur->isEnd())
                    continue;
                for (int j = 0; j < 26; j++)
                {
                    char ch = char(j + 'a');
                    if (cur->get(ch))
                    {
                        q.push(make_pair(cur->get(ch), s + ch));
                    }
                }
                if (ans.length() < s.length())
                {
                    ans = s;
                }
            }
        }
        return ans;
    }
};
class Solution
{
public:
    string longestString(vector<string> &words)
    {
        string ans;
        Trie *trie = new Trie();
        for (string w : words)
        {
            trie->insert(w);
        }
        ans = trie->bfs();
        return ans;
    }
};

//{ Driver Code Starts.

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        vector<string> v(n);
        for (int i = 0; i < n; i++)
        {
            cin >> v[i];
        }
        Solution obj;
        string w = obj.longestString(v);
        cout << w << "\n";
    }
    return 0;
}

// } Driver Code Ends