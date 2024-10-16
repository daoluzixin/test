# JavaScript

简称JS, 是一门跨平台,面向对象的脚本(可直接由浏览器编译)语言,控制网页行为,使网页可以交互

和Java完全不同, 基础语法类似

## 书写语法

区分大小写

每行分号可有可无

注释同JAVA

![](C:\Users\冯\Desktop\凌睿(图片勿移)\输出语句.jpg)

## 变量

var声明变量

弱类型语言    变量可以存储不同类型的值

变量命名规则: 数字不能开头   驼峰命名

## 数据类型

### 原始类型

number: 数字(整数,小数)    string: 字符串, 单双引号均可	boolean:布尔

null: 对象为空	undefined:变量为初始化,默认为undefined

typeof获取数据类型

### 运算符

大多与java相同



== 会进行类型转换   ===不会进行类型转换



- 类型转换--其他类型转化为数字  (全局方法)

alert(parseInt("12"));  //12

alert(parseInt("12A21"));  //12

alert(parseInt("A12"));  //NaN   not a number



其他类型转为boolean

number: 0与NaN为false, 其它均为true

string: 空字符串(不包括空格)为false    其他均为true

Null和undefined: 均转为false



## 函数

function关键字

ps: 弱类型语言,形式参数不需要类型;  返回值也不需要定义类型

console.log()  浏览器控制台中输出信息

 `//定义一`
        `function add(a, b){`
            `return a+b;`
        `}`
        `//定义二`
        `var add = function(a, b){`
            `return a+b;`
        `}`



## 对象

**Array**    

定义

 	var arr = new Array(1,2,3,4);

​	 var arr = [1,2,3,4]

访问  arr[索引] = 赋值;

ps.  长度可变,类型可变

属性  length

方法  1.forEach 遍历有值元素,并调用一次传入的函数      for循环会遍历所有元素的值

​	  2.push 将新元素添加到数组末尾

   `arr.push(7,8,9)`

   `console.log(arr);`

​	 3.splice 删除元素

​	`arr.splice(2,2)`

​	`console.log(arr);`

**String**

var str = "你好";         var str = new String("")

属性

length 长度

方法

charAt()   返回在指定位置的字符

indexof   检索字符串的位置,返回首字母的索引

trim  去除字符串左右空格

substring(start, end)   -----开始索引, 结束索引     含头不含尾

**自定义对象** 

调用格式   对象名.属性名;  	对象名.函数名();

`var user{`

​	`name: "Tom"`

​	`age: 10;`

​	`eat: function(){`

​	`alert("杀!");`

`}`

`}`

#### JSON

JavaScript Object Notation,  JavaScript对象标记法

JSON是通过JavaScript对象标记法书写的文本

`key: value`  	所有key使用双引号

语法简单,层次鲜明,多作为数据载体,在网络中进行数据传输      

**前端请求服务端时用JSON传输,反之亦然**

定义:    var  变量名 = '{"key1": value1,  "key2": value2}';

JSON字符串转为JS对象   var jsObject = JSON.parse(userStr);

JS对象转化为JSON字符串  var jsonStr = JSON.stringify(jsObject);



#### BOM

browser object model 浏览器对象模型,允许JavaScript与浏览器对话,将浏览器各部分封装为对象

组成: window 浏览器窗口对象	Navigator: 浏览器对象	screen:屏幕对象

​	History: 历史记录对象		Location: 地址栏对象

**window** 属性 history	location	navigator

![](C:\Users\冯\Desktop\凌睿(图片勿移)\window对象.jpg)

location.href 设置或返回完整的URL(路径)



### DOM

W3C(万维网联盟)的标准, 定义了访问HTML和XML的标准, 有3个部分

Docement Object Model  文档对象模型

1. **Core** **DOM**  所有文档类型的标准模型

Document 整个文档对象	Element 元素对象	Attribute 属性对象

Text 文本对象	Comment 注释对象

![](C:\Users\冯\Desktop\凌睿(图片勿移)\文档树.jpg)

2. XML DOM 文档的标准模型

3. HTML DOM 

   image: <img> 	Button:  <input type = 'button'>

可参考手册



### 事件监听

事件: HTML事件是发生在HTML元素上的事情, eg: 按钮被点击,按下键盘按键

**事件绑定**

![](C:\Users\冯\Desktop\凌睿(图片勿移)\事件绑定.jpg)

**常见事件**

![](C:\Users\冯\Desktop\凌睿(图片勿移)\常见事件.jpg)

焦点:鼠标点击后的光标
