# Project

IOC控制反转		DI依赖注入

## 开发规范---Restful

表述性转换,软件架构风格, URL定位资源,HTTP动词描述操作	

GET查询	POST新增	PUT修改	DELETE删除

REST是风格,约定方式,可以被打破.

描述模块的功能常使用负数,表示此类资源而非单个资源

<img src="C:\Users\冯\Desktop\凌睿(图片勿移)\project大思路.png" style="zoom: 50%;" />

分页查询插件: PageHelper

@RestController注解用于标记一个类，表明该类是一个控制器，并且其下的方法都将返回数据作为响应。使用@RestController注解时，不再需要在方法上添加@ResponseBody注解，因为@RestController默认将所有方法的返回值自动序列化为响应体。

![](C:\Users\冯\Desktop\凌睿(图片勿移)\11111111111111111111111111111111111111111111111.png)



## 文件上传

阿里云

## 登录校验

<img src="C:\Users\冯\Desktop\凌睿(图片勿移)\登录校验.png" style="zoom:50%;" />

### 会话技术

**会话**: 用户打开浏览器,访问web服务器的资源,会话建立,一方断开连接,会话结束,在一次会话中可以包含多次请求响应

**会话跟踪**: 维护浏览器状态的方法, 服务器要识别多次请求是否来源于同一浏览器,以便在同一次会话的多次请求间**共享数据**

​	会话跟踪方案: 客户端会话跟踪技术: Cookie

​				 服务端会话跟踪技术: Session

​				 令牌技术

### Cookie

**优点**: HTTP协议中支持的技术

**缺点**: 移动端APP无法使用Cookie	用户可以自己禁用Cookie(不安全)	不能跨域

**附录**  跨域的三个维度:  协议	IP/域名(网址)	端口

域名由DNS解析为IP地址

![](C:\Users\冯\Desktop\凌睿(图片勿移)\跨域.jpg)



### Session

底层为Cookie

服务器负载均衡

**优点**: 存储在服务端,安全

**缺点**: 有Cookie的缺点	服务器集群环境下无法直接使用(设计到跨域)



### 令牌技术

**优点**: 支持PC端,移动端	解决集群环境下的认证问题	减轻服务器端存储压力

**缺点**: 需要自己实现



#### JWT令牌

JSON Web Token

**定义**: 简洁,自包含的格式, 在通信双方以Json数据格式安全传输信息. 由于数字签名的存在,这些信息是可靠的

**组成**:

1.Header(头): 记录令牌类型,签名算法等.  e.g. "alg" "HS256"

2.Payload(有效载荷): 携带自定义,默认信息.  e.g. "id": "1",  "username": "Tom"

3.Signature(签名):  防止Token被篡改, 确保安全性.   将header, payload,并加入指定密钥,通过指定签名算法计算而来

**附录**: Base64: 基于64个可打印字符(A-Z a-z 0-9 + /)来表示二进制的编码方式

<img src="C:\Users\冯\Desktop\凌睿(图片勿移)\JWT令牌.jpg" style="zoom: 80%;" />

相关依赖 

<!-- JWT令牌-->
        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt</artifactId>
            <version>0.9.1</version>
        </dependency>



## 过滤器(Filter)

是JavaWeb三大组件(Servlet,  Filter,  Listener)

可以把对资源的请求拦截下来,完成一些通用操作, e.g. 登录校验,敏感字符处理

实现: Filter接口

配置: @WebFilter(urlPartterns = "/")	@ServletCompinentScan

<img src="C:\Users\冯\Desktop\凌睿(图片勿移)\Filter拦截器.jpg" style="zoom: 80%;" />

拦截具体路径

 /login 拦截具体路径

/emps/*  目录拦截

/*  拦截所有

过滤器链执行顺序: AFilter>BFilter	Filter1>Filter2



## 拦截器(Interceptor)

动态拦截方法调用的机制,Spring框架中的,动态拦截控制器方法的进行.  

**作用**: 拦截请求,在指定方法调用前后,根据业务需要执行余弦设定的代码

### 拦截路径

/***** :一级路径, 不能匹配/depts/1

/****** : 任意级路径

**/depts/*** : /depts的下一级路径

**/depts/******** : /depts下的任意路径

### 拦截流程

<img src="C:\Users\冯\Desktop\凌睿(图片勿移)\拦截流程.jpg"  />



## 事务回顾

**事务**是一组操作的集合, 一个不可分割的工作单位,操作要么同时成功要么同时失败

@Transactiongal	业务层(Service)的方法,类,接口 

将当前事务交给spring进行事务管理, 方法执行前开启事务; 执行完毕提交事务; 出现异常回滚事务

### rollbackFor

可确定回滚的异常类型

### propagation

事务传播行为: 一个事务方法被另一个事务方法调用时,这个事务应该如何进行事务管理

![](C:\Users\冯\Desktop\凌睿(图片勿移)\事务传播行为.jpg)



## 全局异常处理器

![](C:\Users\冯\Desktop\凌睿(图片勿移)\全局异常处理器.jpg)

@ExceptionHandler 标记为异常处理方法, 可指定参数(异常类型或其他)

@ControllerAdvice 标记为全局异常处理器, 与@RestController 一起使用, 指定全局异常处理器只处理@RestController控制器抛出的异常

## 文件上传

### 本地存储

无法直接访问		磁盘空间限制		磁盘损坏文件丢失

![](C:\Users\冯\Desktop\凌睿(图片勿移)\本地存储1.jpg)

![](C:\Users\冯\Desktop\凌睿(图片勿移)\本地存储2.jpg)

### 阿里云OSS

参照官方SDK(需要的依赖和示例代码)-------> 集成使用



## AOP

Aspect Oriented Programming, 面向切面,面向方向编程

动态代理技术

```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-aop</artifactId>
</dependency>
```

**场景** :记录操作日志	权限控制	事务管理

**优势** :代码无侵入	减少重复代码	维护方便	开发效率高



### 核心概念

**连接点JoinPoint**: 可以被AOP控制的方法(有执行方法时的信息)

**通知Advice**: 指重复的逻辑,共性功能

**切入点PointCut**: 匹配连接点的条件,通知只会在切入点方法执行时被应用

**切面Aspect**: 通知与切入点的对应关系

**目标对象Target**: 通知所应用的对象

### 通知类型

**@Around**: 环绕通知,此注解标注的通知方法在目标方法前后都被执行

​		**要自己调用ProceedingJoinPoint.proceed()来让原始方法执行,**

​		**通知方法的返回值类型必须为Object**

@Before: 前置通知, 通知方法在目标方法前通知

@After: 后置通知,无论有无异常都会执行

@AfterReturning: 返回后通知,有异常不执行

@AfterThrowing: 异常后通知, 发生异常后执行

@PointCut 将公共的切点表达式抽取出来,但会提高耦合度.

​		private: 只能在当前切面中引用表达式

​		public: 在其他外部的切面类中也可以引用

### 执行顺序

1.不同切面类中,默认按切面类的类字母排序

​		目标前的通知:字母靠前的先执行			目标后的通知:字母排名靠后的先执行(同Filter)

2.用@Order在切面类上控制

​		目标前: 数字小的先执行			目标后: 数字大的先执行

### 切入点表达式

决定项目中哪些方法要加入通知

execution: 根据方法签名		@annotation:根据注解配置

#### execution

execution(访问修饰符? 返回值 包名.类名.?方法名(方法参数	java.lang.) throws 异常)

异常是方法上声明抛出的异常,不是实际抛出的异常

**通配符**: * 单个独立的任意符号, 什么都可以代表

​			  .. 多个连续的任意符号, 在包和参数中用

**建议**: 业务方法名要规范,方便快速匹配		基于接口描述,增强拓展性	缩小切入点的匹配范围,关系匹配效率

#### @annotation

注解全类名

### 连接点

用JoinPoint抽象了连接点,可以获得方法执行时的相关信息

@Around 获取连接点信息只能用ProceedingJoinPoint

其他四种通知,只用JoinPoint(org.aspect.lang),是ProceedingJoinPoint的父类



### 配置优先级

<img src="C:\Users\冯\Desktop\凌睿(图片勿移)\配置优先级.png" style="zoom: 33%;" />

## Bean管理

#### 获取Bean对象

```java
@Autowired
private ApplicationContext applicationContext; //IOC容器对象
//获取bean对象
@Test
public void testGetBean(){
    //根据bean的名称获取
    DeptController bean1 = (DeptController) applicationContext.getBean("deptController");
    System.out.println(bean1);

    //根据bean的类型获取
    DeptController bean2 = applicationContext.getBean(DeptController.class);
    System.out.println(bean2);

    //根据bean的名称 及 类型获取
    DeptController bean3 = applicationContext.getBean("deptController", DeptController.class);
    System.out.println(bean3);
}
```

#### Bean作用域

**在spring容器启动时就被初始化**

**singleton**: 容器内同名称的bean只有一个实例(单例, 默认)

**prototype**: 每次使用该bean时会创建新实例

@Scope配置作用域(大多数Bean都是单例的)	@Lazy延迟初始化,延迟到第一次使用的时候

获取Bean对象

`@Test
    public void testScope(){
        for (int i = 0; i < 10; i++) {
            DeptController deptController = applicationContext.getBean(DeptController.class);
            System.out.println(deptController);
        }
    }`

### 第三方Bean

要管理的Bean对象来自第三方,要用@Bean注解

保证启动类的纯粹性, 将第三方Bean对象集中管理 用@Configuration注解声明一个配置类

```java
@Configuration //配置类
public class CommonConfig {
    //声明第三方bean
    @Bean //将当前方法的返回值对象交给IOC容器管理, 成为IOC容器bean
          //通过@Bean注解的name/value属性指定bean名称, 如果未指定, 默认是方法名
    public SAXReader reader(DeptService deptService){
        System.out.println(deptService);
        return new SAXReader();
    }
}
```

**附:  @Component及衍生注解和@Bean的使用场景?**

项目自定义使用@Component及其衍生注解		引入的第三方使用@Bean注解

## Spring

![](C:\Users\冯\Desktop\凌睿(图片勿移)\spring.jpg)

Spring Boot是Spring Framework的子框架

#### 核心: 

**起步依赖**(Maven的依赖传递)

**自动配置**: 在Spring容器启动后,一些配置类,Bean对象会自动存入IOC容器中,不用手动声明,只用依赖注入就好

​	方案一: @ComponentScan 组件扫描	@ComponentScan("com.example", "com.itheima") **注**: 要加上当前的包,第三方会覆盖目前的包, 使用繁琐,性能低

​	方案二:  @Import导入的类会被Spring加载到IOC容器中

​		导入普通类    配置类    ImportSelector接口实现类	@EnableXxxx注解,封装@Import注解

![](C:\Users\冯\Desktop\凌睿(图片勿移)\创建注解.png)

**@SpringBootApplication**

​	@ComponentScan 组件扫描,默认扫描当前引导类所在包及其子包

​	@EnableAutoConfiguration 实现自动化配置的核心注解------->封装@Import,  指定ImportSelector方法的实现类,该方法的返回值代表给IOC容器管理Bean对象

​	@SpringBootConfiguration 声明配置类

### 自动化配置原理(有条件)

父注解@Conditional

​	@ConditionalOnClass: 判断环境中有无对应字节码文件,才会注册到IOC容器

​	@ConditionalOnMissingBean: 判断环境中没有对应的Bean,才会注册到IOC容器

​	@ConditionalOnProperty: 若配置环境中有对应属性和值,才会注册到IOC容器.

### 自定义starter

定义一些公共组件,将组件封装为SpringBoot的starter

![](C:\Users\冯\Desktop\凌睿(图片勿移)\自定义starter.jpg)



## Hash

安全散列算法(SHA), 密码散列函数, 可计算出一个数字消息所对应到的,长度固定的字符串.



### 对称加密

加密和解密用同一个密钥

常用算法: DES, 3DES, Blowfish, IDEA



### 非对称加密

加密时使用了两个密钥，加密和解密过程中分别使用不同的密钥，这两个密钥分别为“公钥”和“私钥”，想要正常完成加密解密过程，就必须配对使用，而在使用过程中，“公钥”是公开的，“私钥”则必须有发送人保密，同时只能由持有人所有。

常用算法: RSA, ECC....



### sql注入

web应用对用户输入数据的合法性判断不严,通过操作修改SQL语句,在post/get表单,输入域名或请求的查询字符串中插入SQL命令,即在URL中插入恶意的SQL语句并执行



### sql数据的存储路径

C:\ProgramData\MySQL\MySQL Server 8.0\data









