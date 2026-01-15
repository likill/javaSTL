## deque
```java
// 创建双端队列
Deque<Integer> deque = new ArrayDeque<>();  // 推荐
// 两端操作
deque.offerFirst(5);    // 安全头插 [5, 10, 20]
deque.offerLast(30);    // 安全尾插 [5, 10, 20, 30]
deque.peekFirst();      // 安全查看头 → 5
deque.peekLast();       // 安全查看尾 → 30
deque.pollFirst();      // 安全删头 → 10
deque.pollLast();       // 安全删尾 → 20
```