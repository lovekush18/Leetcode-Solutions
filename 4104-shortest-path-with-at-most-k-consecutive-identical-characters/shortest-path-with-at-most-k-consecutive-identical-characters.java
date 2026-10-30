
import java.util.*;

class Solution {
    public int shortestPath(int n, int[][] edges, String labels, int k) {
        if (k == 0) return -1;

        List<int[]>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            graph[edge[0]].add(new int[]{edge[1], edge[2]});
        }

        int[][] dist = new int[n][k + 1];

        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[2], b[2])
        );

        dist[0][1] = 0;
        pq.offer(new int[]{0, 1, 0});

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();

            int node = curr[0];
            int count = curr[1];
            int cost = curr[2];

            if (cost != dist[node][count]) {
                continue;
            }

            if (node == n - 1) {
                return cost;
            }

            for (int[] edge : graph[node]) {
                int next = edge[0];
                int weight = edge[1];

                int nextCount;

                if (labels.charAt(node) == labels.charAt(next)) {
                    nextCount = count + 1;
                } else {
                    nextCount = 1;
                }

                if (nextCount > k) {
                    continue;
                }

                if (cost + weight < dist[next][nextCount]) {
                    dist[next][nextCount] = cost + weight;
                    pq.offer(new int[]{
                        next, nextCount, cost + weight
                    });
                }
            }
        }

        return -1;
    }
}
