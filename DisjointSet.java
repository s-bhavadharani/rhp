import java.util.*;

public class Main {

    static int[] parent;
    static int[] size;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of nodes
        int q = sc.nextInt(); // number of connections

        parent = new int[n + 1];
        size = new int[n + 1];

        // initialize DSU
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            size[i] = 1;
        }

        // process connections
        for (int i = 0; i < q; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            union(u, v);
        }

        // find maximum component size
        int maxSize = 0;
        for (int i = 1; i <= n; i++) {
            if (find(i) == i) { // root node
                maxSize = Math.max(maxSize, size[i]);
            }
        }

        System.out.println(maxSize);
    }

    // find with path compression
    static int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    // union by size
    static void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);

        if (rootA != rootB) {
            // attach smaller tree under larger one
            if (size[rootA] < size[rootB]) {
                parent[rootA] = rootB;
                size[rootB] += size[rootA];
            } else {
                parent[rootB] = rootA;
                size[rootA] += size[rootB];
            }
        }
    }
}
