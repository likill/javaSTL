## set
**// 3. TreeSet - 基于红黑树，自然排序或自定义排序**
```java
Set<String> treeSet = new TreeSet<>();
```
**// 添加元素**
```java
boolean added1 = set.add("Apple");     // true
boolean added2 = set.add("Banana");    // true
boolean added3 = set.add("Apple");     // false，重复元素
```
**// 检查元素**
```java
boolean hasApple = set.contains("Apple");    // true
boolean hasGrape = set.contains("Grape");    // false
```
**// 删除元素**
```java
boolean removed1 = set.remove("Apple");      // true
boolean removed2 = set.remove("Grape");      // false
```
**// 清空集合**
```java
set.clear();                                   // 清空所有元素
```
**// 大小信息**
```java
int size = set.size();                         // 元素数量
boolean empty = set.isEmpty();                 // 是否为空
```
**// 方法1：增强for循环（最常用）**
```java
for (String fruit : fruits) {
    System.out.println(fruit);
}
```
**// 1. ceiling(x) - 对应C++的lower_bound(x)**
```java
Integer ceiling = treeSet.ceiling(x);
```
**// 2. higher(x) - 对应C++的upper_bound(x)**
```java
Integer higher = treeSet.higher(x);
```
**// 3. floor(x) - 返回<=x的最大元素**
```java
Integer floor = treeSet.floor(x);
```
**// 4. lower(x) - 返回<x的最大元素**
```java
Integer lower = treeSet.lower(x);
```