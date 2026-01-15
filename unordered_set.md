## unordered_set
**// 1. 默认构造函数**
```java
Set<String> set1 = new HashSet<>();
```
**// 4. 从已有集合创建**
```java
Set<String> existingSet = new HashSet<>();
existingSet.add("A");
existingSet.add("B");
Set<String> set4 = new HashSet<>(existingSet);
```
**// remove() - 删除指定元素**
```java
boolean removed1 = names.remove("Bob");      // true，删除成功
```
**// clear() - 清空所有元素**
```java
names.clear();  // set变为空
```
**// contains() - 检查元素是否存在**
```java
boolean hasTwo = numbers.contains(2);        // true
boolean hasTen = numbers.contains(10);       // false
boolean hasNull = numbers.contains(null);    // false（如果没添加null）
// isEmpty() - 检查是否为空
boolean empty = numbers.isEmpty();           // false
// size() - 获取元素数量
int count = numbers.size();                  // 5
```
**// 1. 增强for循环（最常用）**
```java
for (String fruit : fruits) {
    System.out.println(fruit);
}
```