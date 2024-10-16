# Mybatis

基于Java的持久层(dao)框架, 可简化JDBC开发,对JDBC进行封装



## JDBC

Java DataBase Connectivity,  使用Java语言操作关系型数据库的一套API(规范)

![](C:\Users\冯\Desktop\凌睿(图片勿移)\JDBC.jpg)

![](C:\Users\冯\Desktop\凌睿(图片勿移)\Mybatis格式.jpg)



## 数据库连接池

容器,负责分配管理数据库连接

允许程序重复使用一个现有的数据库连接,而不是再重新建立一个

释放空闲时间超过最大空闲时间的连接,避免因为没有释放连接而引起数据库连接遗漏



**优势**  1.资源重用	2.提升响应速度	3.避免数据库连接遗漏



### 标准接口:DataSource

官方(sun)提供的数据库连接池接口,由第三方组织实现此接口

常见产品:  Druid(德鲁伊) 阿里巴巴开源的数据库连接池项目

​		   Hikari(追光者) springboot默认



### lombok

实用的java类库, 通过注解自动生成构造器,还可以自动化生成日志变量

@Data  提供综合的生成代码功能

@NoArgsConstructor  为实体类生成无参的构造器方法

@AllArgsConstructor   生成除了static修饰的字段外带有参数的构造器方法



### 动态SQL

随用户的输入或外部条件的变化而变化的SQL语句

**标签**  

if: 条件为true则拼接

​	where: 只会在子元素有内容的情况下插入where子句,会自动去除子句开头的AND或OR

​	set: 用在update语句中,  动态地在行首插入set关键字,会删除额外逗号

foreach: 遍历

**sql片段**:    <sql> 定义可重用的SQL片段(方便后续的修改, 提高代码复用性)	<include>通过属性refid,指定包含的sql片段
