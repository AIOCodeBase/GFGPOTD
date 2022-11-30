//{ Driver Code Starts
import java.io.*;
import java.util.*;


class Node
{
    int data;
    Node left;
    Node right;
    
    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
    
    public static Node buildTree(String str)
    {
        // Corner Case
        if(str.length()==0 || str.charAt(0)=='N')
            return null;
        
        // Creating array of Strings from input 
        // String after spliting by space
        String ip[] = str.split(" ");
        
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        
        // Push the root to the queue
        Queue<Node> queue = new LinkedList<>(); 
        queue.add(root);
        
        // Starting from the second element
        int i = 1;
        while(queue.size()>0 && i < ip.length)
        {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N"))
            {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N"))
            {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    
    public static Node inputTree(BufferedReader br) throws IOException
    {
        return buildTree(br.readLine().trim());
    }
    
    public static void inorder(Node root)
    {
        if (root == null)
           return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String s; 
            s = br.readLine();
            
            Solution obj = new Solution();
            Node res = obj.treeFromString(s);
            
            Node.inorder(res);
            System.out.println();
            
        }
    }
}

// } Driver Code Ends


/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;
    
    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    static Node treeFromString(String s)
    {
        return FromString(s, 0, s.length() - 1);
    }
     
    /* Helper function that allocates a new node */
    static Node newNode(int data)
    {
        Node node = new Node(data);
        node.left = node.right = null;
        return (node);
    }
     
    // function to return the index of close parenthesis
    static int findIndex(String str, int si, int ei)
    {
        if (si > ei)
          return -1;
     
        // Inbuilt stack
        Stack<Character> s = new Stack<>();
        for (int i = si; i <= ei; i++)
        {
     
            // if open parenthesis, push it
            if (str.charAt(i) == '(')
                s.add(str.charAt(i));
     
            // if close parenthesis
            else if (str.charAt(i) == ')')
            {
                if (s.peek() == '(')
                {
                    s.pop();
     
                    // if stack is empty, this is
                    // the required index
                    if (s.isEmpty())
                        return i;
                }
            }
        }
     
        // if not found return -1
        return -1;
    }
     
    // function to construct tree from String
    static Node FromString(String str, int si, int ei)
    {
     
        // Base case
        if (si > ei)
            return null;
     
        // new root
        String num="";
        while(si<str.length() && str.charAt(si)>='0' && str.charAt(si)<='9'){
            num+=str.charAt(si);
            si++;
        }
        Node root = newNode(Integer.parseInt(num));
        int index = -1;
     
        // if next char is '(' find the index of
        // its complement ')'
        if (si <= ei && str.charAt(si) == '(')
            index = findIndex(str, si, ei);
     
        // if index found
        if (index != -1)
        {
     
            // call for left subtree
            root.left = FromString(str, si + 1, index - 1);
     
            // call for right subtree
            root.right = FromString(str, index + 2, ei - 1);
        }
        return root;
    }
}
        
