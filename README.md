新建数据库和数据库信息：

```java
/*
SQLyog Ultimate v11.42 (64 bit)
MySQL - 5.6.21 : Database - mybatisdb
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mybatisdb` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `mybatisdb`;

/*Table structure for table `items` */

DROP TABLE IF EXISTS `items`;

CREATE TABLE `items` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `pic` varchar(50) DEFAULT NULL,
  `createtime` date DEFAULT NULL,
  `detail` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=141 DEFAULT CHARSET=utf8;

/*Data for the table `items` */

insert  into `items`(`id`,`name`,`price`,`pic`,`createtime`,`detail`) values (1,'中兴手机III',3333,'phone.jpg','2021-09-14','非常耐用,good'),(2,'红米电视888',10000,'58072422Ndd7e66c4.jpg','2018-11-10','faaafa'),(3,'TCL电视444',4000,'s156.jpg','2018-09-09','ssss'),(32,'联想电脑777',5000,'g693.jpg','2018-09-09','sss'),(33,'联想电脑55',5000,'s156.jpg','2018-09-09','sss'),(34,'华为电脑2323',5000,'g693.jpg','2020-01-08','sss'),(39,'Java考试A卷333',123,'ad20.jpg','2017-10-01','ss'),(40,'联想电脑421',8000,'61Z58PICgN6.jpg','2018-09-09','好'),(43,'联想电脑009',5000,'61Z58PICgN6.jpg','2018-09-09','sss'),(44,'测试商品0001',999,'ad20.jpg','2018-09-09','sss'),(45,'小米电视4S',4000,'leaveProcess.png','2019-09-09','fsdfsfd'),(46,'小米电视5S',5000,'58072422Ndd7e66c4.jpg','2019-09-09','sfsaf'),(47,'小米电视8S',4000,'baoxiaoprocess.png','2019-09-09','sdfas'),(48,'联想909090',4000,'58072422Ndd7e66c4.jpg','2019-09-09','Ok'),(49,'dsfdsf',4000,'abc.jpg','2019-09-09','sfsf'),(50,'iphone11',7000,'xx.jpg','2019-01-01','ddd'),(51,'iphone11ddddd',7000,'xx.jpg','2019-01-01','ddd'),(53,'联想2222222',4000,'24332.jpg','2019-09-09','耐 用，very good'),(54,'联想7777',4000,'HelloProcess.png','2019-09-09','可有可无'),(55,'小米电脑',5000,'xiaomi.jpg','2019-09-09','ssss'),(56,'小米电脑002',5000,'58072422Ndd7e66c4.jpg','2019-09-10','ssdfs'),(57,'联想_ajax01',5000,'xiaomi.jpg','2019-09-10','sdsafsafsafasf'),(58,'联想_ajax02',4000,'xiaomi.jpg','2019-09-10','sdsafsafsafasf'),(59,'联想_ajax03',4000,'xiaomi.jpg','2019-09-10','sdsafsafsafasf'),(60,'联想_ajax04',4000,'xiaomi.jpg','2019-09-10','sdsafsafsafasf'),(61,'联想_ajax06',4000,'xiaomi.jpg','2019-09-10','sdsafsafsafasf'),(62,'小米电视kkk',5000,'ddd.jpg','2019-03-07','adsfasfd'),(64,'大米电视hsdsdf',1100,'ddd.jpg','2019-11-09','very bad'),(66,'黑米手44机',1800,'ccc.jpg','2019-03-07','我试试'),(67,'白米手机',999999999,'ccc.jpg','2019-03-07','我试试'),(68,'绿米手机',999999999,'ccc.jpg','2019-03-07','略略略'),(74,'小米电视hh',5000,'cc.jpg','2019-11-10','good'),(75,'小米手机99',5000,'58072422Ndd7e66c4.jpg','2018-11-10','very good'),(76,'小米手机44',4000,'58072422Ndd7e66c4.jpg','2018-11-10','good'),(77,'小米手机33',3000,'banner2.jpg','2019-11-10','good'),(78,'OPPO001',3000,'cc.jpg','2019-09-09','very good'),(79,'测试商品口罩01',5,'baoxiaoprocess.png','2019-09-10','good'),(85,'小米测试0001',3000,'123.jpg','2018-11-10','sss'),(86,'小米测试0001',3000,'123.jpg','2018-11-10','sss'),(88,'测试产品',222,'xxx.jpg','2020-06-07','好'),(89,'华为荣耀v30',3000,'xxx.jpg','2020-06-08','faaafa'),(95,'Nokia',90,'00570812c74cfb75.jpg','2019-11-10','safdsaf'),(109,'iphone12',6000,'xxx.jpg','2020-11-10','very good'),(111,'康师傅牛肉面2',5,'xx.jpg','2021-04-10','very good'),(122,'华为电视',6000,'xxx.jpg','2021-01-10','very good'),(123,'康师傅牛肉面',5,'xx.jpg','2021-07-12','good'),(124,'荣耀P50',3000,'58072422Ndd7e66c4.jpg','2018-11-10','very good'),(130,'李宁体育用品',500,'lining.jpg','2021-11-04','very good'),(139,'康师傅牛肉面III',5,'xx.jpg','2021-07-12','very good'),(140,'华为电视2022514',5000,'58072422Ndd7e66c4.jpg','2018-11-10','very good');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

```

新建item-restful-web模块：

在pom.xml中（在模块的pom.xml文件中）：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.2.6.RELEASE</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <artifactId>item-restful-web</artifactId>

    <properties>
        <maven.compiler.source>8</maven.compiler.source>
        <maven.compiler.target>8</maven.compiler.target>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <dependency>
            <groupId>org.mybatis.spring.boot</groupId>
            <artifactId>mybatis-spring-boot-starter</artifactId>
            <version>1.3.2</version>
        </dependency>

        <dependency>
            <groupId>com.github.pagehelper</groupId>
            <artifactId>pagehelper-spring-boot-starter</artifactId>
            <version>1.2.3</version>
            <exclusions>
                <exclusion>
                    <groupId>org.mybatis.spring.boot</groupId>
                    <artifactId>mybatis-spring-boot-starter</artifactId>
                </exclusion>
            </exclusions>
        </dependency>

        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <scope>runtime</scope>
        </dependency>

        <!--集成druid连接池-->
        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>druid-spring-boot-starter</artifactId>
            <version>1.1.10</version>
        </dependency>

        <!-- MyBatis 生成器 -->
        <dependency>
            <groupId>org.mybatis.generator</groupId>
            <artifactId>mybatis-generator-core</artifactId>
            <version>1.3.7</version>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
            <exclusions>
                <exclusion>
                    <groupId>org.junit.vintage</groupId>
                    <artifactId>junit-vintage-engine</artifactId>
                </exclusion>
            </exclusions>
        </dependency>

    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <version>2.2.6.RELEASE</version>
            </plugin>
        </plugins>
    </build>

</project>
```

在resources文件夹下的generator.properties下：

```properties
jdbc.driverClass=com.mysql.jdbc.Driver
jdbc.connectionURL=jdbc:mysql://localhost:3306/auctiondb?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai
jdbc.userId=root
jdbc.password=123456
```

在generatorConfig.xml文件下，做如下配置：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE generatorConfiguration
        PUBLIC "-//mybatis.org//DTD MyBatis Generator Configuration 1.0//EN"
        "http://mybatis.org/dtd/mybatis-generator-config_1_0.dtd">

<generatorConfiguration>
    <properties resource="generator.properties"/>
    <context id="MySqlContext" targetRuntime="MyBatis3" defaultModelType="flat">
        <property name="beginningDelimiter" value="`"/>
        <property name="endingDelimiter" value="`"/>
        <property name="javaFileEncoding" value="UTF-8"/>
        <!-- 为模型生成序列化方法-->
        <plugin type="org.mybatis.generator.plugins.SerializablePlugin"/>
        <!-- 为生成的Java模型创建一个toString方法 -->
        <plugin type="org.mybatis.generator.plugins.ToStringPlugin"/>
        <!--生成mapper.xml时覆盖原文件-->
        <plugin type="org.mybatis.generator.plugins.UnmergeableXmlMappersPlugin" />
        
        <commentGenerator type="com.web.items.CommentGenerator">
            <!-- 是否去除自动生成的注释 true：是 ： false:否 -->
            <property name="suppressAllComments" value="true"/>
            <property name="suppressDate" value="true"/>
            <property name="addRemarkComments" value="true"/>
        </commentGenerator>

        <jdbcConnection driverClass="${jdbc.driverClass}"
                        connectionURL="${jdbc.connectionURL}"
                        userId="${jdbc.userId}"
                        password="${jdbc.password}">
            <!--解决mysql驱动升级到8.0后不生成指定数据库代码的问题-->
            <property name="nullCatalogMeansCurrent" value="true" />
        </jdbcConnection>

        <javaModelGenerator targetPackage="com.web.items.pojo" targetProject="item-restful-web\src\main\java"/>

        <sqlMapGenerator targetPackage="com.web.items.mapper" targetProject="item-restful-web\src\main\resources"/>

        <javaClientGenerator type="XMLMAPPER" targetPackage="com.web.items.mapper"
                             targetProject="item-restful-web\src\main\java"/>
        <table tableName="items"/>
        <!--生成全部表tableName设为%
        <table tableName="%">
            <generatedKey column="id" sqlStatement="MySql" identity="true"/>
        </table>
        -->
    </context>
</generatorConfiguration>
```

在项目的com.web.items.CommentGenerator下：

```java
package com.web.items;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.internal.DefaultCommentGenerator;
import org.mybatis.generator.internal.util.StringUtility;

import java.util.Properties;

/**
 * 自定义注释生成器
 * Created by macro on 2018/4/26.
 */
public class CommentGenerator extends DefaultCommentGenerator {
    private boolean addRemarkComments = false;

    /**
     * 设置用户配置的参数
     */
    @Override
    public void addConfigurationProperties(Properties properties) {
        super.addConfigurationProperties(properties);
        this.addRemarkComments = StringUtility.isTrue(properties.getProperty("addRemarkComments"));
    }

    /**
     * 给字段添加注释
     */
    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable,
                                IntrospectedColumn introspectedColumn) {
        String remarks = introspectedColumn.getRemarks();
        //根据参数和备注信息判断是否添加备注信息
        if (addRemarkComments && StringUtility.stringHasValue(remarks)) {
            addFieldJavaDoc(field, remarks);
        }
    }

    /**
     * 给model的字段添加注释
     */
    private void addFieldJavaDoc(Field field, String remarks) {
        //文档注释开始
        field.addJavaDocLine("/**");
        //获取数据库字段的备注信息
        String[] remarkLines = remarks.split(System.getProperty("line.separator"));
        for (String remarkLine : remarkLines) {
            field.addJavaDocLine(" * " + remarkLine);
        }
        addJavadocTag(field, false);
        field.addJavaDocLine(" */");
    }

}
```

在项目的com.web.items.Generator下（直接运行该main文件，生成pojo和mapper包下的文件）：

```java
package com.web.items;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 用于生产MBG的代码
 * Created by macro on 2018/4/26.
 */
public class Generator {
    public static void main(String[] args) throws Exception {
        //MBG 执行过程中的警告信息
        List<String> warnings = new ArrayList<String>();
        //当生成的代码重复时，覆盖原代码
        boolean overwrite = true;
        //读取我们的 MBG 配置文件
        InputStream is = Generator.class.getResourceAsStream("/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(is);
        is.close();

        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        //创建 MBG
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        //执行生成代码
        myBatisGenerator.generate(null);
        //输出警告信息
        for (String warning : warnings) {
            System.out.println(warning);
        }
    }
}
```

新建com.web.items.service.ItemsService接口：

```java
package com.web.items.service;

import com.web.items.pojo.Items;

import java.util.List;

public interface ItemsService {

    public List<Items> findAll();

    public Items findOne(int id);

    public void addItems(Items items);

    public void updateItems(Items items);

    public void deleteItems(int id);
}
```

com.web.items.service.impl.ItemsServiceImpl实现该接口：

```java
package com.web.items.service.impl;

import com.web.items.mapper.ItemsMapper;
import com.web.items.pojo.Items;
import com.web.items.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapper itemsMapper;

    @Override
    public List<Items> findAll() {
        return itemsMapper.selectByExample(null);
    }

    @Override
    public Items findOne(int id) {
        return itemsMapper.selectByPrimaryKey(id);
    }

    @Override
    public void addItems(Items items) {
        itemsMapper.insert(items);
    }

    @Override
    public void updateItems(Items items) {
        itemsMapper.updateByPrimaryKey(items);
    }

    @Override
    public void deleteItems(int id) {
        itemsMapper.deleteByPrimaryKey(id);
    }
}
```

新建com.web.items.controller.ItemsController类：

```java
package com.web.items.controller;

import com.web.items.pojo.Items;
import com.web.items.pojo.RespBean;
import com.web.items.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// @RestController 包含了 @ResponseBody 和 @Controller 注解
// @ResponseBody 把 Java 类型的数据转换成 json 类型数据
@RestController
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @GetMapping("findAll")
    public List<Items> findAll() {
        return itemsService.findAll();
    }

    @GetMapping("/findOne/{id}")
    public Items findOne(@PathVariable int id) {
        return itemsService.findOne(id);
    }

    // @RequestBody 把 json 格式转换成 Java 对象
    @PostMapping("/addItems")
    public RespBean addItems(@RequestBody Items items) {
        System.out.println(items.getName());
        System.out.println(items.getDetail());
        try {
            // id会回填到items对象中
            itemsService.addItems(items);
            return RespBean.ok("添加成功",items);
        } catch (Exception e) {
            e.printStackTrace();
            return RespBean.err("添加失败");
        }
    }

    @PutMapping("/updateItems")
    public RespBean updateItems(@RequestBody Items items) {
        System.out.println(items.getName());
        System.out.println(items.getDetail());
        try {
            // id会回填到items对象中
            itemsService.updateItems(items);
            return RespBean.ok("修改成功",items);
        } catch (Exception e) {
            e.printStackTrace();
            return RespBean.err("修改失败");
        }
    }
    @DeleteMapping("/deleteItems/{id}")
    public RespBean deleteItems(@PathVariable int id) {
        try {
            // id会回填到items对象中
            itemsService.deleteItems(id);
            return RespBean.ok("删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return RespBean.err("删除失败");
        }
    }
    
}
```

新建com.web.items.ItemsWebApp类：

```java
package com.web.items;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * springboot启动类
 */
@SpringBootApplication
@MapperScan("com.web.items.mapper")
public class ItemsWebApp {
    public static void main(String[] args) {
        SpringApplication.run(ItemsWebApp.class,args);
    }
}
```

在src/main/resources/下新建application.yml文件：

```yml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/mybatisdb?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai
    username: root
    password: 123456
pagehelper:
  helper-dialect: mysql
  reasonable: true
```

点击运行即可！