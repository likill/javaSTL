## int[] a
**// 1. 声明初始化**
```java
int[] a = {1, 2, 3, 4, 5};
```
**// 2. 指定长度（默认全0）**
```java
int[] b = new int[10];
```
**// 3. 访问修改**
```java
int first = a[0];      // 访问
a[2] = 99;            // 修改
```
**// 4. 获取长度**
```java
int len = a.length;   // 不是方法，是属性
```
**// 5. 遍历数组**
```java
for (int i = 0; i < a.length; i++) {
    System.out.println(a[i]);
}
for (int num : a) {
    System.out.println(num);
}
```
**// 6. 数组拷贝**
```java
int[] copy = Arrays.copyOf(a, a.length);
```
**// 7. 排序**
```java
Arrays.sort(a);
```
**// 8. 转为字符串**
```java
String str = Arrays.toString(a);  // "[1, 2, 3, 4, 5]"
```
**// 9. 比较内容**
```java
boolean same = Arrays.equals(a, b);
```
**// 10. 填充值**
```java
Arrays.fill(b, -1);  // 所有元素设为-1
```

## 二维int[][] a
**// 1. 声明初始化**
```java
int[][] a = new int[3][4];          // 3行4列，全0
int[][] b = {{1,2}, {3,4,5}};       // 不规则数组
```
**// 2. 访问修改**
```java
a[0][1] = 10;        // 赋值
int val = a[0][1];   // 取值
```
**// 3. 获取尺寸**
```java
int rows = a.length;        // 行数
int cols = a[0].length;     // 第一行的列数
```
**// 4. 遍历**
```java
for (int i = 0; i < a.length; i++) {
    for (int j = 0; j < a[i].length; j++) {
        System.out.print(a[i][j] + " ");
    }
    System.out.println();
}
```
**// 5. 动态创建（先创建行，再创建每行的列）**
```java
int[][] c = new int[3][];    // 只声明行数
c[0] = new int[2];           // 第一行2列
c[1] = new int[3];           // 第二行3列
```
**// 6. 常用操作**
```java
Arrays.fill(a[0], 1);        // 填充第一行
Arrays.sort(a[1]);           // 排序第二行
String str = Arrays.deepToString(a);  // 转字符串
```