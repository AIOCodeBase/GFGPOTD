//{ Driver Code Starts
//Initial Template for Java
import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GfG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
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
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        PrintWriter out=new PrintWriter(System.out);
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t > 0){
    	    	int target=Integer.parseInt(br.readLine());
	            String s = br.readLine();
    	    	Node root = buildTree(s);
        	    Solution g = new Solution();
        	    long ans=g.verticallyDownBST(root,target);
        	    out.println(ans);
                t--;
            
        }
        out.close();
    }
  
}




// } Driver Code Ends

class Solution
{
    long ans;
    Node temp;
    long verticallyDownBST(Node root,int target)
    {
        Node curr=root;
        while(curr!=null){
            if(curr.data==target){
                break;
            }else if(curr.data>target){
                curr=curr.left;
            }else{
                curr=curr.right;
            }
        }
        if(curr!=null){
            ans=0;
            temp=curr;
            fun(curr,0);
            return ans;
        }else{
            return -1;
        }
    }
    void fun(Node root,int val)
    {
        if(root==null)return;
        fun(root.left,val-1);
        fun(root.right,val+1);
        if(root!=temp && val==0){
            ans+=root.data;
        }
    }
}
