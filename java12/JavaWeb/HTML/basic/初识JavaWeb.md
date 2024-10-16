# JavaWeb



## Web网站的工作流程

浏览器-----前端服务器   请求前端,前端响应,浏览器解析相应前端代码,展现出页面(解析渲染,负责该部分为浏览器的内核)

浏览器-----后端服务器(Java程序)  根据前端代码的获取数据的路径访问后端程序

后端服务器-----数据库服务器   获取数据

后端服务器-----浏览器   后端服务器返回到浏览器

<img src="C:\Users\冯\Desktop\凌睿(图片勿移)\前后端分离.png" style="zoom:33%;" />



## 初识web前端

web标准,大部分由W3C负责制定

组成:  **HTML**  网页结构(页面元素和内容)

​	   **CSS **    网页表现(页面元素的外观,位置等样式)

​	   **JavaScript **  网页的行为(交互效果)

<img src="C:\Users\冯\Desktop\凌睿(图片勿移)\1111.png" style="zoom:33%;" />

vue:  JS框架

Ajax 不是一种新的编程语言，而是一种用于创建更好更快以及交互性更强的Web应用程序的技术.

Nginx 是一款轻量级的Web 服务器/反向代理服务器及电子邮件（IMAP/POP3）代理服务器，占有内存少，并发能力强(工程化)

Axios 



### HTML

超文本/标记语言(由标签构成的语言)    HTML标签都是预定义好的,代码可直接在浏览器中运行,标签有浏览器解析

HTML标签参考手册

标签不区分大小写      语法结构松散	标签属性值单双引号都可以

![](C:\Users\冯\Desktop\凌睿(图片勿移)\HTML结构.jpg)

### CSS

层叠式样表, 控制页面样式

**引入方式** 

行内样式: 写在标签的style属性中(不推荐)

内嵌样式: 写在style标签中(可写在任何位置,通常约定写在head标签中)

外联样式: 写在一个单独的.css文件(需要link标签引入)



#### css选择器

元素选择器	id选择器	类选择器

![](C:\Users\冯\Desktop\凌睿(图片勿移)\css选择器.jpg)

id > 类 > 元素



#### 超链接

标签<a>

`<a href="https://politics.gmw.cn/" target="_blank">新浪政务</a>`

属性:  href:指定资源访问的ur1 (路径)

​	  target: 指定在何处打开资源链接    _self:默认值,在当前页面打开    _blank:在空白页打开

**CSS属性**   text-decoration: 规定添加到文本的修饰.  none表示定义标准的文本   color定义文本的颜色

**视频** 标签 <video>

src: 规定视频的ur1       controls:显示播放控件   width:播放器宽度   height:播放器高度

**音频**标签 <audio> src:规定视频ur1   controls:显示播放控件

**段落**标签 <p>

**文本加粗**标签 <b> <strong>

<img src="C:\Users\冯\Desktop\凌睿(图片勿移)\正文排版.jpg" style="zoom: 67%;" />

**页面布局**  盒子模型: 所有元素(标签)可以看成是一个盒子,由盒子将元素包含在一个区域内,以盒子的视角更容易布局

​	组成: 内容区域(content)   距区距(padding)  边框区域(border)  外边距区域(margin)

![](C:\Users\冯\Desktop\凌睿(图片勿移)\页面布局.jpg)

**表格标签** 

![](C:\Users\冯\Desktop\凌睿(图片勿移)\表格.jpg)

**表单标签**

采集用户数据,如注册,登录

必须有name

<img src="C:\Users\冯\Desktop\凌睿(图片勿移)\表单.jpg" style="zoom: 80%;" />

form表单属性: action: 表单提交的url, 往何处提交数据, 默认为当前页面

​			  method: 表单提交方式, 	get:在url后面拼接数据, 比如: ?username=Tom&age=12,  url长度有限, 默认值

​			  post:  在消息体(请求体)中传递, 参数大小无限制

表单标签--表单项

![](C:\Users\冯\Desktop\凌睿(图片勿移)\表单项标签.jpg)