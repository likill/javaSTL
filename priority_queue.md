## priority_queue
**// 创建优先队列 - 默认最小堆（小顶堆）**
```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
```
**// 方法1：使用 Collections.reverseOrder()**
```java
PriorityQueue<Integer> maxHeap1 = 
    new PriorityQueue<>(Collections.reverseOrder());
```
**// 方法2：自定义比较器**
```java
PriorityQueue<Integer> maxHeap2 = 
    new PriorityQueue<>((a, b) -> b - a);
```
**// 基本操作**
```java
pq.offer(5);      // 插入 O(log n)
pq.peek();        // 查看堆顶 → 1 (不删除)
pq.poll();        // 弹出堆顶 → 1 O(log n)
pq.size();        // 大小 → 2
pq.isEmpty();     // 判空 → false
```