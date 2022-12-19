//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int tmp = sc.nextInt();
            int[][] flights = new int[tmp][3];
            for (int i = 0; i < tmp; i++) {

                int u1 = sc.nextInt();
                int v1 = sc.nextInt();
                int w1 = sc.nextInt();
                flights[i][0] = u1;
                flights[i][1] = v1;
                flights[i][2] = w1;
            }

            Solution ob = new Solution();
            int ans = ob.minimumCost(flights, n, k);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends

class Solution {

    int[] dist;
    class Node {

        int v;
        int w;

        Node(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }

    int minimumCost(int[][] flights, int n, int k) {
        List<List<Node>> adj = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] i : flights) {
            adj.get(i[0]).add(new Node(i[1], i[2]));
        }
        dist = new int[n + 1];
        Arrays.fill(dist, 100000);
        dijkistra(adj, k);
        int max = 0;
        for (int i = 1; i <= n; i++) {
            max = Math.max(max, dist[i]);
        }

        return max == 100000 ? -1 : max;
    }

    public void dijkistra(List<List<Node>> adj, int start) {

        PriorityQueue<Node> pq =
            new PriorityQueue<>((x, y)->{ return x.w - y.w; });

        dist[start] = 0;

        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node vet = pq.poll();

            for (Node child : adj.get(vet.v)) {

                if (dist[vet.v] + child.w < dist[child.v]) {
                    dist[child.v] = dist[vet.v] + child.w;
                    pq.add(new Node(child.v, dist[child.v]));
                }
            }
        }
    }
}
