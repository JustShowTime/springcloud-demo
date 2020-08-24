# springcloud-eureka-server
## 1.pom.xml引入jar包
```java
        <properties>
		    <java.version>1.8</java.version>
		    <spring-cloud.version>Hoxton.SR7</spring-cloud.version>
	    </properties>
        <dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
		</dependency>
```
## 2.@EnableEurekaClient，在启动类中添加，开启eureka客户端服务
```java
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringcloudEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaServerApplication.class, args);
	}

}

```
## 3.application.properties引入配置账号密码
```java
server.port=8801
spring.application.name=springcloud-eureka-client
eureka.client.serviceUrl.defaultZone=http://localhost:8888/eureka/
```
## 4.访问localhost:8888
![Image text](https://github.com/JustShowTime/springcloud-demo/raw/master/images/day2-step1.png)
