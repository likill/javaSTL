## map
**// 2. TreeMap - 基于红黑树，按键自然排序**
```java
Map<String, Integer> treeMap = new TreeMap<>();
```
**// 添加/更新操作**
```java
map.put("Alice", 25);          // 添加或更新
```
**// 查询操作**
```java
int age = map.get("Alice");                   // 获取值 没有值返回null
int ageOrDefault = map.getOrDefault("Bob", 0); // 获取或默认值
map.merge(key,1,Integer::sum); // map[key]++;

自定义规则 - 取最大值
map.merge(1, 5, Math::max); // 新增 {1=5}
// 规则：(oldVal, newVal) -> Math.max(oldVal, newVal)
map.merge(1, 5, Math::max); // 新增 {1=5}
map.merge(1, 8, Math::max); // 取最大值 8 → {1=8}
map.merge(1, 3, Math::max); // 取最大值 8 → 不变
// 减法：key存在则 旧值 - 基准值
bucket.merge(1, 5, Integer::sum); // {1=5}
bucket.merge(1, 2, (old, val) -> old - val); // 5-2=3 → {1=3}
// 乘法：key存在则 旧值 * 基准值
bucket.merge(1, 3, (old, val) -> old * val); //3*3=9 → {1=9}
```
**// 删除操作**
```java
int removedAge = map.remove("Alice");          // 删除并返回值
```
**// 大小信息**
```java
int size = map.size();                         // 元素数量
boolean isEmpty = map.isEmpty();               // 是否为空
```
**// 方法1：entrySet()遍历（最常用、最高效）**
```java
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
```
**// 方法1A：使用ceilingEntry - 返回第一个 >= x 的Entry**
```java
Map.Entry<Integer, Integer> entry = treeMap.ceilingEntry(x);
```
**// 如果需要严格大于（> x），使用higherEntry/higherKey**
```java
Map.Entry<Integer, Integer> higherEntry = treeMap.higherEntry(x);
```
**// 如果需要 <= x 的最大元素，使用floorEntry**
```java
Map.Entry<Integer, Integer> floorEntry = treeMap.floorEntry(x);
```
**// 1. lowerEntry(x) - 返回第一个 严格< x 的Entry**
```java
Map.Entry<Integer, Integer> lowerEntry = treeMap.lowerEntry(x);
```