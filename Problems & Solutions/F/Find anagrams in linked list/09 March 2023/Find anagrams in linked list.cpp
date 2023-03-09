//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

struct Node {
    char data;
    struct Node *next;

    Node(char x) {
        data = x;
        next = NULL;
    }
};

void printList(Node *node) {
    while (node != NULL) {
        cout << node->data << " ";
        node = node->next;
    }
    cout << endl;
}

struct Node *inputList() {
    int n; // length of link list
    scanf("%d ", &n);

    char data;
    cin >> data;
    struct Node *head = new Node(data);
    struct Node *tail = head;
    for (int i = 0; i < n - 1; ++i) {
        cin >> data;
        tail->next = new Node(data);
        tail = tail->next;
    }
    return head;
}


// } Driver Code Ends
/*

Definition for singly Link List Node
struct Node
{
    char data;
    Node* next;
    Node(int x) {  data = x;  next = NULL; }
};

You can also use the following for printing the link list.
printList(Node* node);
*/

class Solution {
  public:
    vector<Node*> findAnagrams(struct Node* head, string s) {
        vector<Node*> ans;
        Node* start=head,*end=head;
        int n=s.length();
        
        // pattern string
        unordered_map<char,int> mp1;
        for(auto it:s) mp1[it]++;
        int count1=mp1.size();
        
        // traversing string
        unordered_map<char,int> mp2;
        int count2=0;
        while(end!=NULL)
        {
            mp2[end->data]++;
            if(mp1[end->data]==mp2[end->data]) count2++;
            
            while(mp2[end->data]>mp1[end->data])
            {
                if(mp2[start->data]==mp1[start->data]) count2--;
                mp2[start->data]--;
                start=start->next;
            }
        
            if(count2==count1)
            {
                ans.push_back(start);
                Node* ahead=end->next;
                end->next=NULL;
                start=ahead,end=ahead;
                mp2.clear();
                count2=0;
            }
            else
                end=end->next;
        }
        return ans;
    }
};


//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {

        struct Node *head = inputList();

        string s;
        cin >> s;

        Solution obj;
        vector<Node *> res = obj.findAnagrams(head, s);

        for (int i = 0; i < res.size(); i++) {
            printList(res[i]);
        }

        if (res.size() == 0) cout << "-1\n";
    }
}

// } Driver Code Ends
