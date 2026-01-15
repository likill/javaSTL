## vector
**// C++ vector<int> 在 Java 的对应 → ArrayList<Integer>
// 创建**
```java
ArrayList<Integer> list = new ArrayList<>();  // 空列表
ArrayList<Integer> list2 = new ArrayList<>(10);  // 初始容量
```
**// 增**
```java
list.add(10);          // push_back(10)
list.add(0, 5);        // insert(begin(), 5)
list.addAll(otherList);// 合并列表
```
**// 删**
```java
list.remove(0);        // erase(begin())
list.remove(Integer.valueOf(5)); // 删除元素5
list.clear();          // clear()
```
**// 查改**
```java
int val = list.get(0); // a[0]
list.set(0, 99);       // a[0] = 99
int size = list.size();// a.size()
boolean empty = list.isEmpty();
```
**// 遍历**
```java
for (int i = 0; i < list.size(); i++) { /*...*/ }
for (int num : list) { /*...*/ }
```
**// 特殊操作**
```java
list.contains(10);     // 是否包含 → O(n)
list.indexOf(10);      // 查找索引
Collections.sort(list);// sort(a.begin(), a.end())
```

## 二维vector
**// C++: vector<vector<int>> → Java: ArrayList<ArrayList<Integer>>
// 1. 创建二维动态数组**
```java
ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
```
**// 2. 添加一行**
```java
mat.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
```
**// 3. 创建n行m列的二维数组**
```java
int n = 3, m = 4;
for (int i = 0; i < n; i++) {
    mat.add(new ArrayList<>());
    for (int j = 0; j < m; j++) {
        mat.get(i).add(0);  // 初始化0
    }
}
```
**// 4. 访问修改**
```java
mat.get(i).set(j, value);  // mat[i][j] = value
int val = mat.get(i).get(j);  // mat[i][j]
```
**// 5. 添加元素到某行**
```java
mat.get(i).add(99);
```
**// 6. 获取尺寸**
```java
int rows = mat.size();
int cols = mat.get(0).size();
```
**// 7. 不规则二维数组（每行长度不同）**
```java
ArrayList<ArrayList<Integer>> jagged = new ArrayList<>();
jagged.add(new ArrayList<>(Arrays.asList(1)));
jagged.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
```