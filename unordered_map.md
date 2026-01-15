## unordered_map
**声明**
```java
Map<String, Integer> map1 = new HashMap<>();
```

**从已有Map创建**
```java
Map<String, Integer> existingMap = new HashMap<>();
existingMap.put("A", 1);
existingMap.put("B", 2);
Map<String, Integer> map4 = new HashMap<>(existingMap);
```

**put() - 添加或更新**
```java
map.put("Alice", 25);      // 添加
map.put("Bob", 30);        // 添加
map.put("Alice", 26);      // 更新Alice的值为26
```

**get() - 根据key获取value**
```java
Integer age = map.get("Alice");    // 25
Integer notFound = map.get("Unknown"); // null
```

**getOrDefault() - key不存在时返回默认值**
```java
Integer age2 = map.getOrDefault("Unknown", -1); // -1
Integer age3 = map.getOrDefault("Alice", -1);   // 25
```

**containsKey() - 检查key是否存在**
```java
boolean hasAlice = map.containsKey("Alice");   // true
boolean hasUnknown = map.containsKey("Unknown"); // false
```

**containsValue() - 检查value是否存在**
```java
boolean hasAge25 = map.containsValue(25);      // true
```

**remove(key) - 删除指定key**
```java
Integer removed = map.remove("Bob");    // 返回30，并删除Bob
Integer notRemoved = map.remove("Unknown"); // 返回null
```

**remove(key, value) - 仅当key-value匹配时删除**
```java
boolean removed2 = map.remove("Alice", 26);    // false，值不匹配
boolean removed3 = map.remove("Alice", 25);    // true，删除成功
```

**clear() - 清空所有元素**
```java
map.clear();  // map变为空
```

**遍历键值对（最常用）**
```java
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    String key = entry.getKey();
    Integer value = entry.getValue();
    System.out.println(key + ": " + value);
}
```

**基本信息**
```java
int size = map.size();          // 元素数量
boolean isEmpty = map.isEmpty(); // 是否为空
```

**// 获取视图（与原始map关联）**
```java
Set<String> keys = map.keySet();        // 键的集合
Collection<Integer> values = map.values(); // 值的集合
Set<Map.Entry<String, Integer>> entries = map.entrySet(); // 键值对集合
```