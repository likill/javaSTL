## stack
**// 使用 ArrayDeque 作为栈**
**// 创建栈 (推荐使用 ArrayDeque)**
```java
Deque<Integer> stack = new ArrayDeque<>();
```
**// 基本操作**
```java
stack.push(10);    // 压栈
stack.peek();      // 查看栈顶 → 30 (不弹出)
stack.pop();       // 弹出栈顶 → 30
stack.size();      // 栈大小 → 2
stack.isEmpty();   // 判断空栈 → false
stack.clear();     // 清空栈
```