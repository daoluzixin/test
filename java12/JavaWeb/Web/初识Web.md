# Web

## HTTP

定义: 超文本传输协议, 规定了浏览器和服务器之间数据传输的规则

​		**请求   	**  	**响应**

**特点**

1.基于TCP, 三次握手,确保有接收能力,  面向连接,安全

2.基于请求-响应模型	一次请求对应一次响应

3.无状态协议, 对于事务没有记忆能力,每次请求-响应独立进行



## 请求数据格式

![](C:\Users\冯\Desktop\凌睿(图片勿移)\http请求数据格式1.jpg)

最后一行请求体,存放请求参数

![](C:\Users\冯\Desktop\凌睿(图片勿移)\请求数据格式2.jpg)

get请求方式: 参数在请求行(第一行)中,没有请求体,请求大小有限制

post请求方式: 请求大小没有限制



## 响应格式

![](C:\Users\冯\Desktop\凌睿(图片勿移)\HTTP响应.jpg)

![](C:\Users\冯\Desktop\凌睿(图片勿移)\HTTP响应格式.jpg)

### 最常见响应状态码

200  OK 客户端请求成功

404 Not Found  请求资源不存在

500 Internal Server Error 服务器发生不可预期的错误  



## 协议解析

web服务器  软件程序  对HTTP协议的操作进行封装

#### 附录

JavaSE  java标准版

JavaME  java小型版, 手机小型版, 开发嵌入式设备

JavaEE  java企业版,  企业级开发项目的总和

### Tomcat

开源(可定制)的轻量级Web服务器,支持少量JavaEE规范

配置端口号(conf/server.xml)

web容器, servlet容器

![](C:\Users\冯\Desktop\凌睿(图片勿移)\Tomcat.jpg)

http默认端口号 80

Tomcat部署项目

将项目放在webapps目录下



### 内嵌Tomcat

起步依赖  spring-boot-starter-web

​		 spring-boot-stater-rest

基于Springboot开发的web程序,内置了Tomcat服务器,当启动类运行时,自动启动内置的Tomcat服务器



## 请求响应

ServletRequest 请求

ServletrResponse 响应

BS架构:  Browser/Server, 浏览器/服务架构模式.  客户端只需要浏览器,程序的逻辑和数据存储在服务端

CS架构: Client/Server, 客户端/服务器架构

### 请求

开发模式:  前后端分离

Postman  网页调试与发送网页HTTP请求的Chrome插件

作用:  用于接口测试

#### 简单参数

#### 实体参数

简单实体对象:  

复杂实体对象: 请求参数名与形参对象属性名相同,定义POJO(实体类)接收即可



#### 数组集合参数

集合: @RequestParm绑定参数关系



#### 日期参数

```
@DateTimeForma
```



#### Json参数

@RequestBody

键名与形参对象属性名相同



#### 路径参数

路径参数: 通过请求URL直接传递参数		需要@PathVariable获取路径参数



## 响应

@ResponseBody

将方法返回值直接响应,若返回值类型为实体对象/集合, 转Json格式响应

### 统一响应对象

类 Result(code, msg,  data)