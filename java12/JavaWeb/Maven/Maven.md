# Maven

## 作用

1.依赖管理:  快捷管理项目依赖的资源(jar包),避免版本冲突

2.同一项目结构: 提供标准,统一的项目结构(所有开发工具都是通用的)

3.项目构建: 跨平台的自动化项目构建(windows,linux)



## 简介

![](C:\Users\冯\Desktop\凌睿(图片勿移)\Maven简介.jpg)

私服: 由公司搭建, 镜像站,   阿里云



## Maven坐标

是自愿的唯一标识,可唯一定位资源

在pom.xml下

groupld: 定义当前Maven项目隶属的组织名称(通常为域名反写, eg: com.itheima)

artifactld: 定义当前Maven项目名称(通常为模块名称)

version: 定义当前项目版本号

刷新后,引入最新加入的坐标	若本地库中没有,会连接远程仓库下载

查询坐标信息:  mvnrepository.com下载

```
<dependencies>
    <dependency>
        <groupId>ch.qos.logback</groupId>
        <artifactId>logback-classic</artifactId>
        <version>1.2.10</version>
    </dependency>
</dependencies>
```

### 依赖传递

直接依赖

简介依赖: 被依赖的资源依赖其他资源,当前项目简介依赖其他资源

排除依赖: 主动断开依赖的资源, 被排除的资源无需指定版本   	<exclusions>

### 生命周期

3套生命周期(最终由插件执行任务)

clean: 清理工作	default: 核心工作,  eg. 编译,测试,打包	site: 生成报告,发布站点

**同一套生命周期中,运行后面的阶段时,前面的阶段会运行.**

![](C:\Users\冯\Desktop\凌睿(图片勿移)\项目的生命周期.jpg)

## 分模块设计与开发

将项目按照功能拆分成若干个子模块,方便项目的管理维护,扩展和模块间的相互调用

**注意**: 先针对模块功能进行设计,再进行编码



## 继承

与java的继承相似

**实现**: <parent><parent>

jar: 普通模块打包, springboot基本都为jar包(内嵌tomcat运行)

war: 普通web程序,要部署在外部tomcat服务器中进行

pom: 父工程或聚合工程,不写代码,只进行依赖管理

<relativePath></relativePath> 

<packaging>打包方式 

**注**: 父子的依赖版本不同,以子工程为准

![](C:\Users\冯\Desktop\凌睿(图片勿移)\继承关系的实现.jpg)

### 版本锁定

在父工程的pom中通过<dependencyMangagement>统一管理依赖版本

子工程引入时,无需指定版本号,在父工程中统一管理

#### 自定义属性/引用属性

![](C:\Users\冯\Desktop\凌睿(图片勿移)\版本锁定.jpg)



## 聚合

将多个模块组成一个整体,同时进行项目构建

父工程<modules></modules>	**注**: 聚合时,会自动根据模块间的依赖关系设置构建顺序,与配置书写位置无关

![](C:\Users\冯\Desktop\凌睿(图片勿移)\继承与聚合.jpg)

![](C:\Users\冯\Desktop\凌睿(图片勿移)\聚合.jpg)

## 私服

特殊的远程仓库,架设在局域网内部的仓库服务,解决团队内的资源共享与资源同步问题

依赖查找顺序:	本地仓库------>私服-------->中央仓库

![](C:\Users\冯\Desktop\凌睿(图片勿移)\Maven私服资源的上传.jpg)

SNAPSHOT快照版本------私服SNAPSHOT仓库,开发中的版本

RELEASE发行版本-------私服RELEASE仓库,功能趋于稳定(**默认**)

 