//{ Driver Code Starts
import java.io.*;
import java.util.*;


class StringArray
{
    public static String[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        return s;
    }

    public static void print(String[] a)
    {
        for(String e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<String> a)
    {
        for(String e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            String[] arr = StringArray.input(br, n);
            
            Solution obj = new Solution();
            String res = obj.longestString(n, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends

class Node
{
    Node links[] = new Node[26];
    boolean flag = false;
    
    boolean containsKey(char ch)
    {
        return (links[ch - 'a'] != null);
    }

    void set(char ch, Node node)
    {
        this.links[ch - 'a'] = node;
    }

    Node get(char ch)
    {
        return links[ch - 'a'];
    }

    void setEnd()
    {
        flag = true;
    }

    boolean isEnd()
    {
        return flag;
    }
}
class Pair{
	Node first;
	String second;
	Pair(Node first, String second){
		this.first = first;
		this.second = second;
	}
}

class Trie
{
    Node root;
    Trie(){
    	this.root = new Node();
    }
    void insert(String word)
    {
        Node node = root;
        for (int i = 0; i < word.length(); i++)
        {
            if (!node.containsKey(word.charAt(i)))
            {
                node.set(word.charAt(i), new Node());
            }

            node = node.get(word.charAt(i));
        }
        node.setEnd();
    }

    String bfs()
    {
        Node node = root;
        Queue<Pair> q = new LinkedList<>();
        String ans = "";
        q.add(new Pair(node, ""));
        while (!q.isEmpty())
        {
            int sz = q.size();

            for (int i = 0; i < sz; i++)
            {
                Node cur = q.peek().first;
                String s = q.peek().second;
                q.poll();

                if (cur != root && !cur.isEnd())
                    continue;
                for (int j = 0; j < 26; j++)
                {
                    char ch = (char)(j + 'a');
                    if (cur.get(ch) != null)
                    {
                        q.add(new Pair(cur.get(ch), s + ch));
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
}
class Solution{
	public static String longestString(int n, String[] arr) {
		String ans;
        Trie trie = new Trie();
        for (String w : arr)
        {
            trie.insert(w);
        }
        ans = trie.bfs();
        return ans;
    }
}