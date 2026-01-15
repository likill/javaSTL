## pair<int, int> 

**使用数组**
以$dijkstra$求最短路为例
```java
int dijkstra(List<List<Edge>> graph, int n, int start, int end) {
    int[] dist = new int[n + 1];
    boolean[] st = new boolean[n + 1];

    Arrays.fill(dist, INF);  // 距离初始化为无穷大
    dist[start] = 0;         // start->start 距离为 0

    // 小根堆：存储 (距离, 节点编号)
    PriorityQueue<int[]> heap = new PriorityQueue<>(
        (a, b) -> a[0] - b[0]
    );

    heap.offer(new int[]{0, start});  // 插入距离和节点编号

    while (!heap.isEmpty()) {
        int[] t = heap.poll();  // 取距离源点最近的点
        int distance = t[0];    // 当前距离
        int ver = t[1];         // 节点编号
        
        if (st[ver]) continue;  // 如果距离已经确定，跳过
        st[ver] = true;
        
        // 更新 ver 指向的节点距离
        for (Edge edge : graph.get(ver)) {
            int j = edge.to;
            if (dist[j] > dist[ver] + edge.weight) {
                dist[j] = dist[ver] + edge.weight;
                heap.offer(new int[]{dist[j], j});  // 距离变小，入堆
            }
        }
    }

    return dist[end] == INF ? -1 : dist[end];
}
```