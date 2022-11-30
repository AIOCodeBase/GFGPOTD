//{ Driver Code Starts
#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <bits/stdc++.h>
using namespace std;
/* Linked list Node */
struct Node {
    int data;
    struct Node* next;

    Node(int x) {
        data = x;
        next = NULL;
    }
};



// } Driver Code Ends
/* Following is the Linked list node structure */

/*
struct Node
{
    int data;
    struct Node* next;

    Node(int x){
        data = x;
        next = NULL;
    }
};
*/

class Solution{ 
public:
    
    void reorderList(struct Node* head) {
        int r = 0, c;
        struct Node* temp, *temp1, *temp2, *p;
        temp = head;

        if (head == NULL || head->next == NULL || head->next->next == NULL) return;

        while (temp != NULL) {
            r++;
            temp = temp->next;
        }

        c = (r + 1) / 2;

        temp = head;
        while (c--) {
            p = temp;
            temp = temp->next;
        }

        p->next = NULL;

        temp1 = NULL;
        temp2 = temp;

        while (temp2 != NULL) {
            p = temp2->next;
            temp2->next = temp1;
            temp1 = temp2;
            temp2 = p;
        }

        p = temp1;
        Node *a, *b;
        while (p) {
           a = head->next;
           b = p->next;
           
           head->next=p;
           p->next=a;
           
           head=a;
           p=b;
        }
    }
};

//{ Driver Code Starts.



/* Function to create a new Node with given data */
struct Node* newNode(int data) {
    struct Node* new_Node = new Node(data);
    new_Node->data = data;
    new_Node->next = NULL;
    return new_Node;
}

void printList(struct Node* Node) {
    while (Node != NULL) {
        printf("%d ", Node->data);
        Node = Node->next;
    }
    printf("\n");
}

void freeList(struct Node* head) {
    struct Node* temp;
    while (head != NULL) {

        temp = head;
        head = head->next;
        free(temp);
    }
}

int main(void) {
    int t, n, m, i, x;

    cin >> t;
    while (t--) {
        struct Node* temp, *head;
        cin >> n;
        cin >> x;
        head = new Node(x);
        temp = head;
        for (i = 0; i < n - 1; i++) {
            cin >> x;
            temp->next = new Node(x);
            temp = temp->next;
        }
        
        Solution ob;
        
        ob.reorderList(head);
        printList(head);
        freeList(head);
    }
    return 0;
}

// } Driver Code Ends