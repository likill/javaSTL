## queue
```java
Queue<Integer> queue = new ArrayDeque<>();
queue.offer(10);     // 入队 → true/false
queue.peek();        // 查看队首 → 10 (不删除)
queue.poll();        // 出队 → 10
queue.size();        // 队列大小 → 1
queue.isEmpty();     // 判断空队列 → false
queue.clear();       // 清空队列
```