## string
**String 对象不可变，String 变量的指向可变**
**// C++ string → Java String
// 1. 创建初始化**
```java
String s1 = "hello";
String s2 = new String("world");
char[] chars = {'a','b','c'};
String s3 = new String(chars);
```
**// 2. 长度/判空**
```java
int len = s1.length();        // size()
boolean empty = s1.isEmpty(); // empty()
```
**// 3. 访问字符**
```java
char c = s1.charAt(0);        // s[0] 或 s.at(0)
```
**// 4. 查找**
```java
int idx1 = s1.indexOf('l');       // find('l')
int idx2 = s1.indexOf("ll");      // find("ll")
int idx3 = s1.lastIndexOf('l');   // rfind('l')
boolean contains = s1.contains("ell");  // 是否包含
```
**// 5. 子串**
```java
String sub1 = s1.substring(1, 3);    // substr(1, 2) → "el" [start, end)
String sub2 = s1.substring(1);       // substr(1) 到尾
```
**// 6. 比较**
```java
boolean eq1 = s1.equals("hello");    // == (内容比较)
boolean eq2 = s1.equalsIgnoreCase("HELLO");  // 忽略大小写
int cmp = s1.compareTo("world");     // compareTo()
```
**// 7. 修改（String不可变，需新建）**
```java
String s4 = s1 + " world";          // 拼接
String s5 = s1.concat("!");         // +="!"
String s6 = s1.replace('l', 'x');   // replace('l','x')
String s7 = s1.toUpperCase();       // 转大写
String s8 = "  hello  ".trim();     // 去首尾空格
```
**// 8. 分割连接**
```java
String[] parts = "a,b,c".split(",");      // 分割
String joined = String.join("-", parts);  // 连接
```
**// 9. 类型转换**
```java
String numStr = String.valueOf(123);      // to_string(123)
int num = Integer.parseInt("456");        // stoi("456")
double d = Double.parseDouble("3.14");    // stod("3.14")
```
**// 10. StringBuilder（类似连续修改）**
```java
StringBuilder sb = new StringBuilder();
sb.append("hello");      // 追加
sb.append(" world");
sb.insert(5, ",");
sb.delete(5, 6);
sb.reverse();
String result = sb.toString();  // 转为String
```
**// 11.判断数字，字母**
```java
char c = 'a';
// 1. 判断单个字符 是否为【字母】(a-z, A-Z)
boolean isLetter = Character.isLetter(c);

// 2. 判断单个字符 是否为【数字】(0-9)
boolean isDigit = Character.isDigit(c);

// 3. 判断单个字符 是否为【字母/数字】(字母+数字的组合)
boolean isLetterOrDigit = Character.isLetterOrDigit(c);

// 4. 拓展：判断是否为小写字母
boolean isLowerCase = Character.isLowerCase(c);
// 判断是否为大写字母
boolean isUpperCase = Character.isUpperCase(c);
```