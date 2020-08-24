# springcloud-eureka-server
## 1.pom.xml引入jar包
```java
        <properties>
		    <java.version>1.8</java.version>
		    <spring-cloud.version>Hoxton.SR7</spring-cloud.version>
	    </properties>
        <dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
		</dependency>
```
## 2.@EnableEurekaServer，在启动类中添加，开启eureka服务
```java
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringcloudEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaServerApplication.class, args);
	}

}
```
## 3.application.properties引入配置账号密码
```java
server.port=8888

#eureka实例主机名称
eureka.instance.hostname=master

#关闭eureka的客户端行为:注册服务
eureka.client.registerWithEureka=false
#关闭eureka的客户端行为:订阅服务
eureka.client.fetchRegistry=false
#eureka注册中心地址
eureka.client.serviceUrl.defaultZone=http://${eureka.instance.hostname}:${server.port}/eureka/
```
## 4.访问localhost:8888
![Image text](https://github.com/JustShowTime/springcloud-demo/raw/master/images/day1-step1.png)
