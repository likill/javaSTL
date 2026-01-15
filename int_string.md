## int->string, string->int
**// int → String**
```java
int num = 123;
String str1 = Integer.toString(num);    // "123"
String str2 = String.valueOf(num);      // "123" (推荐)
String str3 = num + "";                 // "123" (简洁但效率稍低)
```
**// String → int**
```java
String str = "456";
int num1 = Integer.parseInt(str);      // 456 (推荐)
int num2 = Integer.valueOf(str);       // 456 (返回Integer，自动拆箱)
```
**//  char->int**
```java
// 方案1：把char转成String再调用parseInt（推荐，可读性高）
res += Integer.parseInt( String.valueOf(s1.charAt(0)) );

// 方案2：利用ASCII码特性（字符数字转int数字的小技巧，效率更高）
// 原理：字符'0'-'9'的ASCII码是连续的，'5'-'0' 就会得到数字5
res += ( s1.charAt(0) - '0' );
```