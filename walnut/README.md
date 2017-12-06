# walnut
* 该项目是所有项目的基础模块致力于开发通用型的可插拔式微服务架构，该项目主要包含如下模块

|模块名|父级依赖|模块说明|  
|--    |-------      |--      |
|walnut-parent|无|管理springcloud的parent以及pom依赖的版本|
|walnut-dependencies|无|管理pom的依，可以将项目中通用的依赖统一放到此处管理，包括entity，service，controller等的依赖|
|walnut-common| walnut-parent|提供基础类和接口，封装了一些工具类和通用rest接口的抽象类|
|walnut-fastdfs|walnut-parent|提供fastdfs相关基础配置|
|walnut-data-kafka|walnut-parent|提供kafka相关基础配置|
|walnut-data-es|walnut-parent|提供es相关基础配置|
|walnut-data-hbase|walnut-parent|提供hbase相关基础配置|

#### 说明

 - 项目中若要引用以上，只需在所需项目中引入相关依赖即可。  
如：  
 - 在walnut-robot-ms的web中引入fastdfs模块，只需要在web中的pom.xml中添加
```
<dependency>
    <groupId>com.innstack.walnut</groupId>
    <artifactId>walnut-fastdfs</artifactId>
    <version>${walnut-robot.version}</version>
</dependency>
```
 - 若walnut-robot-ms项目中引用的模块需要在多个模块中都使用
如：  
在service和web中都使用，那么可以考虑在其父项目walnut-robto-ms中引入
