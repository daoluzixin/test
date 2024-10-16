# XML映射文件

XML映射文件的名字与Mapper接口名称一样,并将XML映射文件和Mapper接口放在相同包下  **同包同名**

XML的namespace属性和Mapper接口全限定名一致

XML映射文件的sql语句的id与Mapper接口中的方法名一致,保持返回类型一致

resource文件下放置配置文件

mybatis插件

**简单操作使用注解,复杂的用XML映射文件配置**